package com.example.aula03_trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextIdade;
    Button btnValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        btnValidar = (Button) findViewById(R.id.btnValidar);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarIdade();
            }
        });
    }

    public void validarIdade(){
        Integer idade = Integer.parseInt(editTextIdade.getText().toString());
        String resultado = "";
        if(idade >= 18){
            resultado = "Está Permitido!";
        }else{
            resultado = "Sem Permissão!";
        }

        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("idadeResult",resultado);
        startActivity(intent);
    }
}