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
public class MyArc1 extends View{

    public MyArc1(Context context) {
        super(context);
        setFocusable(true);
    }


    public MyArc1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyArc1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
       Paint p = new Paint();
       RectF rectF1 = new RectF(150, 220, 800, 900);
       p.setColor(Color.RED);
        canvas.drawArc(rectF1, 135, 135, true, p);
        /*RectF rectF2 = new RectF(200, 220, 850, 900);
        p.setColor(Color.GREEN);
        canvas.drawArc(rectF2, 270, 135, true, p);
        RectF rectF3 = new RectF(175, 245, 825, 925);
        p.setColor(Color.BLUE);
        canvas.drawArc(rectF3, 45, 90, true, p);*/
    }

}
