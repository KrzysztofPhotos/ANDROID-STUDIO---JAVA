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



    }

//    public void onBtnClick (View view) {
//        TextView txtHello = findViewById(R.id.txtMessage);
//        EditText plainText = findViewById(R.id.plainText);
//        plainText.getText().toString();
//        txtHello.setText("Hello " + plainText.getText().toString());
//
//
//    }

    public void onSubmitBtnClick (View view) {
        EditText firstName = findViewById(R.id.firstName);

        EditText lastName = findViewById(R.id.lastName);

        EditText email = findViewById(R.id.email);


        TextView outputFirstName = findViewById(R.id.outputFirstName);
        TextView outputLastName = findViewById(R.id.outputLastName);
        TextView outputEmail = findViewById(R.id.outputEmail);

        outputFirstName.setText("First name: " + firstName.getText().toString());
        outputLastName.setText("Last name: " + lastName.getText().toString());
        outputEmail.setText("Email: " + email.getText().toString());
    }
}