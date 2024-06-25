package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class quiz2 extends AppCompatActivity {
    ImageButton ib1, ib2, ib3, ib4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ib1 = (ImageButton) findViewById(R.id.imageButton1);
        ib2 = (ImageButton) findViewById(R.id.imageButton2);
        ib3 = (ImageButton) findViewById(R.id.imageButton3);
        ib4 = (ImageButton) findViewById(R.id.imageButton4);
    }
    public void imagebutton1onClick(View target) {
        Toast.makeText(getApplicationContext(), "오답",
                Toast.LENGTH_SHORT).show();
    }
    public void imagebutton2onClick(View target) {
        Toast.makeText(getApplicationContext(), "정답",
                Toast.LENGTH_SHORT).show();
    }
    public void imagebutton3onClick(View target) {
        Toast.makeText(getApplicationContext(), "오답",
                Toast.LENGTH_SHORT).show();
    }
    public void imagebutton4onClick(View target) {
        Toast.makeText(getApplicationContext(), "오답",
                Toast.LENGTH_SHORT).show();
    }
}
