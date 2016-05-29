package com.example.hibik.mimmysadventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }

    public void button4(View v) {
        Intent intent = new Intent(this, Title.class);
        startActivity(intent);

        finish();
    }
}
