package com.b07.salesandroid.views;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;


import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.b07.salesandroid.R;

public class ShoppingCartView extends AppCompatActivity{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //DatabaseDriverAndroid db = new com.b07.database.DatabaseDriverAndroid(this);

    setTitle("Shopping Cart");
    if (getSupportActionBar() != null) {
      getSupportActionBar().setDisplayShowHomeEnabled(true);
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    setContentView(R.layout.shopping_cart);


    /* Example from Android guide: https://developer.android.com/guide/topics/ui/declaring-layout.html#FillingTheLayout
     *
     * */
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
