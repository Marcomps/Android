package com.example.aplicacion_continentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MenuPrincipal extends AppCompatActivity {
   private Button btnAceptar, btnRegresar;
   private RadioButton rdoRios,rdoLagos,rdoVolcanes,
    rdoContAmerica,rdoContEuropa,rdoContAsia,rdoContAfrica,rdoContOceania;
   private CheckBox chkRios, chkLagos,chkVolcanes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        rdoContAmerica = findViewById(R.id.rdoContAmerica);
        rdoContEuropa = findViewById(R.id.rdoContEuropa);
        rdoContAsia = findViewById(R.id.rdoContAsia);
        rdoContAfrica = findViewById(R.id.rdoContAfrica);
        rdoContOceania = findViewById(R.id.rdoContOceania);

        rdoRios = findViewById(R.id.rdoRios);
        rdoLagos = findViewById(R.id.rdoLagos);
        rdoVolcanes = findViewById(R.id.rdoVolcanes);

        btnAceptar = findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VerificarBotonesSeleccionados();
            }
        });

    }

   public  void VerificarBotonesSeleccionados()
   {
        if((rdoContAmerica.isChecked()==true && rdoRios.isChecked()==true)||(rdoContAmerica.isChecked()==true && rdoLagos.isChecked()==true)||(rdoContAmerica.isChecked()==true && rdoVolcanes.isChecked()==true))
        {
            Intent intent = new Intent(MenuPrincipal.this, RespSing.class);
            startActivity(intent);
        }

       if((rdoContEuropa.isChecked()==true && rdoRios.isChecked()==true)||(rdoContEuropa.isChecked()==true && rdoLagos.isChecked()==true)||(rdoContEuropa.isChecked()==true && rdoVolcanes.isChecked()==true))
       {
           Intent intent = new Intent(MenuPrincipal.this, RespSing.class);
           startActivity(intent);
       }

       if((rdoContAsia.isChecked()==true && rdoRios.isChecked()==true)||(rdoContAsia.isChecked()==true && rdoLagos.isChecked()==true)||(rdoContAsia.isChecked()==true && rdoVolcanes.isChecked()==true))
       {
           Intent intent = new Intent(MenuPrincipal.this, RespSing.class);
           startActivity(intent);
       }

       if((rdoContAfrica.isChecked()==true && rdoRios.isChecked()==true)||(rdoContAfrica.isChecked()==true && rdoLagos.isChecked()==true)||(rdoContAfrica.isChecked()==true && rdoVolcanes.isChecked()==true))
       {
           Intent intent = new Intent(MenuPrincipal.this, RespSing.class);
           startActivity(intent);
       }

       if((rdoContOceania.isChecked()==true && rdoRios.isChecked()==true)||(rdoContOceania.isChecked()==true && rdoLagos.isChecked()==true)||(rdoContOceania.isChecked()==true && rdoVolcanes.isChecked()==true))
       {
           Intent intent = new Intent(MenuPrincipal.this, RespSing.class);
           startActivity(intent);
       }

   }
}