package com.example.encryption1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DecryptActivity extends AppCompatActivity {
    Button nav_enew_message;
    Button nav_sendn_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);
        this.setTitle("Decryption");

        nav_enew_message = findViewById(R.id.enewmsgBTN);
        nav_sendn_message = findViewById(R.id.dsendBTN);
        nav_enew_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent01 = new Intent(DecryptActivity.this, EncryptActivity.class);
                startActivity(intent01);
            }

        });
        nav_sendn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent02 = new Intent(DecryptActivity.this, SendActivity.class);
                startActivity(intent02);
            }

        });
    }
}