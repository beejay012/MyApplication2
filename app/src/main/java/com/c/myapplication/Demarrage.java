package com.c.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Demarrage extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demarrage);
    }

    public void randomMe(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);
        Intent ListeIntent = new Intent(this, MainActivity.class);
        mp.start();
        startActivity(ListeIntent);
    }
}
