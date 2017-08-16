package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/16.
 */

public class PDrawColorView extends View{

  int a = 0, r = 0, g = 0, b = 0;

  public PDrawColorView(Context context) {
    this(context, null);
  }

  public PDrawColorView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawRGB(r=getValuePlus(r+2), g=getValuePlus(g+3), b=getValuePlus(b+4));
    postInvalidateDelayed(100);
  }

  int getValuePlus(int value){
    return value > 255 ? 0 : value;
  }



}
