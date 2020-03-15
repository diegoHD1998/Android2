package com.example.primeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText text1EditText;
    private EditText text2EditText;
    private Button loginEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginEditText=findViewById(R.id.login);

        Log.d("CicleLife", "onCreate");


    }


    public void login(View view) {
        Intent login= new Intent(this,ActivitySecundario.class);
        startActivity(login);
    }
}
