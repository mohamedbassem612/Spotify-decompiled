package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ywb implements h0r0 {
    public final qyj a;
    public final axb b;
    public final los c;
    public final cbr0 d;

    public ywb(qyj qyjVar, axb axbVar, los losVar) {
        this.a = qyjVar;
        this.b = axbVar;
        this.c = losVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.V2(), nik1.N1, (nar0) null), new yxe1(new ehc1("")), new nxb((Integer) null, (ixb) null, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4063)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1203986200, new cka(this, (byte) 10), true));
    }
}
