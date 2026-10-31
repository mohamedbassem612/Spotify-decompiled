package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rau implements h0r0 {
    public final a8e0 a;
    public final ytp0 b;
    public final bbp c;
    public final abu d;
    public final tzo e;
    public final cbr0 f;

    public rau(a8e0 a8e0Var, ytp0 ytp0Var, bbp bbpVar, abu abuVar, tzo tzoVar, lik1 lik1Var) {
        this.a = a8e0Var;
        this.b = ytp0Var;
        this.c = bbpVar;
        this.d = abuVar;
        this.e = tzoVar;
        tc30 tc30Var = new tc30(1);
        hgr0 hgr0Var = new hgr0(egr0.a, 0, 2);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{tc30Var, hgr0Var, new bn70(yon1.h6(), lik1Var, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 13)), new s20(this, (byte) 15), this.e.b());
    }
}
