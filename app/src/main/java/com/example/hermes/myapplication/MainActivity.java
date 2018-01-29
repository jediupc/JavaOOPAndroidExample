package com.example.hermes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        final EditText nombre_et = (EditText) findViewById(R.id.nombre_id);
        final EditText sueldo_et = (EditText) findViewById(R.id.sueldo_id);

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (nombre_et.getText().toString().equals("") || sueldo_et.getText().toString().equals("") ){
                            Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        Integer bid = rg.getCheckedRadioButtonId();
                        switch (bid) {
                            case R.id.id_becario:
                                Becario bec = new Becario(nombre_et.getText().toString(),Double.parseDouble(sueldo_et.getText().toString()));
                                Toast.makeText(getApplicationContext(), "Becario " + bec.nombre + " sueldo neto " + bec.sueldoNeto(), Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.id_consultor:
                                Consultor con = new Consultor(nombre_et.getText().toString(),Double.parseDouble(sueldo_et.getText().toString()));
                                Toast.makeText(getApplicationContext(), "Consultor " + con.nombre + " sueldo neto " + con.sueldoNeto(), Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.id_directivo:
                                Directivo dir = new Directivo(nombre_et.getText().toString(),Double.parseDouble(sueldo_et.getText().toString()));
                                Toast.makeText(getApplicationContext(), "Directivo " + dir.nombre + " sueldo neto " + dir.sueldoNeto(), Toast.LENGTH_SHORT).show();
                                break;
                        }

                    }
                }
        );
    }
}
