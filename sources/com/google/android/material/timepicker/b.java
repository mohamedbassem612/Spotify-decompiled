package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.google.android.material.timepicker.ClockFaceView, p.roz0] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ?? r0 = this.a;
        ClockHandView clockHandView = r0.W0;
        if (r0.isShown()) {
            r0.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((r0.getHeight() / 2) - clockHandView.b) - r0.d1;
            if (height != r0.U0) {
                r0.U0 = height;
                r0.y();
                clockHandView.t = r0.U0;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
