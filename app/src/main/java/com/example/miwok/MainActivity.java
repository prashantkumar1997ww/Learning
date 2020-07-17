package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = (TextView) findViewById(R.id.number);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent numberIntent = new Intent(MainActivity.this,Number.class);
                startActivity(numberIntent);

            }
        });

        TextView color = (TextView) findViewById(R.id.color);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent colorIntent = new Intent(MainActivity.this,Color.class);
                startActivity(colorIntent);
            }
        });


        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent familyIntent = new Intent(MainActivity.this,Family.class);
                startActivity(familyIntent);
            }
        });


        TextView phrase = (TextView) findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent phraseIntent = new Intent(MainActivity.this,Phrases.class);
                startActivity(phraseIntent);
            }
        });

    }
}
