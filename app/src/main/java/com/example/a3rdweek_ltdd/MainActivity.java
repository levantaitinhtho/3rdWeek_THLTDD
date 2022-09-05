package com.example.a3rdweek_ltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private Button buttonSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Activity1");

        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSend = findViewById(R.id.btnSendData);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
    }

    private void nextActivity() {
        String strEmail = editTextEmail.getText().toString().trim();
        AppUlti.mEmail = strEmail;
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        editTextEmail.setText(AppUlti.mEmail);
    }
}