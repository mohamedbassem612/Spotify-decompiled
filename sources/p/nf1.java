package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nf1 implements h0r0 {
    public final yuj a;
    public final kf1 b;
    public final q59 c;
    public final ffe1 d;
    public final vf1 e;
    public final cbr0 f;

    public nf1(yuj yujVar, kf1 kf1Var, q59 q59Var, ffe1 ffe1Var, vf1 vf1Var) {
        this.a = yujVar;
        this.b = kf1Var;
        this.c = q59Var;
        this.d = ffe1Var;
        this.e = vf1Var;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70(yon1.U(), nik1.m0.b("spotify:addon:consideration:" + vf1Var.b() + ":" + vf1Var.a()), (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new dt0(this, (lnm) null, (byte) 2)), apo.j(-1870212435, new m3(this, (byte) 26), true), new n7e0(new mf1(this), e3.e1, new wdx0((byte) 27)));
    }
}
