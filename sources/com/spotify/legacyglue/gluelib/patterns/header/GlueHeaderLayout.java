package com.spotify.legacyglue.gluelib.patterns.header;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueHeaderAccessoryBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import p.eg;
import p.h3n;
import p.i3n;
import p.jw40;
import p.jx40;
import p.w5o0;
import p.xt41;
import p.zw40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Deprecated
public class GlueHeaderLayout extends w5o0 {
    public GlueHeaderLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        KeyEvent.Callback callbackB = B(false);
        callbackB.getClass();
        jw40 jw40Var = (jw40) callbackB;
        HeaderBehavior headerBehavior = jw40Var.getView().getLayoutParams().a;
        if (headerBehavior == null || headerBehavior.u() <= (-jw40Var.getTotalScrollRange()) - headerBehavior.k) {
            return;
        }
        ValueAnimator valueAnimator = headerBehavior.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            headerBehavior.j = null;
        }
        View view = (View) jw40Var;
        int i = (-jw40Var.getTotalScrollRange()) - headerBehavior.k;
        int iMax = Math.max(Integer.MIN_VALUE, Math.min(i, Integer.MAX_VALUE));
        jw40 jw40Var2 = (jw40) view;
        int i2 = (-jw40Var2.getTotalScrollRange()) - headerBehavior.k;
        headerBehavior.x(view);
        int iU = headerBehavior.u();
        int iMax2 = Math.max(i2, Math.min(i, 0));
        if (iU < i2 || iU > 0 || iU == iMax2) {
            return;
        }
        headerBehavior.u();
        headerBehavior.v(iMax);
        view.setAlpha(1.0f);
        int iMin = Math.min(-iMax, jw40Var2.getTotalScrollRange());
        ((xt41) view).a(iMin / jw40Var2.getTotalScrollRange(), iMin);
        f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View B(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof jw40) {
                return childAt;
            }
        }
        if (z) {
            return null;
        }
        eg.m("Must have a Behaving header");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view, boolean z) {
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            if (childAt.getLayoutParams().a instanceof GlueHeaderAccessoryBehavior) {
                break;
            } else {
                i++;
            }
        }
        if (childAt != null) {
            removeView(childAt);
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            h3n h3nVar = (layoutParams == null || !z) ? new h3n(-2, -2) : CoordinatorLayout.h(layoutParams);
            h3nVar.b(new GlueHeaderAccessoryBehavior());
            addView(view, h3nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(View view, HeaderBehavior headerBehavior, boolean z) {
        View viewB = B(true);
        if (z || viewB != view) {
            View viewB2 = B(true);
            if (viewB2 != null) {
                removeView(viewB2);
            }
            View view2 = ((jw40) view).getView();
            h3n h3nVar = new h3n(-1, -2);
            h3nVar.b(headerBehavior);
            addView(view2, 1, h3nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        if (B(true) == null) {
            D(new jx40(getContext()), new GlueNoHeaderBehavior(), true);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof zw40) {
            super/*androidx.coordinatorlayout.widget.CoordinatorLayout*/.onRestoreInstanceState(((zw40) parcelable).a);
        } else {
            super/*androidx.coordinatorlayout.widget.CoordinatorLayout*/.onRestoreInstanceState(parcelable);
        }
    }

    public final Parcelable onSaveInstanceState() {
        i3n i3nVarOnSaveInstanceState = super/*androidx.coordinatorlayout.widget.CoordinatorLayout*/.onSaveInstanceState();
        zw40 zw40Var = new zw40(AbsSavedState.EMPTY_STATE);
        zw40Var.a = i3nVarOnSaveInstanceState;
        return zw40Var;
    }

    public void setAccessory(View view) {
        C(view, false);
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
