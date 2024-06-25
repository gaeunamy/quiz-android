package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class quiz1 extends AppCompatActivity {
    Button btn;
    RadioButton radio1, radio2, radio3, radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radio1 = (RadioButton) findViewById(R.id.radioButton1);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        radio4 = (RadioButton) findViewById(R.id.radioButton4);

        btn = (Button) findViewById(R.id.button);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton1:
                if (checked)
                break;
            case R.id.radioButton2:
                if (checked)
                break;
            case R.id.radioButton3:
                if (checked)
                break;
            case R.id.radioButton4:
                if (checked)
                break;
        }

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (radio4.isChecked() == true)
                    Toast.makeText(getApplicationContext(), "정답입니다", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "오답입니다", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
