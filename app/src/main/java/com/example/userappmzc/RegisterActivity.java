package com.example.userappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    String getName,getMob,getEmail,getUser,getPass,getConferm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.mob) ;
        ed3=(EditText)findViewById(R.id.email);
        ed4=(EditText) findViewById(R.id.username);
        ed5=(EditText) findViewById(R.id.password);
        ed6=(EditText) findViewById(R.id.confirm);
        b1=(AppCompatButton)findViewById(R.id.reg);
        b2=(AppCompatButton)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getMob=ed2.getText().toString();
                getEmail=ed3.getText().toString();
                getUser=ed4.getText().toString();
                getPass=ed5.getText().toString();
                getConferm=ed6.getText().toString();
                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getMob,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getUser,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getConferm,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "koii", Toast.LENGTH_SHORT).show();
            }
        });
    }
}