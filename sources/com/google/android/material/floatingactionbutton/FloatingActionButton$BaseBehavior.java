package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.e3n;
import p.h3n;
import p.omz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class FloatingActionButton$BaseBehavior<T> extends e3n {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.o);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(View view) {
        throw new ClassCastException();
    }

    public final void c(h3n h3nVar) {
        if (h3nVar.h == 0) {
            h3nVar.h = 80;
        }
    }

    public final boolean d(View view, View view2) {
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
