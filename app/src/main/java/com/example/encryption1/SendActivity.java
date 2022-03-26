package com.example.encryption1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        this.setTitle("Send message");


    }
    public void displayToast(View v) {
        Toast.makeText(SendActivity.this, "Message sent successfully", Toast.LENGTH_SHORT).show();
    }
    }