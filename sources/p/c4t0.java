package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c4t0 implements h0r0 {
    public final a8e0 a;
    public final ytp0 b;
    public final kxp c;
    public final abu d;
    public final tzo e;
    public final cbr0 f;

    public c4t0(a8e0 a8e0Var, ytp0 ytp0Var, kxp kxpVar, abu abuVar, tzo tzoVar, lik1 lik1Var) {
        p6r0 p6r0VarH6;
        this.a = a8e0Var;
        this.b = ytp0Var;
        this.c = kxpVar;
        this.d = abuVar;
        this.e = tzoVar;
        tc30 tc30Var = new tc30(1);
        hgr0 hgr0Var = new hgr0(egr0.a, 0, 2);
        if (sbl.y(abuVar)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarH6 = yon1.j6();
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarH6 = yon1.h6();
        }
        this.f = new cbr0(new dbr0[]{tc30Var, hgr0Var, new bn70(p6r0VarH6, lik1Var, (nar0) null), new stm0(4, true), new qsm0(new ez3((byte) 3)), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 29)), new fgs0(this, (byte) 7), this.e.b());
    }
}
