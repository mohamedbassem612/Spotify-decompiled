package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yaf implements h0r0 {
    public final lzn0 a;
    public final kt91 b;
    public final hvj c;
    public final abf d;
    public final xpi0 e;
    public final g1e0 f;
    public final pte g;
    public final veq h;
    public final xeq i;
    public final ksk0 j;
    public final cbr0 k;

    public yaf(lzn0 lzn0Var, kt91 kt91Var, hvj hvjVar, abf abfVar, xpi0 xpi0Var, g1e0 g1e0Var, pte pteVar, veq veqVar, xeq xeqVar) {
        this.a = lzn0Var;
        this.b = kt91Var;
        this.c = hvjVar;
        this.d = abfVar;
        this.e = xpi0Var;
        this.f = g1e0Var;
        this.g = pteVar;
        this.h = veqVar;
        this.i = xeqVar;
        ksk0 ksk0VarF = h5p1.F();
        this.j = ksk0VarF;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.k = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.z0(), nik1.b5.b(abfVar.getViewUri()), ksk0VarF), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.k;
    }

    public final p2r0 b() {
        return hvj.b(this.c, f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 24)), apo.j(1356175590, new dwd(this, (byte) 17), true));
    }
}
