package com.b07.salesandroid.models;

import static java.lang.Integer.parseInt;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.b07.users.Account;

public class CustomerModel {

  private Account account;

  public CustomerModel(Account account){
    this.account = account;
  }
  public boolean addItem(int itemId, int quantity, Context context){

    return false;
  }

  public boolean removeItem(int itemId, int quantity, Context context){
    return false;
  }

  public boolean viewTotalPrice(String title, Context context){
    AlertDialog.Builder builder = new AlertDialog.Builder(context);
    builder.setTitle(title);
    LinearLayout inputs = new LinearLayout(context);
    inputs.setOrientation(LinearLayout.VERTICAL);
    // Set up the input
    final TextView price = new TextView(context);
    // Specify the type of input expected
    price.setText(String.format("$%s", ""));
    inputs.addView(price);
    builder.setView(inputs);

    // Set up the buttons
    builder.setNegativeButton("Exit", new OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {
        dialog.cancel();
      }
    });
    builder.show();
    return false;
  }

  public boolean checkout(){
    return false;
  }

  public void toastUser(String message, Context context) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
  }
}
