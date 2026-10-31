package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pd11 implements h0r0 {
    public final qyj a;
    public final ngs0 b;
    public final rd11 c;
    public final cbr0 d;

    public pd11(qyj qyjVar, los losVar, ngs0 ngs0Var, rd11 rd11Var) {
        this.a = qyjVar;
        this.b = ngs0Var;
        this.c = rd11Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.F4(), new lik1(rd11Var.getEntityUri()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(395492613, new ziz0(this, (byte) 19), true));
    }
}
