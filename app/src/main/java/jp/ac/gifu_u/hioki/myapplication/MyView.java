package jp.ac.gifu_u.hioki.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class MyView {
    public MyView(Context context){
        super(context);
    }

    @Override
    protected void onDarw(Canvas canvas){
        super.onDarw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);

        canvas.drawLine(10,20,30,40,paint);
    }
}
