package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ca9 implements h0r0 {
    public final yuj a;
    public final ka9 b;
    public final z99 c;
    public final fv9 d;
    public final wpv0 e;
    public final cbr0 f;

    public ca9(yuj yujVar, ka9 ka9Var, z99 z99Var, fv9 fv9Var, wpv0 wpv0Var) {
        this.a = yujVar;
        this.b = ka9Var;
        this.c = z99Var;
        this.d = fv9Var;
        this.e = wpv0Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.a4(), nik1.R1, (nar0) null), new t1r0(true), new s9h1(14, wpv0Var.b.n(), false, false), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new dt0(this, (lnm) null, (byte) 14)), apo.j(1508573731, new v72(this, (byte) 27), true), new n7e0(new ba9(this), tj8.i, new ybx0((byte) 29)));
    }
}
