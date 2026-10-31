package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y750 implements h0r0 {
    public final kyj a;
    public final w750 b;
    public final dh30 c;
    public final a850 d;

    public y750(kyj kyjVar, w750 w750Var, dh30 dh30Var, a850 a850Var) {
        this.a = kyjVar;
        this.b = w750Var;
        this.c = dh30Var;
        this.d = a850Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.H1(), nik1.g4, (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-213762849, new wx00(this, (byte) 15), true), new dx81(new x750(this), new u830(this, (byte) 23), o610.e, vc40.d1));
    }
}
