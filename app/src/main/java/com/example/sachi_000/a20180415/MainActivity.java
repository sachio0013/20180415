package com.example.sachi_000.a20180415;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button1.setText("ボタン");


     }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            showTimePickerDialog();
               }
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute){
                      if(hourOfDay >= 2 && hourOfDay <=9) {
                        TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("おはよう");
                    } else if(hourOfDay >= 10 && hourOfDay <= 17){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("こんにちは");
                    } else {
                        TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("こんばんは");
                    }

                    }
                },
                7, // 初期値（時間）
                0,  // 初期値（分）
                true);
        timePickerDialog.show();
    }
}