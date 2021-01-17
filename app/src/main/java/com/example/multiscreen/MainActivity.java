package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.parshva.firstmultiscreen.order";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void placeOrder(View view)
    {


        Intent  intent = new Intent(this,orderActivity.class);
        EditText edittext1 = findViewById(R.id.editText1);
        EditText edittext2 = findViewById(R.id.editText2);
        EditText edittext3 = findViewById(R.id.editText3);

        String message = edittext1.getText().toString() + " , " +
                        edittext2.getText().toString() + " & " +
                        edittext3.getText().toString() + "   Order taken successfully..";


        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}