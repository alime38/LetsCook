package de.beispiel.letscook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /*Weiter-Button*/
    private Button weiterButton;

    /*Für Spinner*/
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;


    /*Diese Methode wird immer aufgerufen, wenn eine Activity gestartet wird.*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Spinner*/
        spinner = (Spinner)findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.saison,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+" selected",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /*Weiter-Button*/
        weiterButton = (Button) findViewById(R.id.weiter);
        weiterButton.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        int ce = view.getId();

        if(ce == R.id.weiter) {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        }

    }
}

