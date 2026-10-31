package com.spotify.legacyglue.gluelib.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p.b8k1;
import p.e3n;
import p.h3n;
import p.jw40;
import p.os00;
import p.uck1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class GlueScrollingViewBehavior extends uck1 {
    public View d;

    public GlueScrollingViewBehavior() {
    }

    public final boolean b(View view, View view2) {
        return (view2 instanceof jw40) || (view2.getLayoutParams().a instanceof GlueHeaderAccessoryBehavior);
    }

    public final boolean d(View view, View view2) {
        HeaderBehavior headerBehavior = view2.getLayoutParams().a;
        if (!(headerBehavior instanceof HeaderBehavior)) {
            return true;
        }
        int height = view2.getHeight() + headerBehavior.u();
        View view3 = this.d;
        v((view3 != null ? view3.getMeasuredHeight() / 2 : 0) + height);
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        Iterator it = coordinatorLayout.m(view).iterator();
        do {
            if (!it.hasNext()) {
                view2 = null;
                break;
            }
            view2 = (View) it.next();
        } while (!(view2 instanceof jw40));
        super.h(coordinatorLayout, view, i);
        if (view2 != null) {
            h3n layoutParams = view2.getLayoutParams();
            e3n e3nVar = layoutParams != null ? layoutParams.a : null;
            if (e3nVar instanceof HeaderBehavior) {
                int height = view2.getHeight() + ((HeaderBehavior) e3nVar).u();
                View view3 = this.d;
                v((view3 != null ? view3.getMeasuredHeight() / 2 : 0) + height);
            }
        }
        return true;
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        View view2;
        View view3;
        ArrayList<View> arrayListM = coordinatorLayout.m(view);
        Iterator it = arrayListM.iterator();
        do {
            view2 = null;
            if (!it.hasNext()) {
                view3 = null;
                break;
            }
            view3 = (View) it.next();
        } while (!(view3.getLayoutParams().a instanceof GlueHeaderAccessoryBehavior));
        this.d = view3;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || arrayListM.isEmpty()) {
            return false;
        }
        for (View view4 : arrayListM) {
            if (view4 instanceof jw40) {
                view2 = view4;
                break;
            }
        }
        jw40 jw40Var = (jw40) view2;
        if (jw40Var == null) {
            return false;
        }
        WeakHashMap weakHashMap = b8k1.a;
        if (view2.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(size - (view2.getMeasuredHeight() - jw40Var.getTotalScrollRange()), i4 == -1 ? 1073741824 : os00.INVALID_ID), view);
        return true;
    }

    public GlueScrollingViewBehavior(Context context, AttributeSet attributeSet) {
    }
}
