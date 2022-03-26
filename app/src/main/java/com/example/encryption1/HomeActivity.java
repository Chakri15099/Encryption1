package com.example.encryption1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeActivity extends AppCompatActivity {

    Button nav_send_message;
    Button nav_encypt;
    Button nav_decrypt;
    private RecyclerView recyclerview;
    private RecyclerAdapter adapter;
    private ArrayList<String>userNameList = new ArrayList<>();
    private ArrayList<String>inboxList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setTitle("Home");

        nav_send_message = findViewById(R.id.newmessageBTN);
        nav_encypt = findViewById(R.id.encryptBTN);
        nav_decrypt = findViewById(R.id.decrpytBTN);
        recyclerview = findViewById(R.id.diplaymessageRV);

        recyclerview.setLayoutManager(new LinearLayoutManager(HomeActivity.this));
        userNameList.add("User A");
        userNameList.add("User B");
        userNameList.add("User C");
        inboxList.add("From John " +
                "(XXX)-XXX-XXXX" +
                "John@cloud.com");
        inboxList.add("From Sam " + "(XXX)-XXX-XXXX" + "Sam08@outook.com");
        inboxList.add("From Andrea " + "(XXX)-XXX-XXXX" + "andrea@gmail.com");
        adapter = new RecyclerAdapter(userNameList,inboxList,HomeActivity.this);
                recyclerview.setAdapter(adapter);





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