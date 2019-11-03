package com.example.realsib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_name, map;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name = findViewById(R.id.tv_name);
        button = findViewById(R.id.button);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        //HashMap<String, String> hashMap = (HashMap<String, String>) intent.getSerializableExtra("key");
        // Log.i("uuid",hashMap.get("uuidKey"));
        // Log.i("major",hashMap.get("major"));
        // Log.i("minor",hashMap.get("minor"));
        tv_name.setText(userName);
        // map.setText(hashMap.get("uuidKey"));
    }
}
