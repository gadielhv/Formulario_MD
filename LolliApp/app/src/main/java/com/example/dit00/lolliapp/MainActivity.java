package com.example.dit00.lolliapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    RadioButton r1,r2;
    RadioGroup rg1;
    EditText nombre;
    EditText edad;
    Button boton1;
    TextView textView;
    Spinner lista;
    String[] datos = {"Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imprimir:
                startActivity(new Intent(this, MainActivity2Activity.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Campos de texto
        nombre=(EditText)findViewById(R.id.nombre);
        edad=(EditText)findViewById(R.id.edad);
        boton1=(Button)findViewById(R.id.imprimir);
        boton1.setOnClickListener(this);


        //Radio Buton para sexo
        r1=(RadioButton)findViewById(R.id.sexo);
        r2=(RadioButton)findViewById(R.id.sexo1);
        rg1=(RadioGroup)findViewById(R.id.rg1);
        rg1.setOnCheckedChangeListener(this);

        //Lista del Mes despleglable
        lista = (Spinner) findViewById(R.id.lista1);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1:
                        String enero;
                        enero=getString(i);
                        Toast to = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to.show();
                        break;
                    case 2:
                        Toast to1 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to1.show();
                        break;
                    case 3:
                        Toast to2 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to2.show();
                        break;
                    case 4:
                        Toast to3 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to3.show();
                        break;
                    case 5:
                        Toast to4 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to4.show();
                        break;
                    case 6:
                        Toast to5 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to5.show();
                        break;
                    case 7:
                        Toast to6 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to6.show();
                        break;
                    case 8:
                        Toast to7 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to7.show();
                        break;
                    case 9:
                        Toast to8 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to8.show();
                        break;
                    case 10:
                        Toast to9 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to9.show();
                        break;
                    case 11:
                        Toast to10 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to10.show();
                        break;
                    case 12:
                        Toast to11 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to11.show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }




    public void onCheckedChanged(RadioGroup arg0, int arg1) {
        if(r1.isChecked()){


        }
    }
}