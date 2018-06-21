package com.xiaokele.shotscreendemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by QiyiLive on 2018/6/21.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());
    }
}
