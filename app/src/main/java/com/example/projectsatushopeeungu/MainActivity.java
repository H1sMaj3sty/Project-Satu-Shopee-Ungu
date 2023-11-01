package com.example.projectsatushopeeungu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    String flag;
    TextView count_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count_number=findViewById(R.id.text);
    }
    public void onToast (View view) {
        Toast.makeText(this,"Ajojing ala ala ajojing", Toast.LENGTH_LONG).show();
        if (count >= 75 || count < -1213421) {
            hayoloGimana();
        }
    }

    public void hayoloGimana() {
        count=count*2;
        count_number.setText(Integer.toString(count));
        if (count < -2097780980) {
            flag = "JCTF{how_does_positive_multiplied_by_positive_equal_negative}";
            count_number.setText(flag);
            count_number.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        }
    }
    public void increaseInteger (View view) {
        count++;
        count_number.setText(Integer.toString(count));
    }

}