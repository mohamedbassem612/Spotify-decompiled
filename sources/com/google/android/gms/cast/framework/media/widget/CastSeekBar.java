package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import p.bhn0;
import p.g7o1;
import p.k2o1;
import p.nmz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class CastSeekBar extends View {
    public final k2o1 a;
    public final ArrayList b;
    public final float c;
    public final float d;
    public final float e;
    public final Paint f;
    public final int g;
    public final int h;
    public final int i;

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        setAccessibilityDelegate(new g7o1(this));
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = context.getResources().getDimension(2131165459);
        this.d = context.getResources().getDimension(2131165458);
        this.e = context.getResources().getDimension(2131165460) / 2.0f;
        context.getResources().getDimension(2131165461);
        context.getResources().getDimension(2131165457);
        this.a = new k2o1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, nmz0.a, 2130968909, 2132017469);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.g = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.h = context.getResources().getColor(resourceId3);
        this.i = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i, int i2, int i3, int i4) {
        Paint paint = this.f;
        paint.setColor(i4);
        float f = i3;
        float f2 = (i2 / 1.0f) * f;
        float f3 = (i / 1.0f) * f;
        float f4 = this.e;
        canvas.drawRect(f3, -f4, f2, f4, paint);
    }

    public int getMaxProgress() {
        this.a.getClass();
        return 1;
    }

    public int getProgress() {
        this.a.getClass();
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i;
        int i2;
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int iSave2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        this.a.getClass();
        int iMax = Math.max(0, 0);
        if (iMax > 0) {
            i = iMax;
            castSeekBar = this;
            canvas2 = canvas;
            castSeekBar.a(canvas2, 0, i, measuredWidth, this.h);
        } else {
            castSeekBar = this;
            canvas2 = canvas;
            i = iMax;
        }
        if (progress > i) {
            castSeekBar.a(canvas2, i, progress, measuredWidth, castSeekBar.g);
            i2 = progress;
        } else {
            i2 = progress;
        }
        if (1 > i2) {
            castSeekBar.a(canvas2, i2, 1, measuredWidth, castSeekBar.h);
        }
        canvas2.restoreToCount(iSave2);
        ArrayList arrayList = castSeekBar.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            castSeekBar.f.setColor(castSeekBar.i);
            castSeekBar.getMeasuredWidth();
            castSeekBar.getPaddingLeft();
            castSeekBar.getPaddingRight();
            int measuredHeight2 = (castSeekBar.getMeasuredHeight() - castSeekBar.getPaddingTop()) - castSeekBar.getPaddingBottom();
            int iSave3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    bhn0.d();
                    return;
                }
            }
            canvas2.restoreToCount(iSave3);
        }
        castSeekBar.isEnabled();
        canvas2.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.c + paddingLeft + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.d + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.a.getClass();
        return false;
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context) {
        this(context, null);
    }
}
