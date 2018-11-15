package com.wordpress.mortuza99.interviewassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cseBtn = findViewById(R.id.cse);

        cseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CSE Activity
                startActivity(new Intent(getApplicationContext(),Details.class));
            }
        });


    }
}
