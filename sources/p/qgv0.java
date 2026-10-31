package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qgv0 implements h0r0 {
    public final los a;
    public final qyj b;
    public final yqu0 c;
    public final cbr0 d;

    public qgv0(los losVar, qyj qyjVar, yqu0 yqu0Var) {
        this.a = losVar;
        this.b = qyjVar;
        this.c = yqu0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.S4(), nik1.r5, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, true, (nsm0) null, 3797), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(673694541, new t1t0(this, (byte) 23), true));
    }
}
