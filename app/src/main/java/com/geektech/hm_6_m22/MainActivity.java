package com.geektech.hm_6_m22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnOk;
    private EditText edtEmail, edtPassword;
    private TextView txt1, txtRegister, txtForgot, txtTouch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk = findViewById(R.id.button);
        edtPassword = findViewById(R.id.edit_password);
        edtEmail = findViewById(R.id.edit_text2);
        txtForgot = findViewById(R.id.txt_password);
        txtTouch = findViewById(R.id.txt_touch);
        txtRegister = findViewById(R.id.txt_password1);
        txt1 = findViewById(R.id.txt_password3);

        btnOk.setOnClickListener(view -> {
        if(edtEmail.getText().toString().equals("admin") &&
        edtPassword.getText().toString().equals("admin")){
            btnOk.setVisibility(View.GONE);
            edtPassword.setVisibility(View.GONE);
            edtEmail.setVisibility(View.GONE);
            txt1.setVisibility(View.GONE);
            txtRegister.setVisibility(View.GONE);
            txtTouch.setVisibility(View.GONE);
            txtForgot.setVisibility(View.GONE);
            Toast.makeText(this, "Вы успешно прошли регистрацию!",
                    Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Вы ввели неправильно Email или Password!",
                    Toast.LENGTH_SHORT).show();
        }
        });
    }


}