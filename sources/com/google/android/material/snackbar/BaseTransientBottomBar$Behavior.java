package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p.eda;
import p.jda;
import p.mp8;
import p.ua91;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final mp8 h;

    public BaseTransientBottomBar$Behavior() {
        mp8 mp8Var = new mp8((byte) 3);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = (byte) 0;
        this.h = mp8Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        mp8 mp8Var = this.h;
        mp8Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                ua91.F().Q((eda) mp8Var.b);
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            ua91.F().P((eda) mp8Var.b);
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean t(View view) {
        this.h.getClass();
        return view instanceof jda;
    }
}
