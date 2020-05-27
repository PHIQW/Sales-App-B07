package com.b07.salesandroid.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.b07.database.helper.DatabaseAndroidHelper;
import com.b07.salesandroid.R;
import com.b07.users.User;

public class AccountChoose extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("AccountChoose");
        Intent intent = getIntent();
        setContentView(R.layout.account_choose);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        Button selectAccount = findViewById(R.id.selectAccount);
        selectAccount.setOnClickListener(this);
    }

    public void onClick(View view){
        Spinner option = findViewById(R.id.avaliableAccounts);
//        String text = getResources().getStringArray(DatabaseAndroidHelper.getUserActiveAccountIdsHelper(user));
    }
}
