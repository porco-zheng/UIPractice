package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/16.
 */

public class DrawLineView extends View{

  public DrawLineView(Context context) {
    super(context);
  }

  public DrawLineView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int width = getMeasuredWidth();
    int height = getMeasuredHeight();
    canvas.drawLine(0,0,width,height,getPaint());
    canvas.drawLine(0,height,width,0,getPaint());
  }

  Paint getPaint(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    return paint;
  }
}
