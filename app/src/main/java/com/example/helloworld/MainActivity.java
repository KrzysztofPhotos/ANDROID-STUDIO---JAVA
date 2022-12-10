package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: complete this

        EditText plainText = findViewById(R.id.plainText);
        plainText.getText().toString();

    }

    public void onBtnClick (View view) {
        TextView txtHello = findViewById(R.id.txtMessage);
        txtHello.setText("Hello");
    }

}