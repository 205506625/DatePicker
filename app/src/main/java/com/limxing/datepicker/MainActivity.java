package com.limxing.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.limxing.datepicker.DatePicker.DatePickerView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.text);
    }
    public void click(View view){
        DatePickerView pickerView=new DatePickerView(MainActivity.this, new DatePickerView.DatePickerListener() {
            @Override
            public void dateChange(String string) {
                text.setText(string);
            }

            @Override
            public void finish(String string) {
                text.setText(string);

            }
        });
        pickerView.setFromYearAndToYear(1900,2016);
pickerView.initDate(2016,3,9);
        pickerView.show();
    }
}
