package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button hgelgl;
    TextView hl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hgelgl = (Button) findViewById(R.id.button1);
        hgelgl.setText("NAx");
        hl = (TextView) findViewById(R.id.textView);
    }
    public void hyi()
    {
        hl.setText("HLJ");
    }
}
