package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),quiz1.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),quiz2.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),quiz3.class);
                startActivity(intent);
            }
        });

    }

    /*public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    Intent intent = new Intent(getApplicationContext(), quiz1.class);
                    startActivity(intent);
                    finish();
                }
            case R.id.checkBox2:
                if (checked) {
                    Intent intent = new Intent(getApplicationContext(), quiz2.class);
                    startActivity(intent);
                    finish();
                }
            case R.id.checkBox3:
                if (checked) {
                    Intent intent = new Intent(getApplicationContext(), quiz3.class);
                    startActivity(intent);
                    finish();
                }
        }
    }*/
}