package com.example.partyup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToHost(View view) {
        Intent intent = new Intent(this, Host.class);
        startActivity(intent);
    }

    public void goToInvitado(View view) {
        Intent intent = new Intent(this, Invitado.class);
        startActivity(intent);
    }

    public void goToCalendario(View view) {
        Intent intent = new Intent(this, Calendario.class);
        startActivity(intent);
    }
}