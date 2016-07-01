package com.example.crossfire.movingbutterfly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ButterFly butterfly = new ButterFly(MainActivity.this);

        butterfly.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                butterfly.bitmapX = event.getX()-200;
                butterfly.bitmapY = event.getY()-100;
                butterfly.invalidate();
                return true;
            }
        });

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.layout1);
        layout.addView(butterfly);
    }
}
