package com.oo.baselearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @BindView(R.id.module1) Button module1;
  @BindView(R.id.activity_main) LinearLayout activityMain;
  @BindView(R.id.module2) Button module2;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    initView();
  }

  private void initView() {
    module1.setOnClickListener(this);
    module2.setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.module1:
        startActivity(new Intent(MainActivity.this, Practice1Activity.class));
        break;
      case R.id.module2:
        startActivity(new Intent(MainActivity.this, Practice2Activity.class));
        break;
    }
  }
}
