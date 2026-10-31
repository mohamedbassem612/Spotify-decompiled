package com.spotify.encoremobile.tooltip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import p.a6f1;
import p.a8o;
import p.d20;
import p.d3j0;
import p.d4f1;
import p.e4f1;
import p.esa1;
import p.f4f1;
import p.jj11;
import p.mhc;
import p.qub1;
import p.s5f1;
import p.t5f1;
import p.ww21;
import p.y22;
import p.y5f1;
import p.yrg0;
import p.z5f1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Deprecated
public class TooltipContainer extends FrameLayout {
    public static final /* synthetic */ int P0 = 0;
    public final mhc N0;
    public final y22 O0;
    public final a6f1 a;
    public int b;
    public final int c;
    public boolean d;
    public View e;
    public MotionEvent f;
    public View g;
    public AnimatorSet h;
    public qub1 i;
    public esa1 t;

    public TooltipContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.N0 = new mhc((byte) 27);
        this.O0 = new y22(this, (byte) 19);
        this.b = context.getResources().getDimensionPixelOffset(2131167147);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        a6f1 a6f1Var = new a6f1(context);
        this.a = a6f1Var;
        addView(a6f1Var, -1, -2);
        a6f1Var.setHidden(true);
    }

    private int getMargin() {
        a6f1 a6f1Var = this.a;
        if (a6f1Var.getConfiguration().c()) {
            ((d4f1) a6f1Var.getConfiguration().b()).getClass();
        }
        return a8o.y(16.0f, getResources());
    }

    private t5f1 getOnScrollListener() {
        return this.N0;
    }

    public final void a() {
        esa1 esa1Var = this.t;
        if (esa1Var != null) {
            esa1Var.v();
        }
        View view = this.e;
        if (view != null) {
            View view2 = this.g;
            y22 y22Var = this.O0;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(y22Var);
            } else {
                view.removeOnAttachStateChangeListener(y22Var);
            }
            removeCallbacks(this.i);
            this.e = null;
        }
        MotionEvent motionEvent = this.f;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f = null;
        }
    }

    public final void b() {
        a();
        if (this.d) {
            return;
        }
        this.d = true;
        z5f1 yrg0Var = new yrg0(this, (byte) 18);
        a6f1 a6f1Var = this.a;
        a6f1Var.setAnimationListener(yrg0Var);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new y5f1(a6f1Var, (byte) 1));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a6f1Var.R0, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.5f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.25f));
        objectAnimatorOfPropertyValuesHolder.setDuration(100L);
        objectAnimatorOfPropertyValuesHolder.setStartDelay(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfPropertyValuesHolder);
        animatorSet.addListener(new d20(a6f1Var, (byte) 15));
        animatorSet.start();
        this.h = animatorSet;
    }

    public final boolean c() {
        a6f1 a6f1Var = this.a;
        return a6f1Var.getConfiguration().c() && ((d4f1) a6f1Var.getConfiguration().b()).g();
    }

    public final void d(View view, d4f1 d4f1Var, d3j0 d3j0Var) {
        a6f1 a6f1Var = this.a;
        jj11 jj11Var = (jj11) d4f1Var;
        a6f1Var.getLayoutParams().width = jj11Var.g() ? -1 : -2;
        a6f1Var.requestLayout();
        if (this.e == view && !this.d) {
            f(view, jj11Var);
            return;
        }
        this.b = jj11Var.e().intValue();
        Integer numD = jj11Var.d();
        if (numD.intValue() > 0) {
            a6f1Var.setCornerRadius(numD.intValue());
        } else {
            a6f1Var.setCornerRadius(getResources().getDimensionPixelSize(2131165925));
        }
        a6f1Var.setDrawArrowEnabled(true);
        a6f1Var.a.setColor(jj11Var.c().intValue());
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.h.end();
        }
        view.getClass();
        a6f1Var.setAbove(e(view, jj11Var));
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[1];
        int measuredHeight = getMeasuredHeight();
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        int i2 = iArr2[1];
        int measuredHeight2 = view.getMeasuredHeight();
        int measuredHeight3 = a6f1Var.getMeasuredHeight() / 2;
        int i3 = a6f1Var.P0 ? i2 - measuredHeight3 : i2 + measuredHeight2 + measuredHeight3;
        if (i3 < i || i3 > i + measuredHeight) {
            a();
            return;
        }
        View view2 = this.g;
        y22 y22Var = this.O0;
        if (view2 != null) {
            view2.addOnAttachStateChangeListener(y22Var);
        } else {
            view.addOnAttachStateChangeListener(y22Var);
        }
        a6f1Var.setHidden(false);
        jj11Var.a(new e4f1(this, (byte) 0));
        a6f1Var.setConfiguration(jj11Var);
        this.e = view;
        this.d = false;
        if (a6f1Var.getConfiguration().c()) {
            ((d4f1) a6f1Var.getConfiguration().b()).getClass();
        }
        esa1 esa1Var = this.t;
        if (esa1Var != null) {
            esa1Var.w(d3j0Var, new ww21(this, (byte) 27));
        }
        removeCallbacks(this.i);
        qub1 qub1Var = new qub1(this, jj11Var, (byte) 4);
        this.i = qub1Var;
        post(qub1Var);
    }

    public final boolean e(View view, d4f1 d4f1Var) {
        boolean z;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        int i2 = i - iArr2[1];
        boolean z2 = view.getTag() == f4f1.a;
        a6f1 a6f1Var = this.a;
        boolean z3 = i2 - a6f1Var.getHeight() >= 0;
        if (!z2 || !z3) {
            int measuredHeight = (getMeasuredHeight() - i2) - view.getHeight();
            if (view.getTag() != f4f1.b) {
                d4f1Var.getClass();
                z = false;
            } else {
                z = true;
            }
            boolean z4 = measuredHeight - a6f1Var.getHeight() >= 0;
            if ((z && z4) || i2 < measuredHeight) {
                return false;
            }
        }
        return true;
    }

    public final void f(View view, d4f1 d4f1Var) {
        float f;
        float fMin;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        int i2 = iArr2[1];
        boolean zE = e(view, d4f1Var);
        a6f1 a6f1Var = this.a;
        if (zE) {
            a6f1Var.setAbove(true);
            a6f1Var.setY(((i - i2) - a6f1Var.getHeight()) - this.b);
        } else {
            a6f1Var.setAbove(false);
            a6f1Var.setY(Math.max(view.getHeight() + (i - i2) + this.b, 0));
        }
        int margin = getMargin();
        int[] iArr3 = new int[2];
        view.getLocationInWindow(iArr3);
        int i3 = iArr3[0];
        int width = getWidth() - a6f1Var.getWidth();
        if (c()) {
            f = margin;
        } else {
            int iMax = Math.max(((view.getWidth() / 2) + i3) - (a6f1Var.getWidth() / 2), margin);
            if (a6f1Var.getWidth() + iMax > getWidth() - margin) {
                iMax = width - margin;
            }
            f = iMax;
        }
        int[] iArr4 = new int[2];
        view.getLocationInWindow(iArr4);
        int width2 = (view.getWidth() / 2) + new Point(iArr4[0], iArr4[1]).x;
        int[] iArr5 = new int[2];
        getLocationInWindow(iArr5);
        Point point = new Point(iArr5[0], iArr5[1]);
        boolean zC = c();
        int i4 = point.x;
        if (zC) {
            fMin = Math.min(Math.max(i4 + width2, f), getWidth() - f);
        } else {
            fMin = (i4 + width2) - f;
        }
        int i5 = (int) fMin;
        if (c()) {
            a6f1Var.setSideMargin((int) f);
        } else {
            a6f1Var.setX(f);
        }
        a6f1Var.setArrowOffset(i5);
    }

    public a6f1 getTooltip() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f = MotionEvent.obtain(motionEvent);
        } else if (action == 2 && (motionEvent2 = this.f) != null && Math.abs(motionEvent2.getY() - motionEvent.getY()) > this.c) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a6f1 a6f1Var = this.a;
        int top = a6f1Var.getTop();
        a6f1Var.layout(i, top, a6f1Var.getMeasuredWidth() + i, a6f1Var.getMeasuredHeight() + top);
        View view = this.e;
        if (view != null) {
            f(view, (d4f1) a6f1Var.getConfiguration().b());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && (motionEvent2 = this.f) != null) {
            motionEvent2.recycle();
            this.f = null;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnAttachStateChangeListenerOn(View view) {
        this.g = view;
    }

    public void setOnScrollerListenerOn(s5f1 s5f1Var) {
        getOnScrollListener();
        throw null;
    }

    public TooltipContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TooltipContainer(Context context) {
        this(context, null, 0);
    }
}
