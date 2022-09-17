package com.jeanj.hpa4_proyecto01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etcedula;
    Button bttIS;
    int val, i, j, pos;
    //El orden del array es: 0: cédula, 1: Nombre, 2: Votación
    String [][] usuarios = new String[41][3];
    ArrayList<String> listacedula = new ArrayList<String>();
    ArrayList<String> listanombres = new ArrayList<String>();
    ArrayList<String> voto = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //A partir de aquí vendría la iniciación de las cédulas y votación
        listacedula.add("8-888-8888");
        listanombres.add("El admin");
        voto.add("0");

        bttIS = findViewById(R.id.bttIS);
        etcedula= findViewById(R.id.etcedula);
        bttIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val= 0;
                String ced = etcedula.getText().toString();

                if (listacedula.contains(ced))
                {
                    pos = listacedula.indexOf(ced);
                    Context context = view.getContext();
                    CharSequence text = "Bienvenido";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else
                {
                    Context context = view.getContext();
                    CharSequence text = String.valueOf(pos);//"Cédula incorrecta. Ingrese de nuevo.";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }




}