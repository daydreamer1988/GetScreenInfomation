# GetScreenInfomation
获取物理屏幕，除去Navigation的，StatusBar, ActionBar, ApplicationZone, DrawingZone的高度值

Activity中的onTouchEvent返回的x y 坐标（7.0系统）是以物理屏幕开始计算的

点击只对DrawingZone有效，点击StatusBar,ActionBar不回调onTouchEvent（点击DrawingZone的左上角 返回x:0， y:statusbar高+actionbar高）

View中的onTouchEvent是以View的宽高为标准的（点击View左上角返回x:0, y:0）
