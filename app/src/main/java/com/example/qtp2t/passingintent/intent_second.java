package com.example.qtp2t.passingintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intent_second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_second);

        TextView nameView= (TextView) findViewById(R.id.result_txt);

        nameView.setText(getIntent().getExtras().getString("Username"));
    }
}