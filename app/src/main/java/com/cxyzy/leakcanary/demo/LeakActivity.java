package com.cxyzy.leakcanary.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
/**
 * @author 程序园中猿
 */
public class LeakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        LeakManager.addMe(this);

    }
}
