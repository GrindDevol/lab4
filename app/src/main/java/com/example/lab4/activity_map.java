package com.example.lab4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activity_map extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Button button6;
        button6 = (Button) findViewById(R.id.button6);
        final EditText editTextMapX = (EditText) findViewById(R.id.editTextPhone3);
        final EditText editTextMapY = (EditText) findViewById(R.id.editTextPhone3_1);
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String strX, strY;
                        strX = editTextMapX.getText().toString();
                        strY = editTextMapY.getText().toString();
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("geo:" + strX + "," + strY));
                        startActivity(intent);
                    }
                }
        );
    }
}