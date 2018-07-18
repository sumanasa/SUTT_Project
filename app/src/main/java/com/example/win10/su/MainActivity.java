package com.example.win10.su;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userid;
    EditText pswd;
    Button loginbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        userid = (EditText) findViewById(R.id.username);
        pswd = (EditText) findViewById(R.id.password);
        loginbtn = (Button) findViewById(R.id.loginButton);
        loginbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String a = userid.getText().toString();
                String b = pswd.getText().toString();

                if (a.equals("user") && b.equals("su@123")) {
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "Incorrect User Name or Password", Toast.LENGTH_SHORT).show();


            }
        });

        configuresigninButton();
    }

    private void configuresigninButton() {
        Button signinButton = (Button) findViewById(R.id.signinButton);
        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, signup.class));
            }
        });
    }
}




