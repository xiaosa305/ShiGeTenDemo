package com.xiaosa.qianfeng.shigeten.app;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.orhanobut.logger.Logger;
import com.xiaosa.qianfeng.shigeten.utils.Contains;

/**
 * Created by hasee on 2016/11/3.
 */

public class App extends Application{

    public enum ThemeType{
        LIGHT,DARK
    }
    public static Context APPCONTEXT;
    public static ThemeType THEME;
    @Override
    public void onCreate() {
        super.onCreate();
        APPCONTEXT = this;
        Fresco.initialize(this);
        Logger.init("XiaoSa");
        THEME = ThemeType.LIGHT;
    }
}
