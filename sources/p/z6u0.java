package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z6u0 implements h0r0 {
    public final los a;
    public final kly0 b;
    public final kly0 c;
    public final qyj d;
    public final cbr0 e;

    public z6u0(u9c0 u9c0Var, los losVar, ywp ywpVar, ywp ywpVar2, qyj qyjVar, b7u0 b7u0Var) {
        this.a = losVar;
        this.b = ywpVar;
        this.c = ywpVar2;
        this.d = qyjVar;
        c921.y(u9c0Var, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 2), 3);
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.z3(), nik1.N6, (v8h1) sap1.j(k4s0.c(b7u0Var.a()))), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, false, (nsm0) null, 4053), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.d.a(apo.j(-660376349, new t1t0(this, (byte) 13), true));
    }
}
