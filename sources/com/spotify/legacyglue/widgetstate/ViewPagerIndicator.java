package com.spotify.legacyglue.widgetstate;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;
import p.a8o;
import p.b8k1;
import p.i2k;
import p.pdk1;
import p.z511;
import p.znz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Deprecated
public final class ViewPagerIndicator extends View implements pdk1 {
    public final int a;
    public final int b;
    public float c;
    public final Paint d;
    public final Paint e;
    public ViewPager2 f;
    public final i2k g;

    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new i2k(this, (byte) 1);
        int iY = a8o.y(10.0f, context.getResources());
        int iX = a8o.x(6.0f, context.getResources());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, znz0.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, iY);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, iX);
        int color = typedArrayObtainStyledAttributes.getColor(1, -7829368);
        int color2 = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(color);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(color2);
    }

    private int getItemCount() {
        z511 adapter;
        ViewPager2 viewPager2 = this.f;
        if (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) {
            return 0;
        }
        return adapter.e();
    }

    public final void c(float f, int i) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.c = i + f;
        postInvalidate();
    }

    public final void e(int i) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int i2 = this.a;
        float f = i2 / 2.0f;
        WeakHashMap weakHashMap = b8k1.a;
        int i3 = 0;
        boolean z = getLayoutDirection() == 1;
        int width = getWidth();
        while (true) {
            i = this.b;
            if (i3 >= itemCount) {
                break;
            }
            float f2 = ((i + i2) * i3) + f;
            if (z) {
                f2 = width - f2;
            }
            canvas.drawCircle(f2, f, f, this.d);
            i3++;
        }
        float f3 = (this.c * (i2 + i)) + f;
        if (z) {
            f3 = width - f3;
        }
        canvas.drawCircle(f3, f, f, this.e);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        int i3 = this.a;
        int paddingRight = getPaddingRight() + getPaddingLeft() + ((itemCount - 1) * this.b) + (itemCount * i3);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i3;
        setVisibility(0);
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    public void setupWithViewPager(ViewPager2 viewPager2) {
        ViewPager2 viewPager3 = this.f;
        i2k i2kVar = this.g;
        if (viewPager3 != null) {
            viewPager3.c.f(i2kVar);
            this.f = null;
        }
        this.f = viewPager2;
        viewPager2.b(i2kVar);
        this.c = this.f.getCurrentItem();
        invalidate();
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969969);
    }

    public ViewPagerIndicator(Context context) {
        this(context, null);
    }
}
