package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gwv0 implements h0r0 {
    public final qyj a;
    public final kly0 b;
    public final yzh1 c;
    public final cbr0 d;

    public gwv0(los losVar, ynb0 ynb0Var, qyj qyjVar, ywp ywpVar, yzh1 yzh1Var) {
        this.a = qyjVar;
        this.b = ywpVar;
        this.c = yzh1Var;
        losVar.c(new xy50(ynb0Var, (byte) 26));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.k5(), nik1.Q5, (v8h1) ebp1.t()), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, true, (nsm0) null, 3797), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1748137072, new t1t0(this, (byte) 26), true));
    }
}
