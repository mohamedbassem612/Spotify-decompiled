package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p.arg;
import p.b8k1;
import p.omz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
class ClockHandView extends View {
    public final ArrayList a;
    public final int b;
    public final float c;
    public final Paint d;
    public final RectF e;
    public final int f;
    public float g;
    public boolean h;
    public double i;
    public int t;

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        Paint paint = new Paint();
        this.d = paint;
        this.e = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.k, i, 2132018857);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f = resources.getDimensionPixelSize(2131166419);
        this.c = resources.getDimensionPixelSize(2131166417);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = b8k1.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        float f2 = f % 360.0f;
        this.g = f2;
        this.i = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.t * ((float) Math.cos(this.i))) + (getWidth() / 2);
        float fSin = (this.t * ((float) Math.sin(this.i))) + height;
        float f3 = this.b;
        this.e.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((arg) it.next());
            if (Math.abs(clockFaceView.i1 - f2) > 0.001f) {
                clockFaceView.i1 = f2;
                clockFaceView.z();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fCos = (this.t * ((float) Math.cos(this.i))) + f;
        float f2 = height;
        float fSin = (this.t * ((float) Math.sin(this.i))) + f2;
        Paint paint = this.d;
        paint.setStrokeWidth(0.0f);
        int i = this.b;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.i);
        double dCos = Math.cos(this.i);
        double d = this.t - i;
        paint.setStrokeWidth(this.f);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.c, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(this.g);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.h = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.h;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.h;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.g != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            a(f);
            z3 = true;
        }
        this.h = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969722);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }
}
