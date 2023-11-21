package com.example.partyup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Invitado extends AppCompatActivity {

    public void goToListaInvitado(View view) {
        Intent intent = new Intent(this, ListaInvitado.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitado);
    }
}