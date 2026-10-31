package com.spotify.legacyglue.gluelib.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.e3n;
import p.h3n;
import p.jw40;
import p.uck1;
import p.wck1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class GlueHeaderAccessoryBehavior extends uck1 {
    public GlueHeaderAccessoryBehavior() {
    }

    public final boolean b(View view, View view2) {
        return view2 instanceof jw40;
    }

    public final boolean d(View view, View view2) {
        h3n layoutParams = view2.getLayoutParams();
        e3n e3nVar = layoutParams != null ? layoutParams.a : null;
        if (!(e3nVar instanceof HeaderBehavior)) {
            return false;
        }
        v(view2.getHeight() + ((HeaderBehavior) e3nVar).u());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.uck1
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        int paddingTop = coordinatorLayout.getPaddingTop();
        int measuredWidth = (coordinatorLayout.getMeasuredWidth() / 2) - (view.getMeasuredWidth() / 2);
        view.layout(measuredWidth, paddingTop - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + measuredWidth, (view.getMeasuredHeight() / 2) + paddingTop);
        t(view);
        for (View view2 : coordinatorLayout.m(view)) {
            if (view2 instanceof jw40) {
                wck1 wck1Var = this.a;
                wck1Var.e = view2.getMeasuredHeight() - ((jw40) view2).getTotalScrollRange();
                wck1Var.f = Integer.MAX_VALUE;
                wck1Var.g = true;
                break;
            }
        }
        View viewB = ((GlueHeaderLayout) coordinatorLayout).B(true);
        if (viewB != null) {
            h3n layoutParams = viewB.getLayoutParams();
            e3n e3nVar = layoutParams != null ? layoutParams.a : null;
            if (e3nVar instanceof HeaderBehavior) {
                v(viewB.getHeight() + ((HeaderBehavior) e3nVar).u());
            }
        }
        return true;
    }

    public GlueHeaderAccessoryBehavior(Context context, AttributeSet attributeSet) {
    }
}
