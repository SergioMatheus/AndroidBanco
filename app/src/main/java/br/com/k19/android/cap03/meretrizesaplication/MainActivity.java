package br.com.k19.android.cap03.meretrizesaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butao = (Button) findViewById(R.id.button);
    }

    public void metodu(View v) {
        Intent i = new Intent(this,CinemationActivity.class);
        startActivity(i);
    }
}

