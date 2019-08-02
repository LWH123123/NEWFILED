package com.example.damin.myeigthtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: 我是李武辉");
        Toast.makeText(this, "李武辉::::::", Toast.LENGTH_SHORT).show();
    }

    private static final String TAG = "MainActivity";
}
