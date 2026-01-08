package com.example.abhisheksample;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button btnLogin;
    private Button btnGoTORegister;
    private EditText edtUserName;
    private EditText edtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);
        btnGoTORegister = findViewById(R.id.btn_register);
        edtUserName = findViewById(R.id.edt_user_name);
        edtPassword = findViewById(R.id.edt_pwd);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button click
                String userName = edtUserName.getText().toString();
                String pwd =edtPassword.getText().toString();

                if(userName.isEmpty()){
                    //user name empty
                    Toast.makeText(MainActivity.this, "UserName empty", Toast.LENGTH_SHORT).show();
                    Log.i("Login","User");
                    return;
                }


                if(pwd.isEmpty()){
                    //user name empty
                    Toast.makeText(MainActivity.this, "PWD empty", Toast.LENGTH_SHORT).show();
                    return;
                }


                Toast.makeText(MainActivity.this, "UserName:"+userName+"PWD:"+pwd, Toast.LENGTH_SHORT).show();


            }
        });


        btnGoTORegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent newActivity = new Intent(MainActivity.this,RegistrationActivity.class);
                startActivity(newActivity);
            }
        });


    }
}