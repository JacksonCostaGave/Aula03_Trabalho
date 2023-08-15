package com.example.aula03_trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = (TextView) findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        String resultado = intent.getStringExtra("idadeResult");
        textViewResult.setText(resultado);

    }
}