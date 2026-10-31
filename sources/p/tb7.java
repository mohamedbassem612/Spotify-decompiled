package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tb7 implements h0r0 {
    public final kly0 a;
    public final cbr0 b;

    public tb7(lik1 lik1Var, rg7 rg7Var, jly0 jly0Var) {
        this.a = jly0Var;
        t45 t45VarA = rg7Var.a.a("load_assisted_curation");
        t45VarA.h = "assisted-curation";
        t45VarA.l("Load", "assisted-curation", true);
        rg7Var.b = t45VarA;
        dbr0 yxe1Var = new yxe1(new jx21(2131952546));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.Q(), lik1Var, z4p1.C()), new t1r0(true), new hgr0(egr0.a, 0, 2)}, false);
    }

    public final cbr0 a() {
        return this.b;
    }

    public final p2r0 b() {
        return ((o0p) this.a.get()).a().j();
    }
}
