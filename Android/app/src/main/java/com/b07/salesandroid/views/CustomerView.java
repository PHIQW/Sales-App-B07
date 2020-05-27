package com.b07.salesandroid.views;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.b07.salesandroid.R;
import com.b07.salesandroid.controllers.CustomerButtonController;
import com.b07.users.User;

public class CustomerView extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setTitle("Customer View");
    User customer = (User) getIntent().getSerializableExtra("User");

    if (getSupportActionBar() != null) {
      getSupportActionBar().setDisplayShowHomeEnabled(true);
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    setContentView(R.layout.customer_view);

    //TODO get proper account number
    CustomerButtonController customerButtonController = new CustomerButtonController(this, 1,
        customer);

    Button cart = findViewById(R.id.viewCart);
    cart.setOnClickListener(customerButtonController);
    Button addItem = findViewById(R.id.addItems);
    addItem.setOnClickListener(customerButtonController);
    Button removeItem = findViewById(R.id.removeItems);
    removeItem.setOnClickListener(customerButtonController);
    Button viewTotalPrice = findViewById(R.id.totalPrice);
    viewTotalPrice.setOnClickListener(customerButtonController);
    Button refund = findViewById(R.id.refund);
    refund.setOnClickListener(customerButtonController);
    Button checkout = findViewById(R.id.checkout);
    checkout.setOnClickListener(customerButtonController);

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main_menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.menuItemOne:
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("TEMP TEST")
            .setCancelable(false)
            .setPositiveButton("Yes", new OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                    TextView text = (TextView) findViewById(R.id.welcomeAdmin);
                    text.setText("Testing 123!");
                  }
                }
            )
            .setNegativeButton("No", new OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                  }
                }
            );
        builder.show();
        break;
      default:
        this.finish();
    }
    return true;
  }
}
