package com.example.encryption1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {
    Button register;
    private EditText usernameEditText;
    private EditText EmailEditText;
    private EditText PasswordEditText;
    private EditText ConfirmEditText;
    private Button RegisterBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        this.setTitle("User Registration");
        usernameEditText=findViewById(R.id.regusernameTV);
        EmailEditText=findViewById(R.id.emailTV);
        PasswordEditText=findViewById(R.id.regpasswordTV);
        ConfirmEditText=findViewById(R.id.confirmpswdTV);
        RegisterBtn=findViewById(R.id.registerBTN);



        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build());
        register = findViewById(R.id.registerBTN);
        register.setOnClickListener(new View.OnClickListener()
        {

            Button registerBTN = findViewById(R.id.registerBTN);
        registerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usernameEditText.getText().toString()!=null && EmailEditText.getText().toString()!=null && PasswordEditText.getText().toString()!=null && confirmpswdTV.getText().toString)
                    ParseUser user = new ParseUser();
                user.setUsername(usernameEditText.getText().toString());
                user.setEmail(EmailEditText.getText().toString());
                user.setPassword(PasswordEditText.getText().toString());
                user.setConfirm(confirmpswdTV.getText().toString());


            }
        }
            Intent int_nav = new Intent(RegistrationActivity.this,LoginActivity.class);
            startActivity(int_nav);
        }
    });

}
    public void displayToast(View v) {
        Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
    }
}