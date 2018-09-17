package com.cxyzy.leakcanary.demo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
/**
 * @author 程序园中猿
 */
public class App extends Application {
    private static App instance;
    public static App getInstance()
    {
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        //初始化LeakCanary
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
