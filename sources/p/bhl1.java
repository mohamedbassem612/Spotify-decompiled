package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bhl1 implements h0r0 {
    public final qyj a;
    public final kly0 b;
    public final cbr0 c;

    public bhl1(qyj qyjVar, tsq tsqVar, los losVar) {
        this.a = qyjVar;
        this.b = tsqVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.P4(), nik1.D6, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, false, (nsm0) null, 3869), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-752179705, new fak1(this, (byte) 12), true));
    }
}
