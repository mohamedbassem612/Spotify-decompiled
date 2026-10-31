package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vw91 implements h0r0 {
    public final kyj a;
    public final ua91 b;
    public final zw91 c;
    public final irs d;
    public final cbr0 e;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public vw91(los losVar, kyj kyjVar, ua91 ua91Var, zw91 zw91Var, irs irsVar) {
        this.a = kyjVar;
        this.b = ua91Var;
        this.c = zw91Var;
        this.d = irsVar;
        dbr0 t1r0Var = new t1r0(true);
        dbr0 nxbVar = new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, false, (nsm0) null, 4053);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{t1r0Var, nxbVar, new bn70(yon1.r5(), new lik1("spotify:internal:snooze-recommendation"), z5p1.n()), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(912619110, new cq61(this, (byte) 26), true), new dx81(new uw91(this), new dr91(this, (byte) 4), h2x0.O0));
    }
}
