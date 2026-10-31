package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qtj1 implements o5s {
    public final /* synthetic */ s1r0 a;
    public final /* synthetic */ s1r0 b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ p811 d;
    public final /* synthetic */ View e;

    public qtj1(s1r0 s1r0Var, p811 p811Var, p811 p811Var2, View view) {
        this.b = s1r0Var;
        this.c = p811Var;
        this.d = p811Var2;
        this.e = view;
        this.a = s1r0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        x8c0 lifecycle;
        this.b.onDestroy(iac0Var);
        iac0 iac0Var2 = (iac0) this.c.a;
        if (iac0Var2 != null && (lifecycle = iac0Var2.getLifecycle()) != null) {
            lifecycle.d(this);
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) this.d.a;
        if (onAttachStateChangeListener != null) {
            this.e.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public final void onPause(iac0 iac0Var) {
        this.a.onPause(iac0Var);
    }

    public final void onResume(iac0 iac0Var) {
        this.a.onResume(iac0Var);
    }

    public final void onCreate(iac0 iac0Var) {
    }

    public final void onStart(iac0 iac0Var) {
    }

    public final void onStop(iac0 iac0Var) {
    }
}
