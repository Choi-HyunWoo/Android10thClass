package com.example.administrator.android10thclass.ex1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.administrator.android10thclass.R;

public class Ex1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        LinearLayout container = (LinearLayout) findViewById(R.id.container);

        MyCustomView view = new MyCustomView(this);
        view.setBackgroundColor(Color.MAGENTA);
        container.addView(view);
    }
}
