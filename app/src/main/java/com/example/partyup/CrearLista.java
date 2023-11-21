package com.example.partyup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CrearLista extends AppCompatActivity {

    public void goToListaHost(View view) {
        Intent intent = new Intent(this, ListaHost.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearlista);
    }
}