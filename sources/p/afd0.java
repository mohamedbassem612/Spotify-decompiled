package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class afd0 implements h0r0 {
    public final qyj a;
    public final et90 b;
    public final cbr0 c;

    public afd0(qyj qyjVar, et90 et90Var) {
        this.a = qyjVar;
        this.b = et90Var;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70((n6r0) yon1.r2(), nik1.v4, (v8h1) s9p1.I()), new yxe1(new jx21(2131957431))}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1470840625, new s2c0(this, (byte) 16), true));
    }
}
