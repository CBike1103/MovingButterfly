package com.example.crossfire.movingbutterfly;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by CrossFire on 2016/6/30.
 */
public class ButterFly extends View {
    public float bitmapX;
    public float bitmapY;

    public ButterFly(Context context){
        super(context);
        bitmapX = 200;
        bitmapY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.butterfly);

        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }

    }
}
