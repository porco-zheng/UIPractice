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

public class DrawArcView extends View{

  public DrawArcView(Context context) {
    super(context);
  }

  public DrawArcView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int width = getMeasuredWidth();
    int height = getMeasuredHeight();
    RectF rectF = new RectF(width/2-100,height/2-100,width/2+100,height/2+100);
    canvas.drawArc(rectF,180,45,false,getPaint());
    canvas.drawArc(rectF,230,90,true,getPaint1());
    canvas.drawArc(rectF,30,120,false,getPaint1());
  }

  Paint getPaint(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setStyle(Paint.Style.STROKE);
    return paint;
  }

  Paint getPaint1(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setStyle(Paint.Style.FILL);
    return paint;
  }
}
