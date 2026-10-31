package com.spotify.legacyglue.gluelib.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import p.bno1;
import p.uck1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class GlueFastScrollerBehavior extends uck1 {
    public GlueFastScrollerBehavior() {
    }

    public static RecyclerView w(CoordinatorLayout coordinatorLayout, RecyclerViewFastScroller recyclerViewFastScroller) {
        RecyclerView recyclerView = null;
        for (View view : coordinatorLayout.m(recyclerViewFastScroller)) {
            if (view instanceof RecyclerView) {
                recyclerView = (RecyclerView) view;
            }
        }
        return recyclerView;
    }

    public final boolean b(View view, View view2) {
        return view2 instanceof RecyclerView;
    }

    public final boolean d(View view, View view2) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        recyclerViewFastScroller.offsetTopAndBottom(view2.getTop() - recyclerViewFastScroller.getTop());
        boolean z = recyclerViewFastScroller.t;
        recyclerViewFastScroller.t = false;
        recyclerViewFastScroller.N0.removeCallbacks(recyclerViewFastScroller.O0);
        if (!z) {
            return true;
        }
        recyclerViewFastScroller.b();
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        super.h(coordinatorLayout, recyclerViewFastScroller, i);
        RecyclerView recyclerViewW = w(coordinatorLayout, recyclerViewFastScroller);
        if (recyclerViewW == null) {
            return false;
        }
        if (!bno1.t(coordinatorLayout)) {
            recyclerViewFastScroller.layout(recyclerViewW.getRight() - recyclerViewFastScroller.getMeasuredWidth(), recyclerViewW.getTop(), recyclerViewW.getRight(), recyclerViewW.getBottom());
            return true;
        }
        recyclerViewFastScroller.layout(recyclerViewW.getLeft(), recyclerViewW.getTop(), recyclerViewFastScroller.getMeasuredWidth() + recyclerViewW.getLeft(), recyclerViewW.getBottom());
        return true;
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        RecyclerView recyclerViewW = w(coordinatorLayout, recyclerViewFastScroller);
        if (recyclerViewW == null) {
            return false;
        }
        recyclerViewFastScroller.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(recyclerViewW.getMeasuredHeight(), 1073741824));
        return true;
    }

    public GlueFastScrollerBehavior(Context context, AttributeSet attributeSet) {
    }
}
