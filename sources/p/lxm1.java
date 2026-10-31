package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lxm1 implements h0r0 {
    public final qyj a;
    public final pvq b;
    public final cbr0 c;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public lxm1(los losVar, qyj qyjVar, pvq pvqVar) {
        this.a = qyjVar;
        this.b = pvqVar;
        t1r0 t1r0Var = new t1r0(true);
        dbr0 nxbVar = new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, true, (nsm0) null, 3797);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{t1r0Var, nxbVar, new bn70(yon1.n6(), new lik1("spotify:collection:tags"), (nar0) null), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-226151589, new fak1(this, (byte) 26), true));
    }
}
