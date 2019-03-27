package com.c.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Demarrage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demarrage);
    }

    public void randomMe(View view){
        Intent randomIntent = new Intent(this, MainActivity.class);
        startActivity(randomIntent);
    }
}
