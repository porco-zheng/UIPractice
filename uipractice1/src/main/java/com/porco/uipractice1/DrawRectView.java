package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/16.
 */

public class DrawRectView extends View{

  public DrawRectView(Context context) {
    super(context);
  }

  public DrawRectView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int width = getMeasuredWidth();
    int height = getMeasuredHeight();
    canvas.drawRect(50,50,width-50,height-50,getPaint());
    canvas.drawRect(100,100,width-100,height-100,getPaint2());
  }

  Paint getPaint(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setStyle(Paint.Style.STROKE);
    return paint;
  }

  Paint getPaint2(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setStyle(Paint.Style.FILL);
    return paint;
  }
}
