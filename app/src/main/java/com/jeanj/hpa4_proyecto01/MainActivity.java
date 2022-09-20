package com.jeanj.hpa4_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        Datos.listacedula.add("08-0863-001620");
        Datos.listacedula.add("08-0964-000691");
        Datos.listacedula.add("08-0954-001126");
        Datos.listacedula.add("08-1039-001537");
        Datos.listacedula.add("08-0925-001168");
        Datos.listacedula.add("08-0940-001505");
        Datos.listacedula.add("08-0938-000925");
        Datos.listacedula.add("03-0743-002493");
        Datos.listacedula.add("0E-0008-169755");
        Datos.listacedula.add("08-0971-001811");
        Datos.listacedula.add("08-0940-000408");
        Datos.listacedula.add("08-0937-001640");
        Datos.listacedula.add("08-0939-001578");
        Datos.listacedula.add("08-0942-001406");
        Datos.listacedula.add("06-0722-000724");
        Datos.listacedula.add("08-0941-001215");
        Datos.listacedula.add("08-0962-001218");
        Datos.listacedula.add("08-0941-000924");
        Datos.listacedula.add("08-0980-002414");
        Datos.listacedula.add("03-0742-002055");
        Datos.listacedula.add("08-0942-001192");
        Datos.listacedula.add("08-0904-001189");
        Datos.listacedula.add("08-0959-000857");
        Datos.listacedula.add("08-0964-001554");
        Datos.listacedula.add("08-1066-001018");
        Datos.listacedula.add("08-1055-000701");
        Datos.listacedula.add("08-0970-000242");
        Datos.listacedula.add("03-0752-001461");
        Datos.listacedula.add("03-0745-000950");

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
        Datos.listanombres.add("FRAZER, DONALDO");
        Datos.listanombres.add("GASCÓN, MIGUEL");
        Datos.listanombres.add("GONZALEZ, ANDREW");
        Datos.listanombres.add("HERNÁNDEZ, VALERIE");
        Datos.listanombres.add("HO, TOMMY");
        Datos.listanombres.add("JIMÉNEZ, JEAN");
        Datos.listanombres.add("LOO, FELIPE");
        Datos.listanombres.add("MCDONALD, LISSETH");
        Datos.listanombres.add("MONAGAS, JESUS");
        Datos.listanombres.add("MORENO, DIANA");
        Datos.listanombres.add("MORENO, GERARDO");
        Datos.listanombres.add("NAVARRO, JUAN");
        Datos.listanombres.add("NAVAS, JULIO");
        Datos.listanombres.add("PINZÓN, ANEL");
        Datos.listanombres.add("PINZÓN, JANIEL");
        Datos.listanombres.add("QIU, ANTONIO");
        Datos.listanombres.add("RICORD, CARLOS");
        Datos.listanombres.add("RIOS, DAVID");
        Datos.listanombres.add("RODRIGUEZ, SERGIO");
        Datos.listanombres.add("SALAS, ZULIXA");
        Datos.listanombres.add("SAMANIEGO, LUIS");
        Datos.listanombres.add("SÁNCHEZ, ARY");
        Datos.listanombres.add("SANTOS, DIONISIO");
        Datos.listanombres.add("THOMAS, BRYAN");
        Datos.listanombres.add("TUÑÓN, CARLOS");
        Datos.listanombres.add("VITALE, GENESIS");
        Datos.listanombres.add("ZENG, FERNANDO");
        Datos.listanombres.add("ZHONG, CARLOS");
        Datos.listanombres.add("GUERRA, EIMY");


        Datos.voto.add("1");
        for (i=0; i<39; i++)
        {
            Datos.voto.add("0");
        }


        bttIS = findViewById(R.id.bttback);
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
                    CharSequence text = "Cédula incorrecta. Ingrese de nuevo.";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }




}