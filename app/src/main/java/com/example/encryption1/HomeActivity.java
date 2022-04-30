package com.example.encryption1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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

    FirebaseAuth auth2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setTitle("Home");

        auth2 = FirebaseAuth.getInstance();

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.layout_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_logout){
            auth2.signOut();
            startActivity(new Intent(HomeActivity.this,LoginActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}