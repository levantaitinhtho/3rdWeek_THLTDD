package com.example.a3rdweek_ltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText editTextEmail;
    private Button buttonUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Activity2");

        editTextEmail = findViewById(R.id.editTextEmail);
        buttonUpdate = findViewById(R.id.btnUpdateData);
        editTextEmail.setText(AppUlti.mEmail);

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backActivity();
            }
        });
    }

    private void backActivity() {
        String strEmailUpdate = editTextEmail.getText().toString().trim();
        AppUlti.mEmail = strEmailUpdate;
        finish();
    }
}