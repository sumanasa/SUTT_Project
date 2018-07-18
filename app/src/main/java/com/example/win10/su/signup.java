package com.example.win10.su;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText userid,name;
    EditText pswd,cnfrmpswd;
    Button signinbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name = (EditText) findViewById(R.id.editText3);
        userid = (EditText) findViewById(R.id.editText);
        pswd = (EditText) findViewById(R.id.editText2);
        cnfrmpswd = (EditText) findViewById(R.id.editText4);
        signinbtn = (Button) findViewById(R.id.signupButton);
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = pswd.getText().toString();
                String b = cnfrmpswd.getText().toString();
                String c = userid.getText().toString();
                String d = name.getText().toString();

                if ((a!=b)) {
                    Toast.makeText(getApplicationContext(), "Passwords must Match", Toast.LENGTH_SHORT).show();
                }
                else if (c.equals("")||d.equals("")||a.equals("")) {
                    Toast.makeText(getApplicationContext(), "Do not leave fields empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Created Account Successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(signup.this, Main2Activity.class);
                startActivity(intent);}


                configuresignupButton();
            }

            private void configuresignupButton() {
                Button signinButton = (Button) findViewById(R.id.signupButton);
                signinButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(signup.this, Main2Activity.class));
                    }
                });
            }
        });
    }
}
