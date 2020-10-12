package com.example.lab4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
public class activity_web extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Button button4;
        button4 = (Button) findViewById(R.id.button4);
        final EditText editTextWeb = (EditText) findViewById(R.id.editTextTextPersonName1);
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String str;
                        str = editTextWeb.getText().toString();
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + str + ".com"));
                           startActivity(intent);
                    }
                }
        );
    }
}
