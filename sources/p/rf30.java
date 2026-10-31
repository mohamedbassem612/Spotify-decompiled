package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rf30 extends xf30 {
    public final /* synthetic */ zf30 a;

    public rf30(zf30 zf30Var) {
        this.a = zf30Var;
    }

    @Override // p.xf30
    public final void a() {
        zf30 zf30Var = this.a;
        zf30Var.x1.m();
        a6o1.k(zf30Var);
        Bundle bundle = zf30Var.b;
        zf30Var.x1.n(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
