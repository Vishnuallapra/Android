package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = (EditText)findViewById(R.id.idUserName);
        EditText password = (EditText)findViewById(R.id.idPassword);
        Button b1 = (Button)findViewById(R.id.idBtnLogin);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Admin") &&
                        password.getText().toString().equals("Password")) {
                    Toast.makeText(MainActivity.this, "User Verified", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Authentication Failed!", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}