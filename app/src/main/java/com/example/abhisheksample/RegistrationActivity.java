package com.example.abhisheksample;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText edtUserName,editEmail,edtPwd;
    private Button btnSave;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edtUserName = findViewById(R.id.edt_user_name);
        editEmail = findViewById(R.id.edtemail);
        edtPwd = findViewById(R.id.edt_pwd);
        btnSave = findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtUserName.getText().toString();
                String email = editEmail.getText().toString();
                String pwd = edtPwd.getText().toString();


                SharedPreferences sharedPref = RegistrationActivity.this.getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("username", name);
                editor.putString("email", email);
                editor.putString("pwd", pwd);

                // Apply the changes
                editor.apply();



            }
        });

    }
}
