package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cc1 implements h0r0 {
    public final /* synthetic */ byte a = 1;
    public final cbr0 b;
    public final Object c;
    public final Object d;

    public cc1(los losVar, bc1 bc1Var, qyj qyjVar) {
        this.c = bc1Var;
        this.d = qyjVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{new bn70(yon1.x(), nik1.u0, (nar0) null), new t1r0(true), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        byte b = this.a;
        return this.b;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        switch (this.a) {
            case 0:
                return ((qyj) this.d).a(apo.j(2073617215, new ab(this, (byte) 18), true));
            default:
                return ((ix81) this.c).a(new y3o0(this, (byte) 18));
        }
    }

    public cc1(ix81 ix81Var, awj awjVar) {
        this.c = ix81Var;
        this.d = awjVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{new bn70(yon1.Z2(), nik1.q1, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }
}
