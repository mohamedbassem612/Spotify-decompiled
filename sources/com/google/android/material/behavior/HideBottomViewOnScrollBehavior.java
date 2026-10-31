package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.d20;
import p.e3n;
import p.je5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends e3n {
    public int a = 0;
    public byte b = 2;
    public ViewPropertyAnimator c;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    public final void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.b = (byte) 1;
            this.c = view.animate().translationY(this.a).setInterpolator(je5.c).setDuration(175L).setListener(new d20(this, (byte) 6));
            return;
        }
        if (i2 >= 0 || this.b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.b = (byte) 2;
        this.c = view.animate().translationY(0.0f).setInterpolator(je5.d).setDuration(225L).setListener(new d20(this, (byte) 6));
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
