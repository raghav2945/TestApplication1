package com.example.kumar.raghawendra.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by raghawendra.kumar on 12-01-2016.
 */
public class MyArc3 extends View{

    public MyArc3(Context context) {
        super(context);
        setFocusable(true);
    }


    public MyArc3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyArc3(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint p = new Paint();
        RectF rectF2 = new RectF(200, 220, 850, 900);
        p.setColor(Color.GREEN);
        canvas.drawArc(rectF2, 270, 135, true, p);
    }

}
