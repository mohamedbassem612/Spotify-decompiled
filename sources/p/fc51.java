package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fc51 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ hc51 a;
    public final /* synthetic */ int b;

    public fc51(hc51 hc51Var, int i) {
        this.a = hc51Var;
        this.b = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        p4g0 p4g0Var = new p4g0(this.b, (byte) 18);
        hc51 hc51Var = this.a;
        if (hc51Var.e(p4g0Var).c || hc51Var.f == this) {
            hc51Var.b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
