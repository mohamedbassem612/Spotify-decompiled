package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rmi0 implements h0r0 {
    public final vrp a;
    public final nmi0 b;
    public final umi0 c;

    public rmi0(gx81 gx81Var, vrp vrpVar, nmi0 nmi0Var, umi0 umi0Var) {
        this.a = vrpVar;
        this.b = nmi0Var;
        this.c = umi0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.s3(), this.c.getViewUri(), (v8h1) d9p1.n()), new ktl1(32)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return gx81.a(new pmi0(this, (byte) 0), new dx81(new qmi0(this), new pmi0(this, (byte) 1), ua20.N0));
    }
}
