package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u950 implements h0r0 {
    public final kyj a;
    public final r950 b;
    public final vx40 c;
    public final w950 d;

    public u950(kyj kyjVar, r950 r950Var, vx40 vx40Var, w950 w950Var) {
        this.a = kyjVar;
        this.b = r950Var;
        this.c = vx40Var;
        this.d = w950Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.K1(), nik1.h4, (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-101998363, new wx00(this, (byte) 18), true), new dx81(new t950(this), new u830(this, (byte) 25), si10.e, r850.e));
    }
}
