package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/16.
 */

public class DrawPointView extends View{

  public DrawPointView(Context context) {
    super(context);
  }

  public DrawPointView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int width = getMeasuredWidth();
    int height = getMeasuredHeight();
    canvas.drawPoint(width/4,height/2,getPaintR());
    canvas.drawPoint(width*3/4,height/2,getPaintS());
  }

  Paint getPaintR(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(Color.BLACK);
    paint.setStrokeWidth(30);
    paint.setStrokeCap(Paint.Cap.ROUND);
    return paint;
  }

  Paint getPaintS(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(Color.BLACK);
    paint.setStrokeWidth(30);
    paint.setStrokeCap(Paint.Cap.SQUARE);
    return paint;
  }
}
