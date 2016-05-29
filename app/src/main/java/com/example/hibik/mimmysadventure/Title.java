package com.example.hibik.mimmysadventure;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

    }

    public void button3(View v){
        Intent intent = new Intent(this,ContactUs.class);
        startActivity(intent);

        finish();
    }

}
