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
double c1=0,c2=0,c3=0;
        Button bttback;
TextView v1,v2,v3;
bttback=findViewById(R.id.bttback);
v1=findViewById(R.id.votos1);
v2=findViewById(R.id.votos2);
v3=findViewById(R.id.votos3);
for(int i=0;i<38;i++){
    if(Datos.voto(i)=="1"){
        c1+=1;
    }
    if(Datos.voto(i)=="2"){
        c2+=1;
    }
    if(Datos.voto(i)=="1"){
        c3+=1;
    }
}

        v1.setText(" Num votos "+Datos.voto.get(0)+" Num votos "+Datos.numvoto);
        v2.setText(" Num votos "+Datos.voto.get(1)+" Num votos "+Datos.numvoto);
        v3.setText(" Num votos "+Datos.voto.get(2)+" Num votos "+Datos.numvoto);

        bttback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuPrincipal.class);
                startActivity(intent);

            }
        });
    }
}