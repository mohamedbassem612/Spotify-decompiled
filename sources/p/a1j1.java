package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a1j1 implements h0r0 {
    public final yuj a;
    public final t0j1 b;
    public final a3e0 c;
    public final jtl1 d;
    public final bgl0 e;
    public final boolean f;
    public final cbr0 g;

    public a1j1(yuj yujVar, t0j1 t0j1Var, a3e0 a3e0Var, jtl1 jtl1Var, bgl0 bgl0Var, ot4 ot4Var) {
        this.a = yujVar;
        this.b = t0j1Var;
        this.c = a3e0Var;
        this.d = jtl1Var;
        this.e = bgl0Var;
        this.f = ot4Var.b();
        yxe1 yxe1Var = new yxe1(new jx21(2131963722));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.S2(), nik1.e0, (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 22)), apo.j(-747814453, new zyf1(this, (byte) 13), true), new n7e0(new z0j1(this), zhi1.g, b4x0.V0));
    }
}
