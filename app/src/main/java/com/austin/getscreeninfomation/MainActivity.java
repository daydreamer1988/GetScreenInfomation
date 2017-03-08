package com.austin.getscreeninfomation;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;


/**
 * 1080*1920(原始手机屏幕分辨率) 6.0 23
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().post(new Runnable() {
            @Override
            public void run() {
                Log.e("getRealScreenHeight", DisplayUtil.getRealScreenHeight(getBaseContext())+"");
                Log.e("getRealScreenHeight", DisplayUtil.getRealScreenHeight(MainActivity.this)+"");
                Log.e("getScreenHeight1", DisplayUtil.getScreenHeight1(MainActivity.this)+"");
                Log.e("getScreenHeight2", DisplayUtil.getScreenHeight2(MainActivity.this)+"");
                Log.e("getScreenHeight3", DisplayUtil.getScreenHeight3(MainActivity.this)+"");
                Log.e("getScreenHeight4", DisplayUtil.getScreenHeight4(MainActivity.this)+"");
                Log.e("getScreenHeight5", DisplayUtil.getScreenHeight5(MainActivity.this)+"");

                Log.e("getStatusBarHeight",DisplayUtil.getStatusBarHeight(MainActivity.this)+"");
                Log.e("getStatusBarHeight2",DisplayUtil.getStatusBarHeight2(MainActivity.this)+"");
                Log.e("getStatusBarHeight3",DisplayUtil.getStatusBarHeight3(MainActivity.this)+"");
                Log.e("getStatusBarHeight4", DisplayUtil.getStatusBarHeight4(MainActivity.this) + "");

                Log.e("getTitleBarHeight",DisplayUtil.getTitleBarHeight(MainActivity.this)+"");

                Log.e("getApplicationHeight",DisplayUtil.getApplicationHeight(MainActivity.this)+"");
                Log.e("getDrawingHeight", DisplayUtil.getDrawingHeight(MainActivity.this) + "");
                Log.e("getDrawingHeight2", DisplayUtil.getDrawingHeight2(MainActivity.this) + "------------");

//                E/getRealScreenHeight: 1920
//                E/getRealScreenHeight: 1920
//                E/getScreenHeight1: 1776
//                E/getScreenHeight2: 1776
//                E/getScreenHeight3: 1776
//                E/getScreenHeight4: 1776
//                E/getScreenHeight5: 1776
//                E/getStatusBarHeight: 72
//                E/getStatusBarHeight2: 72
//                E/getStatusBarHeight3: 72
//                E/getStatusBarHeight4: 72
//                E/getTitleBarHeight: 168
//                E/getApplicationHeight: 1704
//                E/getDrawingHeight: 1536
//                E/getDrawingHeight2: 1536------------
//
            }
        });


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.e("getRealScreenHeight", DisplayUtil.getRealScreenHeight(getBaseContext())+"");
        Log.e("getRealScreenHeight", DisplayUtil.getRealScreenHeight(MainActivity.this)+"");
        Log.e("getScreenHeight1", DisplayUtil.getScreenHeight1(MainActivity.this)+"");
        Log.e("getScreenHeight2", DisplayUtil.getScreenHeight2(MainActivity.this)+"");
        Log.e("getScreenHeight3", DisplayUtil.getScreenHeight3(MainActivity.this)+"");
        Log.e("getScreenHeight4", DisplayUtil.getScreenHeight4(MainActivity.this)+"");
        Log.e("getScreenHeight5", DisplayUtil.getScreenHeight5(MainActivity.this)+"");

        Log.e("getStatusBarHeight",DisplayUtil.getStatusBarHeight(MainActivity.this)+"");
        Log.e("getStatusBarHeight2",DisplayUtil.getStatusBarHeight2(MainActivity.this)+"");
        Log.e("getStatusBarHeight3",DisplayUtil.getStatusBarHeight3(MainActivity.this)+"");
        Log.e("getStatusBarHeight4", DisplayUtil.getStatusBarHeight4(MainActivity.this) + "");

        Log.e("getTitleBarHeight",DisplayUtil.getTitleBarHeight(MainActivity.this)+"");

        Log.e("getApplicationHeight",DisplayUtil.getApplicationHeight(MainActivity.this)+"");
        Log.e("getDrawingHeight", DisplayUtil.getDrawingHeight(MainActivity.this) + "");
        Log.e("getDrawingHeight2", DisplayUtil.getDrawingHeight2(MainActivity.this) + "");

//        E/getRealScreenHeight: 1920
//        E/getRealScreenHeight: 1920
//        E/getScreenHeight1: 1776
//        E/getScreenHeight2: 1776
//        E/getScreenHeight3: 1776
//        E/getScreenHeight4: 1776
//        E/getScreenHeight5: 1776
//        E/getStatusBarHeight: 72
//        E/getStatusBarHeight2: 72
//        E/getStatusBarHeight3: 72
//        E/getStatusBarHeight4: 72
//        E/getTitleBarHeight: 168
//        E/getApplicationHeight: 1704
//        E/getDrawingHeight: 1536
//        E/getDrawingHeight2: 1536

    }

}
