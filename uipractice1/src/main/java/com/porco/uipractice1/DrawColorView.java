package com.porco.uipractice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by porco on 2017/8/15.
 */

public class DrawColorView extends View{

  public DrawColorView(Context context) {
    super(context);
  }

  public DrawColorView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawColor(Color.YELLOW);
  }
}
