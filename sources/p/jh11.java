package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jh11 implements h0r0 {
    public final yuj a;
    public final lzn0 b;
    public final nh11 c;
    public final gj10 d;
    public final zg11 e;
    public final qh11 f;
    public final wpv0 g;
    public final gw3 h;
    public final br0 i;
    public final ecd1 j;
    public final sve k;

    public jh11(yuj yujVar, lzn0 lzn0Var, nh11 nh11Var, gj10 gj10Var, zg11 zg11Var, qh11 qh11Var, wpv0 wpv0Var, gw3 gw3Var, br0 br0Var, ecd1 ecd1Var, sve sveVar) {
        this.a = yujVar;
        this.b = lzn0Var;
        this.c = nh11Var;
        this.d = gj10Var;
        this.e = zg11Var;
        this.f = qh11Var;
        this.g = wpv0Var;
        this.h = gw3Var;
        this.i = br0Var;
        this.j = ecd1Var;
        this.k = sveVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.x1(), cfm0.i("spotify:internal:regular-member-sub-account-details:", this.c.a(), nik1.Y3), (nar0) null), new pu00(true), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 8)), apo.j(-1277631638, new g001(this, (byte) 17), true), new n7e0(new ih11(this), h211.i, l9x0.f));
    }
}
