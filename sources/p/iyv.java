package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iyv implements h0r0 {
    public final yuj a;
    public final gyv b;
    public final cxv c;
    public final kly0 d;
    public final dyv e;
    public final cbr0 f;

    public iyv(jik1 jik1Var, yuj yujVar, gyv gyvVar, cxv cxvVar, lbp lbpVar, dyv dyvVar, e5b0 e5b0Var) {
        this.a = yujVar;
        this.b = gyvVar;
        this.c = cxvVar;
        this.d = lbpVar;
        this.e = dyvVar;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        hgr0 hgr0Var = new hgr0(egr0.a, 0, 2);
        lik1 viewUri = jik1Var.getViewUri();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, s9h1Var, hgr0Var, new bn70(yon1.N3(), viewUri, (nar0) null), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 19)), apo.j(1514996692, new k9s(this, (byte) 17), true), new n7e0(new hyv(this), new utt(this, (byte) 21), uwg.c1, new r1t(this.b, (byte) 10)));
    }
}
