package com.example.mka.mapantand5;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mka on 16.11.2017.
 */
public class TheSurface extends View {

    public TheSurface(Context C) {
        super(C);

        // Other setup code you want here
    }

    public TheSurface(Context C, AttributeSet attribs) {
        super(C, attribs);

        // Other setup code you want here
    }

    public TheSurface(Context C, AttributeSet attribs, int defStyle) {
        super(C, attribs, defStyle);

        // Other setup code you want here
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint textPaint = new Paint();
        textPaint.setColor(Color.WHITE);

        canvas.drawLine(0, 0, canvas.getWidth(), canvas.getHeight(), textPaint);

        // Other drawing functions here!!!
        //canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bg1),0,0,null);
    }
}
