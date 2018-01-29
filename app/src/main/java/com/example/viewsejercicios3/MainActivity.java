package com.example.viewsejercicios3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //CREAR LAS VARIABLES DE LAS VISTAS QUE VAMOS A IDENTIFICAR

    TextView tvPrincipal, tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //IDENTIFICAMOS LAS VISTAS

        tvPrincipal = (TextView)findViewById(R.id.tvPrincipal);
        tvResultado = (TextView)findViewById(R.id.tvResultado);








    }// ON CREATE

    public void clickicono1(View view){
        tvPrincipal.setText("Has clicado el icnono 1");
    }
    public void clickicono2(View view){
        tvPrincipal.setText("Has clicado el icnono 2");
    }
    public void clickicono3(View view){
        tvPrincipal.setText("Has clicado el icnono 3");
    }

    public void clickIconoFinal(View view){
        String etiquetaSeleccionada = tvPrincipal.getText().toString();
        tvResultado.setText(etiquetaSeleccionada);



    }













}//FIN MAINACTIVITY
