package com.spotify.appendix.contentviewstate.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import p.fae0;
import p.g54;
import p.lce0;
import p.lqc;
import p.yd5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class LoadingView extends FrameLayout {
    public static final lqc S0 = new lqc((byte) 14);
    public int N0;
    public final g54 O0;
    public final lce0 P0;
    public final lce0 Q0;
    public final yd5 R0;
    public View a;
    public fae0 b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public View h;
    public AlphaAnimation i;
    public AlphaAnimation t;

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O0 = new g54(this, (byte) 9);
        this.P0 = new lce0(this, (byte) 0);
        this.Q0 = new lce0(this, (byte) 1);
        this.R0 = new yd5(this);
        this.b = S0;
        this.c = getResources().getInteger(2131492901);
        this.d = getResources().getInteger(2131492904);
        this.e = getResources().getInteger(2131492905);
        this.f = getResources().getInteger(2131492903);
        this.N0 = 1;
    }

    public final void a() {
        if (this.h == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(this.f);
        alphaAnimation.setInterpolator(getContext(), R.interpolator.decelerate_quad);
        this.h.startAnimation(alphaAnimation);
        this.h.setVisibility(0);
    }

    public final void b() {
        removeCallbacks(this.O0);
        removeCallbacks(this.P0);
        removeCallbacks(this.Q0);
        setAnimation(null);
        this.a.setAnimation(null);
        View view = this.h;
        if (view != null) {
            view.setAnimation(null);
        }
        setVisibility(8);
        this.a.setVisibility(4);
        this.N0 = 1;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(2131430528);
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        this.g = i;
        return super.onSetAlpha(i);
    }

    public void setDelayBeforeShowing(int i) {
        this.c = i;
    }

    public void setListener(fae0 fae0Var) {
        if (fae0Var == null) {
            this.b = S0;
        } else {
            this.b = fae0Var;
        }
    }

    public void setTargetContentView(View view) {
        this.h = view;
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context) {
        this(context, null, 0);
    }
}
