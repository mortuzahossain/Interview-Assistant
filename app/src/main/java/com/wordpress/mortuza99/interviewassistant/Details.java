package com.wordpress.mortuza99.interviewassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Details extends AppCompatActivity {

    Button cBtn,cppBtn;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        cBtn = findViewById(R.id.buttonc);
        cppBtn = findViewById(R.id.buttoncpp);


        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // GO to Question Activity
                Intent i = new Intent(getApplicationContext(),Questions.class);
                data = getString(R.string.cquestions);
                i.putExtra("STRING_ID",data);
                startActivity(i);
            }
        });


    }
}
