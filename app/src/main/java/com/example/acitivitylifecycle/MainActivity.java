package com.example.acitivitylifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("demo", "OnResume ->Activity is Running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("demo", "OnDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("demo", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("demo", "Onstart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("demo", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("demo", "onStop");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("demo", "Oncreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
