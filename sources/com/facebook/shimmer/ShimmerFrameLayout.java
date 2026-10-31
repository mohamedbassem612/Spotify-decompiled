package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p.az71;
import p.bz71;
import p.gz71;
import p.kmz0;
import p.zy71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint a;
    public final gz71 b;
    public boolean c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new gz71();
        this.c = true;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.b.setCallback(this);
        if (attributeSet == null) {
            b(new zy71().x0());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kmz0.a, 0, 0);
        try {
            b(((typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) ? new az71() : new zy71()).B0(typedArrayObtainStyledAttributes).x0());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void b(bz71 bz71Var) {
        boolean zIsStarted;
        gz71 gz71Var = this.b;
        gz71Var.f = bz71Var;
        if (bz71Var != null) {
            gz71Var.b.setXfermode(new PorterDuffXfermode(gz71Var.f.f17p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        gz71Var.b();
        if (gz71Var.f != null) {
            ValueAnimator valueAnimator = gz71Var.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                gz71Var.e.cancel();
                gz71Var.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            bz71 bz71Var2 = gz71Var.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (bz71Var2.t / bz71Var2.s) + 1.0f);
            gz71Var.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(gz71Var.f.r);
            gz71Var.e.setRepeatCount(gz71Var.f.q);
            ValueAnimator valueAnimator2 = gz71Var.e;
            bz71 bz71Var3 = gz71Var.f;
            valueAnimator2.setDuration(bz71Var3.s + bz71Var3.t);
            gz71Var.e.addUpdateListener(gz71Var.a);
            if (zIsStarted) {
                gz71Var.e.start();
            }
        }
        gz71Var.invalidateSelf();
        if (bz71Var == null || !bz71Var.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.a);
        }
    }

    public final void c(boolean z) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z) {
            d();
        }
    }

    public final void d() {
        gz71 gz71Var = this.b;
        ValueAnimator valueAnimator = gz71Var.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && gz71Var.getCallback() != null) {
                gz71Var.e.start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    public final void e() {
        gz71 gz71Var = this.b;
        ValueAnimator valueAnimator = gz71Var.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        gz71Var.e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = new gz71();
        this.c = true;
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.b = new gz71();
        this.c = true;
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Paint();
        this.b = new gz71();
        this.c = true;
        a(context, attributeSet);
    }
}
