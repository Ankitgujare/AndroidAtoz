package com.example.acitivitylifecycle._02navigationbasics.xmlway;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.acitivitylifecycle.R;
import com.example.acitivitylifecycle.databinding.ActivityBBinding;

public class ActivityB extends AppCompatActivity {

    private ActivityBBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityBBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Navigation
            }
        });


    }
}