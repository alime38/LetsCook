package de.beispiel.letscook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    private Button zuruckButton;

    /*Weiter-Button*/
    private Button weiterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        /*Zurück-Button*/
        zuruckButton = (Button) findViewById(R.id.zurueck);
        zuruckButton.setOnClickListener(this);

         /*Weiter-Button*/
        weiterButton = (Button) findViewById(R.id.weiter);
        weiterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();

        /*Weiter nach Activity3*/
        int ce = view.getId();

        if(ce == R.id.weiter) {
            Intent intent = new Intent(Activity2.this, Activity3.class);
            startActivity(intent);
        }
    }
}
