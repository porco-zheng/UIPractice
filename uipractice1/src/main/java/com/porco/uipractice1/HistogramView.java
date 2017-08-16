package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;

/**
 * Created by porco on 2017/8/16.
 */

public class HistogramView extends View{

  int x,y;
  HashMap<String,Integer> maps = new HashMap<>();

  Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
  Paint colorPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
  Paint linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
  {
    textPaint.setTextSize(18);
    textPaint.setTextAlign(Paint.Align.CENTER);
    colorPaint.setColor(Color.GREEN);
    linePaint.setColor(Color.WHITE);
    linePaint.setStrokeWidth(5);
  }

  {
    maps.put("Froyo",1);
    maps.put("GB",10);
    maps.put("ICS",10);
    maps.put("JB",40);
    maps.put("KiaKat",60);
    maps.put("L",80);
    maps.put("M",30);
  }

  public HistogramView(Context context) {
    super(context);
  }

  public HistogramView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    x=250;
    y=500;
    canvas.drawColor(Color.LTGRAY);
    canvas.drawLine(200,50,200,470,linePaint);
    canvas.drawLine(200,470,700,470,linePaint);
    for(String key:maps.keySet()){
      drawRate(canvas,key,maps.get(key));
      x+=60;
    }
  }

  void drawRate(Canvas canvas,String string,int per){
    canvas.drawText(string,x,y,textPaint);
    canvas.drawRect(new RectF(x-20,y-30-per*5,x+20,y-30),colorPaint);
  }
}
