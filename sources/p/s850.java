package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s850 implements h0r0 {
    public final kyj a;
    public final o850 b;
    public final lc20 c;
    public final u850 d;

    public s850(kyj kyjVar, o850 o850Var, lc20 lc20Var, u850 u850Var) {
        this.a = kyjVar;
        this.b = o850Var;
        this.c = lc20Var;
        this.d = u850Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.I1(), nik1.a4, (v8h1) s8p1.u()), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1182585057, new wx00(this, (byte) 16), true), new dx81(new q850(this), new u830(this, (byte) 24), e710.e, r850.b));
    }
}
