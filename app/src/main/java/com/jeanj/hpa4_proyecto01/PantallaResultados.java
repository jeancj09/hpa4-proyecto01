package com.jeanj.hpa4_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class PantallaResultados extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultados);
        Button bttback;
        TextView v1,v2,v3;
        bttback=findViewById(R.id.bttback);
        v1=findViewById(R.id.votos1);
        v2=findViewById(R.id.votos2);
        v3=findViewById(R.id.votos3);

        String c1 = String.valueOf(Datos.cont1);
        String c2 = String.valueOf(Datos.cont2);
        String c3 = String.valueOf(Datos.cont3);
        String totvot = String.valueOf((Datos.cont1*100)/Datos.tot);
        String totvot2 = String.valueOf((Datos.cont2*100)/Datos.tot);
        String totvot3 = String.valueOf((Datos.cont3*100)/Datos.tot);

        v1.setText(" Num votos: "+c1+" Procentaje: "+totvot+"%");
        v2.setText(" Num votos: "+c2+" Procentaje: "+totvot2+"%");
        v3.setText(" Num votos: "+c3+" Procentaje: "+totvot3+"%");

        bttback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuPrincipal.class);
                startActivity(intent);
            }
        });
    }
}