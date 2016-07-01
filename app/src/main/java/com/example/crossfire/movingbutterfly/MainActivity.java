package com.example.crossfire.movingbutterfly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_button);

        Button button1 = (Button)findViewById(R.id.button1);
        if (button1 != null) {
            button1.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,FlyActivity.class);
                    startActivity(intent);
                }
            }));
        }
    }
}
