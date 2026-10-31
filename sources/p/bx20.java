package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bx20 implements h0r0 {
    public final dx20 a;
    public final qyj b;
    public final kly0 c;
    public final ynb0 d;
    public final cbr0 e;

    public bx20(dx20 dx20Var, qyj qyjVar, chp chpVar, ynb0 ynb0Var, los losVar) {
        this.a = dx20Var;
        this.b = qyjVar;
        this.c = chpVar;
        this.d = ynb0Var;
        losVar.c(new gi00(this, (byte) 21));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.I4(), nik1.N5.b(dx20Var.a().g()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, true, (nsm0) null, 3613), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(-2085366994, new rr10(this, (byte) 8), true));
    }
}
