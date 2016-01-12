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
public class MyArc2 extends View{

    public MyArc2(Context context) {
        super(context);
        setFocusable(true);
    }

    public MyArc2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyArc2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint p = new Paint();
        RectF rectF3 = new RectF(175, 245, 825, 925);
        p.setColor(Color.BLUE);
        canvas.drawArc(rectF3, 45, 90, true, p);
    }

}
