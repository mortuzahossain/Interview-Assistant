package com.wordpress.mortuza99.interviewassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Questions extends AppCompatActivity {

    TextView questionShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        String data = getIntent().getStringExtra("STRING_ID");

        questionShow = findViewById(R.id.showQuestion);

        questionShow.setText(data);


    }
}
