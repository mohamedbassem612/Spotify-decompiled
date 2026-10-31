package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p8r0 implements h0r0 {
    public final hvj a;
    public final hx60 b;
    public final lmw c;
    public final o860 d;
    public final q8r0 e;
    public final ien0 f;
    public final cbr0 g;

    public p8r0(hvj hvjVar, hx60 hx60Var, lmw lmwVar, o860 o860Var, q8r0 q8r0Var) {
        this.a = hvjVar;
        this.b = hx60Var;
        this.c = lmwVar;
        this.d = o860Var;
        this.e = q8r0Var;
        ien0 ien0Var = new ien0((Object) null);
        this.f = ien0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.r1(), nik1.K1, (nar0) null), new a6o0(ien0Var), new t1r0(true), new s9h1(14, true, false, false), new tc30(1)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.b), apo.j(-1358703886, new n1r0(this, (byte) 1), true));
    }
}
