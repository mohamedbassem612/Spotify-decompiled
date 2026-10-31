package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gb50 implements h0r0 {
    public final kyj a;
    public final db50 b;
    public final ro30 c;

    public gb50(kyj kyjVar, db50 db50Var, ro30 ro30Var) {
        this.a = kyjVar;
        this.b = db50Var;
        this.c = ro30Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.L1(), nik1.e4, (v8h1) w8p1.x()), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(2000279115, new wx00(this, (byte) 19), true), new dx81(new fb50(this), r850.h, ok10.e, r850.i));
    }
}
