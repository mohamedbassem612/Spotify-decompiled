package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cl20 implements h0r0 {
    public final pbq a;
    public final zk20 b;
    public final kyj c;
    public final cbr0 d;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public cl20(los losVar, pbq pbqVar, zk20 zk20Var, kyj kyjVar) {
        this.a = pbqVar;
        this.b = zk20Var;
        this.c = kyjVar;
        dbr0 t1r0Var = new t1r0(true);
        dbr0 nxbVar = new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, false, (nsm0) null, 4053);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{t1r0Var, nxbVar, new bn70(yon1.L(), nik1.E1, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.c.a(apo.j(-1702197297, new wx00(this, (byte) 8), true), new dx81(new bl20(this), vd20.X, mi10.c));
    }
}
