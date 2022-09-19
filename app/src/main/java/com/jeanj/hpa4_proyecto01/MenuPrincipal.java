package com.jeanj.hpa4_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;


public class MenuPrincipal extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Button bttRV;
        Button bttVV;
        Button bttSalir;

        bttRV = findViewById(R.id.bttRV);
        bttVV = findViewById(R.id.bttVV);
        bttSalir = findViewById(R.id.bttSalirMP);

        //Si el usuario desea realizar una votación
        bttRV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Comparar de que el usuario no haya hecho una votación.

                if (Datos.voto.get(Datos.pos)=="0")
                {
                    Intent intent = new Intent(view.getContext(), PantallaVotacion.class);
                    startActivityForResult(intent, 0);
                }
                else
                {
                    Datos.tot=Datos.tot+1;
                    Context context = view.getContext();
                    CharSequence text = "Lo sentimos, ya usted ha realizado un voto";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        //Si el usuario quiere ver las votaciones
        bttVV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Se debe agregar primero la actividad
                //Comparar de que el usuario haya hecho una votación.

                if (Datos.voto.get(Datos.pos)=="0")
                {
                    Context context = view.getContext();
                    CharSequence text = "Lo sentimos, usted no ha votado";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else
                {
                    Intent intent = new Intent(view.getContext(), PantallaResultados.class);
                    startActivityForResult(intent, 0);
                }

            }
        });

        //Si el usuario desea salir del menú principal
        bttSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}