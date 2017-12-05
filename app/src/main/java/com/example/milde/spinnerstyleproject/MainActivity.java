package com.example.milde.spinnerstyleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.belaege,
                        R.layout.layout_simple_spinner_item
                );
        adapter.setDropDownViewResource(R.layout.layout_simple_spinner_dropdown_item);

        sp.setAdapter(adapter);

    }
}
