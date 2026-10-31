package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p9d0 implements h0r0 {
    public final hvj a;
    public final fo7 b;
    public final bqp c;
    public final ud1 d;
    public final vcd0 e;
    public final hgd0 f;
    public final tm g;
    public final r9d0 h;
    public final jed0 i;
    public final cbr0 j;

    public p9d0(hvj hvjVar, fo7 fo7Var, bqp bqpVar, ud1 ud1Var, vcd0 vcd0Var, hgd0 hgd0Var, tm tmVar, r9d0 r9d0Var, jed0 jed0Var) {
        this.a = hvjVar;
        this.b = fo7Var;
        this.c = bqpVar;
        this.d = ud1Var;
        this.e = vcd0Var;
        this.f = hgd0Var;
        this.g = tmVar;
        this.h = r9d0Var;
        this.i = jed0Var;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.j = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70(yon1.q2(), nik1.u4, (nar0) null), new yxe1(new jx21(2131957381))}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 4)), apo.j(-99746981, new n9d0(this, (byte) 3), true));
    }
}
