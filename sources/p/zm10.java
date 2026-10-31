package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zm10 implements h0r0 {
    public final hvj a;
    public final bn10 b;
    public final w2z c;
    public final zrg d;
    public final kp00 e;
    public final h0y f;
    public final cbr0 g;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public zm10(hvj hvjVar, bn10 bn10Var, w2z w2zVar, zrg zrgVar, kp00 kp00Var, h0y h0yVar) {
        this.a = hvjVar;
        this.b = bn10Var;
        this.c = w2zVar;
        this.d = zrgVar;
        this.e = kp00Var;
        this.f = h0yVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G5(), nik1.q3.b(bn10Var.getUri()), (nar0) null), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new pbg(this, (lnm) null, (byte) 23)), apo.j(903856464, new o8x(this, (byte) 25), true));
    }
}
