package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qyd1 implements h0r0 {
    public final qyj a;
    public final yup0 b;
    public final cbr0 c;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public qyd1(qyj qyjVar, yup0 yup0Var, los losVar) {
        this.a = qyjVar;
        this.b = yup0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.L0(), nik1.h, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4061), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(146128469, new gsc1(this, (byte) 11), true));
    }
}
