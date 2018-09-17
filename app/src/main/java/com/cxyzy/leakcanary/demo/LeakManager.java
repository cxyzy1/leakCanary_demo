package com.cxyzy.leakcanary.demo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 程序园中猿
 */
public class LeakManager {
    private static List<Context> list = new ArrayList<>();

    public static void addMe(Context context) {
        list.add(context);
    }
}
