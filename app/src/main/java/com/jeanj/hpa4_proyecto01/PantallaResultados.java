package com.jeanj.hpa4_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaResultados extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultados);
        Button bttback;
        TextView v1,v2,v3,tvwinner;
        ImageView img1,img2,img3;
        bttback=findViewById(R.id.bttback);
        v1=findViewById(R.id.votos1);
        v2=findViewById(R.id.votos2);
        v3=findViewById(R.id.votos3);
        tvwinner=findViewById(R.id.tvwinner);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);


        String c1 = String.valueOf(Datos.cont1);
        String c2 = String.valueOf(Datos.cont2);
        String c3 = String.valueOf(Datos.cont3);
        String totvot = String.valueOf(Datos.vot1=(Datos.cont1*100.00)/Datos.tot);
        String totvot2 = String.valueOf((Datos.vot2=(Datos.cont2*100.00)/Datos.tot));
        String totvot3 = String.valueOf((Datos.vot3=(Datos.cont3*100.00)/Datos.tot));

        v1.setText("Votos: "+c1+" Procentaje: "+String.format("%.2f",Datos.vot1)+"%");
        v2.setText("Votos: "+c2+" Procentaje: "+String.format("%.2f",Datos.vot2)+"%");
        v3.setText("Votos: "+c3+" Procentaje: "+String.format("%.2f",Datos.vot3)+"%");

        if (Datos.cont1 > Datos.cont2) {
            if (Datos.cont1 > Datos.cont3) {
                tvwinner.setText("Ganador(a) Actual: " + Datos.cand1);
            } else {
                tvwinner.setText("Ganador(a) Actual: " + Datos.cand3);
            }
        } else if (Datos.cont2 > Datos.cont3) {
            if(Datos.cont2>Datos.cont1){
                tvwinner.setText("Ganador(a) Actual: " + Datos.cand2);
            }
            else{
                tvwinner.setText("Ganador(a) Actual: " + Datos.cand1);
            }

        }
        else if (Datos.cont3 > Datos.cont1) {
            if(Datos.cont3>Datos.cont2){
                tvwinner.setText("Ganador(a) Actual: " + Datos.cand3);
            }
            else{
                tvwinner.setText("Ganador(a) Actual: " + Datos.cand2);
            }

        }
        else {
            tvwinner.setText("Ganador(a) Actual: No hay ganador aún");
        }



        bttback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuPrincipal.class);
                startActivity(intent);
            }
        });
    }
}