package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bh1 implements h0r0 {
    public final yuj a;
    public final kh1 b;
    public final xg1 c;
    public final fp8 d;
    public final vnd1 e;
    public final af10 f;
    public final cbr0 g;

    public bh1(yuj yujVar, kh1 kh1Var, xg1 xg1Var, fp8 fp8Var, vnd1 vnd1Var, af10 af10Var) {
        this.a = yujVar;
        this.b = kh1Var;
        this.c = xg1Var;
        this.d = fp8Var;
        this.e = vnd1Var;
        this.f = af10Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.z(), nik1.P1, (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new dt0(this, (lnm) null, (byte) 3)), apo.j(-1928913739, new m3(this, (byte) 27), true), new n7e0(new zg1(this), ah1.b, new gex0((byte) 27)));
    }
}
