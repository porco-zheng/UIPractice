package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/16.
 */

public class PieChartView extends View{

  int width,height;

  public PieChartView(Context context) {
    super(context);
  }

  public PieChartView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    width = getMeasuredWidth();
    height = getMeasuredHeight();
    drawPie(canvas);
  }

  void drawPie(Canvas canvas){
    canvas.drawArc(new RectF(width/2-200,height/2-200,width/2+200,height/2+200),300,60,true,getPaint(Color.BLUE));
    canvas.drawArc(new RectF(width/2-200,height/2-200,width/2+200,height/2+200),0,10,true,getPaint(Color.LTGRAY));
    canvas.drawArc(new RectF(width/2-200,height/2-200,width/2+200,height/2+200),10,20,true,getPaint(Color.GREEN));
    canvas.drawArc(new RectF(width/2-200,height/2-200,width/2+200,height/2+200),30,10,true,getPaint(Color.YELLOW));
    canvas.drawArc(new RectF(width/2-200,height/2-200,width/2+200,height/2+200),40,40,true,getPaint(Color.RED));
    canvas.drawArc(new RectF(width/2-200,height/2-200,width/2+200,height/2+200),80,100,true,getPaint(Color.RED));
    canvas.drawArc(new RectF(width/2-220,height/2-220,width/2+180,height/2+180),180,120,true,getPaint(Color.CYAN));
  }

  Paint getPaint(int color){
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(color);
    return paint;
  }
}
