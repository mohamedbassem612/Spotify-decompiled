package p;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g5t0 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ h5t0 a;

    public g5t0(h5t0 h5t0Var) {
        this.a = h5t0Var;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        h5t0 h5t0Var = this.a;
        Object objInvoke = h5t0Var.b.invoke(Boolean.valueOf(h5t0.c(h5t0Var.e, h5t0Var.d)));
        if (objInvoke != null) {
            h5t0Var.c.invoke(objInvoke);
        }
    }
}
