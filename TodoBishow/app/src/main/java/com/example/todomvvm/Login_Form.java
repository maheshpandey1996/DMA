package com.example.todomvvm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;

public class Login_Form extends AppCompatActivity {
    public TextView username;
    public TextView password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);
        //getSupportActionBar().setTitle("Login Form");
        initViews();

    }

    private void initViews() {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
       }

    public void btn_signupForm(View view) {
        startActivity(new Intent(getApplicationContext(), Signup_Form.class));
    }

    public void login(View view) {
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                Toast.makeText(this,"Success",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, MainActivity.class));

        }else{
                password.setBackgroundColor(Color.RED);
                Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show();


    }




}}
