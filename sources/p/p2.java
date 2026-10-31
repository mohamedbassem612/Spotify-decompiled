package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p2 implements h0r0 {
    public final hvj a;
    public final m2 b;
    public final b4v0 c;
    public final cbr0 d;

    public p2(lik1 lik1Var, hvj hvjVar, m2 m2Var, los losVar, b4v0 b4v0Var) {
        this.a = hvjVar;
        this.b = m2Var;
        this.c = b4v0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.r(), lik1Var, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.b), apo.j(1387064656, new o2(this, (byte) 0), true));
    }
}
