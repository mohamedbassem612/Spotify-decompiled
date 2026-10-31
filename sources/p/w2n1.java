package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w2n1 implements h0r0 {
    public final d2n1 a;
    public final yuj b;
    public final r2n1 c;
    public final yrg0 d;
    public final frl1 e;
    public final cbr0 f;

    public w2n1(d2n1 d2n1Var, yuj yujVar, r2n1 r2n1Var, yrg0 yrg0Var, frl1 frl1Var) {
        this.a = d2n1Var;
        this.b = yujVar;
        this.c = r2n1Var;
        this.d = yrg0Var;
        this.e = frl1Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131964191));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.W2(), nik1.O2, (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(this.e.a(), apo.j(1221762757, new zyf1(this, (byte) 29), true), new n7e0(new u2n1(this), new v2n1(this, (byte) 0), wdx0.Y0), new xvj(jtj.b, (j2i) null, (j2i) null, false, 62));
    }
}
