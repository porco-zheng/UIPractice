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

public class DrawCircleView extends View{

  public DrawCircleView(Context context) {
    super(context);
  }

  public DrawCircleView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int width = getMeasuredWidth();
    int height = getMeasuredHeight();
    canvas.drawCircle(width/4,height/4,Math.min(width/5,height/5),getPaint1());
    canvas.drawCircle(width*3/4,height/4,Math.min(width/5,height/5),getPaint2());
    canvas.drawCircle(width/4,height*3/4,Math.min(width/5,height/5),getPaint3());
    canvas.drawCircle(width*3/4,height*3/4,Math.min(width/5,height/5),getPaint4());
  }

  Paint getPaint1(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(Color.BLACK);
    paint.setStyle(Paint.Style.FILL);
    return paint;
  }

  Paint getPaint2(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(Color.BLACK);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(5);
    return paint;
  }

  Paint getPaint3(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(Color.BLUE);
    paint.setStyle(Paint.Style.FILL);
    return paint;
  }

  Paint getPaint4(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(Color.BLACK);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(30);
    return paint;
  }
}
