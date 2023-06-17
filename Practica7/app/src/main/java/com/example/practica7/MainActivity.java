package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.practica7.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.eqRecycler.setLayoutManager(new LinearLayoutManager(this));

        EqAdapter adapter = new EqAdapter();
        binding.eqRecycler.setAdapter(adapter);
        List<Earthquake> eqList = null;
        Earthquake earthquake = new Earthquake("1","CDMX",19.837,0L,-92.8237,19.7322);
        eqList.add(earthquake);
        adapter.submitList(eqList);
    }
}