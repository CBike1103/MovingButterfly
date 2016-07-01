package com.example.crossfire.movingbutterfly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by CrossFire on 2016/7/1.
 */
public class FlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ButterFly butterfly = new ButterFly(FlyActivity.this);

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

 /*   @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.setClass(FlyActivity.this,MainActivity.class);
        startActivity(intent);
    }*/
}