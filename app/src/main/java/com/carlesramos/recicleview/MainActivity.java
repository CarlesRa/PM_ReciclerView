package com.carlesramos.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.carlesramos.recicleview.model.Country;

public class MainActivity extends AppCompatActivity {
    private Country[] paisos;
    private RecyclerView rvPrincipal;
    private CountryParser parser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parser = new CountryParser(this);
        parser.parse(this);
        paisos = parser.getCountries();
        rvPrincipal = findViewById(R.id.rvPrincipal);
        rvPrincipal.setHasFixedSize(true);
        final CountryAdapter adapter = new CountryAdapter(paisos);
        rvPrincipal.setAdapter(adapter);
        rvPrincipal.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
