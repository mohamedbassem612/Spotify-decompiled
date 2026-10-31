package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class an2 implements h0r0 {
    public final kyj a;
    public final dn2 b;
    public final rm2 c;
    public final cn2 d;
    public final lsr e;

    public an2(kyj kyjVar, dn2 dn2Var, rm2 rm2Var, cn2 cn2Var, lsr lsrVar) {
        this.a = kyjVar;
        this.b = dn2Var;
        this.c = rm2Var;
        this.d = cn2Var;
        this.e = lsrVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.l2(), nik1.v3, (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1607856790, new v72(this, (byte) 3), true), new dx81(new ym2(this), new zm2(this), uwg.f, ny1.b1));
    }
}
