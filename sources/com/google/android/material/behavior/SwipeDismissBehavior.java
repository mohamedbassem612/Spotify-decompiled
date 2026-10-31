package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p.b8k1;
import p.e3n;
import p.fg;
import p.jc9;
import p.k8k1;
import p.o2b1;
import p.t9d1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class SwipeDismissBehavior<V extends View> extends e3n {
    public k8k1 a;
    public jc9 b;
    public boolean c;
    public byte d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final t9d1 g = new t9d1(this);

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zP = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!zP) {
            return false;
        }
        k8k1 k8k1Var = this.a;
        if (k8k1Var == null) {
            k8k1Var = new k8k1(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            this.a = k8k1Var;
        }
        return k8k1Var.q(motionEvent);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = b8k1.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            b8k1.l(view, 1048576);
            b8k1.h(view, 0);
            if (t(view)) {
                b8k1.m(view, fg.o, (CharSequence) null, new o2b1(this, (byte) 9));
            }
        }
        return false;
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        k8k1 k8k1Var = this.a;
        if (k8k1Var == null) {
            return false;
        }
        k8k1Var.j(motionEvent);
        return true;
    }

    public boolean t(View view) {
        return true;
    }
}
