package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class SignupActivity extends AppCompatActivity {
    private EditText fullName;
    private EditText email;
    private EditText phone;
    private EditText password;
    private EditText confPass;
    private TextView signin;
    private Button creatbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signin = (TextView) findViewById(R.id.signinText);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });
        fullName = (EditText) findViewById(R.id.fullName);
        email = (EditText) findViewById(R.id.emailCreate);
        phone = (EditText) findViewById(R.id.phoneNo);
        password = (EditText) findViewById(R.id.passwordCreate);
        confPass = (EditText) findViewById(R.id.confPasswordCreate);
        creatbtn = (Button) findViewById(R.id.createBtn);

        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        final String emailPattern2 = Patterns.EMAIL_ADDRESS.toString();

        creatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEmpty(fullName)){
                    fullName.setError("Full name is required!");
                    fullName.requestFocus();
                }
                else if (isEmpty(email)) {
                    email.setError("E-mail is required!");
                }
                else if(!isEmail(email)){
                    email.setError("E-mail is invalid!");
                    email.requestFocus();
                }
                else if(isEmpty(phone)){
                    phone.setError("Phone no. is required!");
                    phone.requestFocus();
                }
                else if(!isPhone(phone)){
                    phone.setError("Phone no. is invalid!");
                    phone.requestFocus();
                }
                else if(isEmpty(password)){
                    password.setError("Password is required!");
                    password.requestFocus();
                }
                else if(isEmpty(confPass)){
                    confPass.setError("Password confirmation is required!");
                    confPass.requestFocus();
                }
                else if(!password.getText().toString().equals(confPass.getText().toString())){
                    confPass.setError("Password does not matched");
                    confPass.requestFocus();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Sign up successful!", Toast.LENGTH_SHORT).show();
                    openLoginActivity();
                }
            }
        });
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    boolean isEmail(EditText text) {
        return text.getText().toString().trim().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+");
    }

    boolean isPhone(EditText text) {
        return text.getText().toString().trim().matches("\\d{10}");
    }

//    ((\+*)((0[ -]+)*|(91 )*)(\d{12}+|\d{10}+))|\d{5}([- ]*)\d{6}

    public void openLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}