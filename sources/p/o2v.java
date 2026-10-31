package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o2v implements h0r0 {
    public final qyj a;
    public final q2v b;
    public final kly0 c;
    public final ynb0 d;
    public final cbr0 e;

    public o2v(qyj qyjVar, q2v q2vVar, lbp lbpVar, ynb0 ynb0Var, d05 d05Var, los losVar) {
        this.a = qyjVar;
        this.b = q2vVar;
        this.c = lbpVar;
        this.d = ynb0Var;
        losVar.c(new nit(this, (byte) 17));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.H4(), nik1.C6, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, true, (nsm0) null, 3613), new t1r0(true), new s9h1(6, true, false, d05Var.a())}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1452669829, new utt(this, (byte) 7), true));
    }
}
