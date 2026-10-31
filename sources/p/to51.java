package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class to51 implements h0r0 {
    public final qyj a;
    public final vo51 b;
    public final kly0 c;
    public final cbr0 d;

    public to51(qyj qyjVar, vo51 vo51Var, jxp jxpVar, los losVar) {
        this.a = qyjVar;
        this.b = vo51Var;
        this.c = jxpVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.J4(), nik1.z6, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, true, (nsm0) null, 3613), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1476243518, new u841(this, (byte) 10), true));
    }
}
