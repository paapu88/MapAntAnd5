package com.example.mka.mapantand5;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// https://stackoverflow.com/questions/11162626/android-use-a-view-from-a-xml-layout-to-draw-a-canvas
public class MainActivity extends AppCompatActivity {

    View v;
    Canvas canvas;
    TheSurface ourSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = (View) findViewById(R.id.vMain);

        canvas = new Canvas();
        ourSurfaceView = new TheSurface(this);
        //ourSurfaceView.setOnTouchListener(this);
        v.draw(canvas);

    }
}


