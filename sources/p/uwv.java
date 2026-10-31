package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uwv implements h0r0 {
    public final yuj a;
    public final svv b;
    public final swv c;
    public final kly0 d;
    public final pwv e;
    public final cbr0 f;

    public uwv(jik1 jik1Var, yuj yujVar, svv svvVar, swv swvVar, lbp lbpVar, pwv pwvVar, e5b0 e5b0Var) {
        this.a = yujVar;
        this.b = svvVar;
        this.c = swvVar;
        this.d = lbpVar;
        this.e = pwvVar;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        hgr0 hgr0Var = new hgr0(egr0.a, 0, 2);
        lik1 viewUri = jik1Var.getViewUri();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, s9h1Var, hgr0Var, new bn70(yon1.M3(), viewUri, (nar0) null), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        o6e0 o6e0VarE = f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 18));
        j2i j2iVarJ = apo.j(1172027066, new k9s(this, (byte) 16), true);
        rbc rbcVar = rbc.b1;
        swv swvVar = this.c;
        return yuj.b(this.a, o6e0VarE, j2iVarJ, new n7e0(new twv(this), new z6n(swvVar), rbcVar, new r1t(swvVar, (byte) 9)));
    }
}
