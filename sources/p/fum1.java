package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fum1 implements h0r0 {
    public final qyj a;
    public final l6s b;
    public final cbr0 c;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public fum1(qyj qyjVar, l6s l6sVar) {
        this.a = qyjVar;
        this.b = l6sVar;
        t1r0 t1r0Var = new t1r0(true);
        dbr0 nxbVar = new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, (los) null, false, false, false, (nsm0) null, 4085);
        bt21 bt21Var = new bt21();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{t1r0Var, nxbVar, bt21Var, new bn70(yon1.l6(), new lik1("spotify:internal:your-library:messaging"), (nar0) null), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(937261140, new eum1(this, (byte) 1), true));
    }
}
