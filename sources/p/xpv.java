package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xpv implements h0r0 {
    public final lzn0 a;
    public final o6e0 b;
    public final hvj c;
    public final kly0 d;
    public final cbr0 e;

    public xpv(lzn0 lzn0Var, o6e0 o6e0Var, zpv zpvVar, hvj hvjVar, lbp lbpVar) {
        this.a = lzn0Var;
        this.b = o6e0Var;
        this.c = hvjVar;
        this.d = lbpVar;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70((n6r0) yon1.G3(), nik1.G.b(zpvVar.getPageUri()), (v8h1) j7p1.u())}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.c, this.b, apo.j(692829013, new oat(this, (byte) 18), true));
    }
}
