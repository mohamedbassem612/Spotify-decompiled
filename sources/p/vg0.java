package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vg0 implements iyf0 {
    public final dg30 a;
    public final gar0 b;
    public final ug0 c;

    public vg0(dg30 dg30Var, gar0 gar0Var, ug0 ug0Var) {
        this.a = dg30Var;
        this.b = gar0Var;
        this.c = ug0Var;
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
        gar0 gar0Var = this.b;
        bpb1 bpb1Var = gar0Var.a;
        ug0 ug0Var = this.c;
        bpb1Var.m(null, ug0Var);
        ((f0i) this.a).a.a(new i83(new shq0(gar0Var, ug0Var, (byte) 6), (byte) 16));
    }

    @Override // p.iyf0
    public final void c() {
    }

    @Override // p.iyf0
    public final void d() {
    }
}
