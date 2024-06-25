package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class quiz3 extends AppCompatActivity {
    private TextView textview;
    private EditText eText;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        eText = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
        textview = (TextView) findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (eText.getText().toString().equals(textview.getText().toString()))
                    Toast.makeText(getApplicationContext(), "정답입니다!",
                            Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "틀렸습니다!",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }
}

