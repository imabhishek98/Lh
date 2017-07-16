package com.example.temp.lh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbersMainPageTextBox = (TextView) findViewById(R.id.numbers);

        numbersMainPageTextBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, numbersActivity.class);
                startActivity(i);

            }
        });


    }


    public void openV(View v) {
        Intent i = new Intent(this, numbersActivity.class);
        startActivity(i);

    }

}
