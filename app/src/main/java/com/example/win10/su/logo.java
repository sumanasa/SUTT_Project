package com.example.win10.su;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_logo);
        getSupportActionBar().hide();
        Launcher Launcher = new Launcher();
        Launcher.start();
    }

    private class Launcher extends Thread{
        public void run(){
            try{
                sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(logo.this,MainActivity.class);
            startActivity(intent);
            logo.this.finish();
        }
    }

}

