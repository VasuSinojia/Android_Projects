package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class LoginActivity extends AppCompatActivity {
    private EditText et_name;
    private EditText et_email;
    private EditText et_password;
    private Button btn_login;
    CoordinatorLayout coordinatorLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);



        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName = et_name.getText().toString();
                String getEmail = et_email.getText().toString();
                String Expn =
                        "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                if (getEmail.matches(Expn) && getEmail.length() > 0) {
//
                    startActivity(new Intent(LoginActivity.this, MainActivity.class).putExtra("a",getName).putExtra("b",getEmail));
                } else {
                    Toast.makeText(LoginActivity.this, "Please Enter Valid Email", Toast.LENGTH_SHORT).show();
                }
            }


        });
    }
}





