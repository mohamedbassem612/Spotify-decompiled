package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u591 implements h0r0 {
    public final hvj a;
    public final nu b;
    public final y591 c;
    public final y7h0 d;
    public final cbr0 e;

    public u591(hvj hvjVar, nu nuVar, y591 y591Var, y7h0 y7h0Var) {
        this.a = hvjVar;
        this.b = nuVar;
        this.c = y591Var;
        this.d = y7h0Var;
        dbr0 t1r0Var = new t1r0(true);
        dbr0 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70(yon1.k0(), nik1.u6, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, (los) null, false, false, false, (nsm0) null, 4085)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return hvj.b(this.a, si1.m(this.c, this.d), apo.j(1679176836, new k681(this, (byte) 14), true));
    }
}
