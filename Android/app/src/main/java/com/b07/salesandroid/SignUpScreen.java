package com.b07.salesandroid;

import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SignUpScreen extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);


    setTitle("Sign Up");
    setContentView(R.layout.signup);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main_menu, menu);
    return true;
  }
}
