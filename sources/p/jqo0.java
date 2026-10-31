package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jqo0 implements h0r0 {
    public final qyj a;
    public final rro0 b;
    public final res c;
    public final cbr0 d;

    public jqo0(qyj qyjVar, rro0 rro0Var, res resVar, los losVar) {
        this.a = qyjVar;
        this.b = rro0Var;
        this.c = resVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.K0(), nik1.j, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1277971824, new fhk0(this, (byte) 28), true));
    }
}
