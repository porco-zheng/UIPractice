package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/16.
 */

public class DrawOvalView extends View{

  public DrawOvalView(Context context) {
    super(context);
  }

  public DrawOvalView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int width = getMeasuredWidth();
    int height = getMeasuredHeight();
    canvas.drawOval(new RectF(100,100,width-100,height-100),getPaint());
  }

  Paint getPaint(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setStyle(Paint.Style.FILL);
    return paint;
  }
}
