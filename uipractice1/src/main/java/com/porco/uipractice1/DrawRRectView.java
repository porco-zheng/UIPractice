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

public class DrawRRectView extends View{

  public DrawRRectView(Context context) {
    super(context);
  }

  public DrawRRectView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int width = getMeasuredWidth();
    int height = getMeasuredHeight();
    canvas.drawRoundRect(new RectF(width/2-100,height/2-100,width/2+100,height/2+100),10,10,getPaint());
  }

  Paint getPaint(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    return paint;
  }
}
