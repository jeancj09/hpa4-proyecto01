package com.jeanj.hpa4_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class PantallaVotacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_votacion);

        RadioButton rbc1, rbc2, rbc3, rbc4, rbc5;
        Button bttVotar;
        ImageView imgcand;

        rbc1 = findViewById(R.id.rbcand1);
        rbc2 = findViewById(R.id.rbcand2);
        rbc3 = findViewById(R.id.rbcand3);
        rbc4 = findViewById(R.id.rbcand4);
        rbc5 = findViewById(R.id.rbcand5);
        bttVotar = findViewById(R.id.bttVotar);
        imgcand = findViewById(R.id.imgcand);
        Datos.numvoto = 0;


        //Con los radioButton se hará un cambio de la imagen
        rbc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgcand.setImageResource(R.drawable.icon_persona); //Se cambia el icon_persona por la imagen de la persona, igual en las demás.
                Datos.numvoto = 1;
            }
        });
        rbc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgcand.setImageResource(R.drawable.icon_persona);
                Datos.numvoto = 2;
            }
        });
        rbc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgcand.setImageResource(R.drawable.icon_persona);
                Datos.numvoto = 3;

            }
        });
        rbc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgcand.setImageResource(R.drawable.icon_persona);
                Datos.numvoto = 4;

            }
        });
        rbc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgcand.setImageResource(R.drawable.icon_persona);
                Datos.numvoto = 5;

            }
        });

        //Aquí se hará la modificación de votación
        bttVotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Datos.voto.set(Datos.pos, String.valueOf(Datos.numvoto));

                Context context = view.getContext();
                CharSequence text = "Votación realizada con éxito.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent intent = new Intent(view.getContext(), MenuPrincipal.class);
                startActivityForResult(intent, 0);

            }
        });


    }
}