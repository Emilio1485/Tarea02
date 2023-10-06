package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Menu principal
        //setContentView(R.layout.menu_principal);

        //Inciar Sesion
        setContentView(R.layout.iniciar_sesion);
    }
}