package com.jeanj.hpa4_proyecto01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etcedula;
    Button bttIS;
    int val, i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //A partir de aquí vendría la iniciación de las cédulas y votación
        //PD: Solo agregué 10 para realizar las pruebas, solo quedaría agregar las que faltan
        Datos.listacedula.add("88-8888-888888");
        Datos.listacedula.add("08-0944-000327");
        Datos.listacedula.add("03-0740-001394");
        Datos.listacedula.add("20-0053-004282");
        Datos.listacedula.add("08-0943-001867");
        Datos.listacedula.add("08-0937-000503");
        Datos.listacedula.add("08-0952-002444");
        Datos.listacedula.add("08-0943-000012");
        Datos.listacedula.add("08-0986-000549");
        Datos.listacedula.add("08-0957-001827");
        Datos.listacedula.add("08-0940-001311");


        Datos.listanombres.add("El admin");
        Datos.listanombres.add("ARROCHA, EDWIN");
        Datos.listanombres.add("BRENES, MICHELLE");
        Datos.listanombres.add("BUSTAMANTE , EDDY");
        Datos.listanombres.add("CABALLERO, ALEJANDRA");
        Datos.listanombres.add("CHIARI, GABRIEL");
        Datos.listanombres.add("CORONADO, KEVIN");
        Datos.listanombres.add("DELGADO, LUIS");
        Datos.listanombres.add("DUDLEY, MARC");
        Datos.listanombres.add("FERNANDEZ, DIEGO");
        Datos.listanombres.add("FLORES, MARÍA");

        Datos.voto.add("1");
        for (i=0; i<10; i++)
        {
            Datos.voto.add("0");
        }


        bttIS = findViewById(R.id.bttIS);
        etcedula= findViewById(R.id.etcedula);

        bttIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val= 0;
                String ced = etcedula.getText().toString();

                if (Datos.listacedula.contains(ced))
                {
                    Datos.cedval = ced;
                    Datos.pos = Datos.listacedula.indexOf(ced);
                    Context context = view.getContext();
                    CharSequence text = "Bienvenido " +Datos.listanombres.get(Datos.pos);
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent intent = new Intent(view.getContext(), MenuPrincipal.class);
                    startActivityForResult(intent, 0);
                }
                else
                {
                    Context context = view.getContext();
                    CharSequence text = String.valueOf(Datos.pos);//"Cédula incorrecta. Ingrese de nuevo.";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }




}