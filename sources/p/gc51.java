package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gc51 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hc51 c;

    public gc51(View view, int i, hc51 hc51Var) {
        this.a = view;
        this.b = i;
        this.c = hc51Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        hc51 hc51Var = this.c;
        int i = ((ec51) hc51Var.b.get()).e;
        int i2 = this.b;
        if (i2 == i) {
            hc51Var.b();
            hc51Var.e = view;
            fc51 fc51Var = new fc51(hc51Var, i2);
            hc51Var.f = fc51Var;
            view.addOnAttachStateChangeListener(fc51Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
