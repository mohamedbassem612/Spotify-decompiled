package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class skl1 implements h0r0 {
    public final qyj a;
    public final dll1 b;
    public final y4q0 c;
    public final ldj0 d;
    public final ilh1 e;
    public final cbr0 f;

    public skl1(qyj qyjVar, dll1 dll1Var, y4q0 y4q0Var, ldj0 ldj0Var, ilh1 ilh1Var) {
        this.a = qyjVar;
        this.b = dll1Var;
        this.c = y4q0Var;
        this.d = ldj0Var;
        this.e = ilh1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.h2(), nik1.M1, (nar0) null), new s9h1(14, true, false, false), new t1r0(true), new pu00(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1490048276, new rkl1(this), true));
    }
}
