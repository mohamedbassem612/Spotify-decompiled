package p;

import java.util.function.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zb30 implements Supplier {
    public final /* synthetic */ zyp0 a;

    public zb30(zyp0 zyp0Var) {
        this.a = zyp0Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        dc30 dc30Var = (dc30) dc30.k.getValue();
        zyp0 zyp0Var = this.a;
        if (dc30Var != zyp0Var.u) {
            zyp0Var.E = null;
        }
        zyp0Var.u = dc30Var;
        return zyp0Var;
    }
}
