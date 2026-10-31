package com.spotify.scannables.scannables.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ViewfinderView extends View {
    public static final byte[] h = {0, 63, 116, -106, -75, -47, -24, -8, -1, -11, -23, -34, -45, -55, -65, -73, -80, -84, -86, -84, -80, -73, -65, -55, -45, -34, -23, -11, -1, -8, -24, -47, -75, -106, 116, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public final float d;
    public final PorterDuffXfermode e;
    public Rect f;
    public long g;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new RectF();
        this.e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(Color.argb(150, 0, 0, 0));
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        float fApplyDimension = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        this.d = fApplyDimension;
        paint2.setStrokeWidth(fApplyDimension * 2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        float f = this.f.left;
        Paint paint = this.b;
        float strokeWidth = f - (paint.getStrokeWidth() / 2.0f);
        RectF rectF = this.c;
        rectF.left = strokeWidth;
        rectF.top = this.f.top - (paint.getStrokeWidth() / 2.0f);
        rectF.right = (paint.getStrokeWidth() / 2.0f) + this.f.right;
        rectF.bottom = (paint.getStrokeWidth() / 2.0f) + this.f.bottom;
        canvas2.drawPaint(this.a);
        canvas2.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        Rect rect = this.f;
        rectF.left = rect.left;
        rectF.top = rect.top;
        rectF.right = rect.right;
        rectF.bottom = rect.bottom;
        paint.setXfermode(this.e);
        paint.setStyle(Paint.Style.FILL);
        canvas2.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = this.d;
        int i = (int) (40.0f * f2);
        Rect rect2 = this.f;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int i4 = ((i2 + i3) - i) / 2;
        int i5 = ((i2 + i3) + i) / 2;
        int i6 = rect2.bottom + ((int) (f2 * 20.0f));
        int i7 = i6 + ((int) (35.0f * f2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.g;
        if (j == 0) {
            this.g = jCurrentTimeMillis;
            j = jCurrentTimeMillis;
        }
        float f3 = ((int) (jCurrentTimeMillis - j)) * 5.0E-4f;
        float f4 = 0.5f;
        float f5 = (i6 + i7) * 0.5f;
        int i8 = 0;
        while (i8 < 6) {
            float f6 = i4 + ((i8 + f4) * (i5 - i4) * 0.16666667f);
            float f7 = (i7 - i6) * f4;
            double d = ((((5 - i8) * 0.04f) + f3) % 1.0f) * 60.0f;
            double dFloor = Math.floor(d);
            double d2 = d - dFloor;
            float f8 = f5;
            int iAbs = (int) Math.abs(dFloor);
            byte[] bArr = h;
            int i9 = bArr[iAbs] & 255;
            float f9 = ((((((bArr[iAbs + 1] & 255) - i9) * ((float) d2)) + i9) * 0.003921569f * 0.95f) + 0.05f) * f7;
            canvas2.drawLine(f6, f8 - f9, f6, f8 + f9, paint);
            i8++;
            canvas2 = canvas;
            f5 = f8;
            f4 = 0.5f;
        }
        postInvalidateDelayed(80L, i4, i6, i5, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = i / 10;
        this.f = new Rect(i5, i2 / 8, i - i5, i2 - (i2 / 3));
        super.onSizeChanged(i, i2, i3, i4);
    }
}
