package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z6o implements h0r0 {
    public final hvj a;
    public final dvp b;
    public final xj1 c;
    public final x6o d;
    public final los e;
    public final i8h1 f;
    public final cbr0 g;
    public final h4l0 h;

    public z6o(lik1 lik1Var, hvj hvjVar, dvp dvpVar, xj1 xj1Var, x6o x6oVar, c7o c7oVar, los losVar, i8h1 i8h1Var) {
        this.a = hvjVar;
        this.b = dvpVar;
        this.c = xj1Var;
        this.d = x6oVar;
        this.e = losVar;
        this.f = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.F5(), lik1Var, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
        this.h = w6p1.w(c7oVar.getEntityUri());
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.d), apo.j(-269209695, new mgl(this, (byte) 16), true));
    }
}
