package com.erichym.weibologinshare;

import com.mob.MobApplication;
import com.mob.MobSDK;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public class MyApplication extends MobApplication{
    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(getApplicationContext());
    }
}
