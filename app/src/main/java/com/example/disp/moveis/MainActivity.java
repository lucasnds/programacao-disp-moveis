package com.example.disp.moveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btSair = findViewById(R.id.button4);
        btSair.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button4){
            finish();
        }
        /*if(view.getId() == R.id.button3){

        }
        if(view.getId() == R.id.button){

        }*/
    }
}