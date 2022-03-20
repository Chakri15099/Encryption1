package com.example.encryption1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button nav_send_message;
    Button nav_encypt;
    Button nav_decrypt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setTitle("Home");

        nav_send_message = findViewById(R.id.newmessageBTN);
        nav_encypt = findViewById(R.id.encryptBTN);
        nav_decrypt = findViewById(R.id.decrpytBTN);


        nav_send_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent  (HomeActivity.this,SendActivity.class);
                startActivity(i);
            }
        });

        nav_encypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent  (HomeActivity.this,EncryptActivity.class);
                startActivity(intent);
            }
        });

        nav_decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent(HomeActivity.this,DecryptActivity.class);
                startActivity(intentOne);
            }
        });
    }
}