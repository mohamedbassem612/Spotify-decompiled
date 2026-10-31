package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.b8k1;
import p.e3n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Deprecated
public abstract class ExpandableBehavior extends e3n {
    public ExpandableBehavior() {
    }

    public abstract boolean b(View view, View view2);

    public final boolean d(View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = b8k1.a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM = coordinatorLayout.m(view);
            int size = arrayListM.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(view, (View) arrayListM.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
