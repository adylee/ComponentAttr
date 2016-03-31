package com.example.administrator.componentattr;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ComponentName comp = new ComponentName(MainActivity.this,
                        SecondActivity.class);
                Intent intent  = new Intent();
                intent.setComponent(comp);
                startActivity(intent);
            }
        });


    }
}
