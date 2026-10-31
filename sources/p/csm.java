package p;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class csm implements h0r0 {
    public final qyj a;
    public final esm b;
    public final Application c;
    public final mm21 d;
    public final cbr0 e;

    public csm(lik1 lik1Var, qyj qyjVar, los losVar, esm esmVar, Application application, mm21 mm21Var) {
        this.a = qyjVar;
        this.b = esmVar;
        this.c = application;
        this.d = mm21Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.i1(), lik1Var, (nar0) null), new t1r0(true), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(40352855, new h1m(this, (byte) 12), true));
    }
}
