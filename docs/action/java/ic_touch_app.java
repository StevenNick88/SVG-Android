package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_touch_app extends SVGRenderer {

    public ic_touch_app(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(9.0f, 11.24f);
        mPath.lineTo(9.0f, 7.5f);
        mPath.cubicTo(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
        mPath.cubicTo(12.88f, 5.0f, 14.0f, 6.12f, 14.0f, 7.5f);
        mPath.rLineTo(0f, 3.74f);
        mPath.rCubicTo(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        mPath.cubicTo(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
        mPath.cubicTo(9.01f, 3.0f, 7.0f, 5.01f, 7.0f, 7.5f);
        mPath.rCubicTo(0.0f, 1.56f, 0.79f, 2.93f, 2.0f, 3.74f);
        mPath.close();
        mPath.moveTo(9.0f, 11.24f);
        mPath.rMoveTo(9.84f, 4.63f);
        mPath.rLineTo(-4.54f, -2.26f);
        mPath.rCubicTo(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
        mPath.lineTo(13.0f, 13.5f);
        mPath.rLineTo(0f, -6.0f);
        mPath.rCubicTo(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.cubicTo(10.67f, 6.0f, 10.0f, 6.67f, 10.0f, 7.5f);
        mPath.rLineTo(0f, 10.74f);
        mPath.rLineTo(-3.43f, -0.72f);
        mPath.rCubicTo(-0.08f, -0.01f, -0.15f, -0.03f, -0.24f, -0.03f);
        mPath.rCubicTo(-0.31f, 0.0f, -0.59f, 0.13f, -0.79f, 0.33f);
        mPath.rLineTo(-0.79f, 0.8f);
        mPath.rLineTo(4.94f, 4.94f);
        mPath.rCubicTo(0.27f, 0.27f, 0.65f, 0.44f, 1.06f, 0.44f);
        mPath.rLineTo(6.79f, 0f);
        mPath.rCubicTo(0.75f, 0.0f, 1.33f, -0.55f, 1.44f, -1.28f);
        mPath.rLineTo(0.75f, -5.27f);
        mPath.rCubicTo(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
        mPath.rCubicTo(0.0f, -0.62f, -0.38f, -1.16f, -0.91f, -1.38f);
        mPath.close();
        mPath.moveTo(18.84f, 15.87f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}