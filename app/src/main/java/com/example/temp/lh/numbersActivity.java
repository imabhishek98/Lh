package com.example.temp.lh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);



        ArrayList<c_dataType> x = new ArrayList<c_dataType>();
        x.add(new c_dataType("one", "ek"));
        x.add(new c_dataType("two", "do"));
        x.add(new c_dataType("three", "teen"));
        x.add(new c_dataType("four", "chaar"));
        x.add(new c_dataType("five", "panch"));
        x.add(new c_dataType("six", "cheh"));
        x.add(new c_dataType("seven", "saat"));






        ListView rootView = (ListView) findViewById(R.id.numbers_linear_layout);

        customAdapter c_adapter_object = new customAdapter(this, x);
        rootView.setAdapter(c_adapter_object);
    }
}
