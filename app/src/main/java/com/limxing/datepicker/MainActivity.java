package com.limxing.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.limxing.library.AlertView;
import com.limxing.library.OnConfirmeListener;


public class MainActivity extends AppCompatActivity implements OnConfirmeListener {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
    }

    public void click(View view) {
new AlertView("请选择日期",MainActivity.this,1991,2100,MainActivity.this).show();

    }

    @Override
    public void result(String s) {
        text.setText(s);
    }
}
