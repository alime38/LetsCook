package de.beispiel.letscook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{

        private Button zuruckButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_3);

             /*Zurück-Button*/
            zuruckButton = (Button) findViewById(R.id.zurueck);
            zuruckButton.setOnClickListener(this);
        }

    @Override
    public void onClick(View view) {
        finish();
    }
}