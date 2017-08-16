package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/16.
 */

public class DrawPathView extends View{

  int width,height;

  public DrawPathView(Context context) {
    super(context);
  }

  public DrawPathView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    width = getMeasuredWidth();
    height = getMeasuredHeight();
    canvas.drawPath(getPath(),getPaint());
  }

  Paint getPaint(){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setStyle(Paint.Style.FILL);
    return paint;
  }

  Path getPath(){
    Path path = new Path();
    path.arcTo(new RectF(width/2-200,height/2-100,width/2,height/2+100),160,210,false);
    path.arcTo(new RectF(width/2,height/2-100,width/2+200,height/2+100),180,210,false);
    path.lineTo(width/2,height/2+250);
    path.close();
    return path;
  }

}
