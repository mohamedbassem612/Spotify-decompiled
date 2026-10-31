package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ptj1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ qtj1 b;

    public ptj1(p811 p811Var, qtj1 qtj1Var) {
        this.a = p811Var;
        this.b = qtj1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x8c0 lifecycle;
        x8c0 lifecycle2;
        p811 p811Var = this.a;
        iac0 iac0Var = (iac0) p811Var.a;
        qtj1 qtj1Var = this.b;
        if (iac0Var != null && (lifecycle2 = iac0Var.getLifecycle()) != null) {
            lifecycle2.d(qtj1Var);
        }
        iac0 iac0VarH = x9p1.h(view);
        p811Var.a = iac0VarH;
        iac0 iac0Var2 = iac0VarH;
        if (iac0Var2 == null || (lifecycle = iac0Var2.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(qtj1Var);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
