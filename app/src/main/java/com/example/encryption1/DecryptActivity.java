package com.example.encryption1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DecryptActivity extends AppCompatActivity {

    Button nav_new_message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);

        nav_new_message = findViewById(R.id.sendBTN);


        nav_new_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent  (DecryptActivity.this,SendActivity.class);
                startActivity(intent);
            }
        });
    }
}