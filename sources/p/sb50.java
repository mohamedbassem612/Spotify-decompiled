package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sb50 implements h0r0 {
    public final yuj a;
    public final f0b0 b;
    public final nb50 c;
    public final pb50 d;
    public final ub50 e;

    public sb50(yuj yujVar, f0b0 f0b0Var, nb50 nb50Var, pb50 pb50Var, ub50 ub50Var) {
        this.a = yujVar;
        this.b = f0b0Var;
        this.c = nb50Var;
        this.d = pb50Var;
        this.e = ub50Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.M1(), nik1.f4, (v8h1) x8p1.o()), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, bbp1.g(this.b.b()), apo.j(1495157346, new wx00(this, (byte) 20), true), new n7e0(new rb50(this), new jb50(this, (byte) 1), as10.e, r850.t));
    }
}
