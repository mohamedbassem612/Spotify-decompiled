package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n8t0 implements h0r0 {
    public final yuj a;
    public final j8t0 b;
    public final t4d1 c;
    public final xfx d;
    public final p8t0 e;
    public final cbr0 f;

    public n8t0(yuj yujVar, j8t0 j8t0Var, t4d1 t4d1Var, xfx xfxVar, p8t0 p8t0Var, wpv0 wpv0Var) {
        this.a = yujVar;
        this.b = j8t0Var;
        this.c = t4d1Var;
        this.d = xfxVar;
        this.e = p8t0Var;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, wpv0Var.b.p(), false, false);
        yxe1 yxe1Var = new yxe1(new jx21(p8t0Var.a() ? 2131956576 : 2131959762));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, s9h1Var, yxe1Var, new bn70(yon1.w3(), new lik1(p8t0Var.getUri()), (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new l8t0(this, (lnm) null, (byte) 0)), apo.j(2123221289, new x3o0(this, (byte) 24), true), new n7e0(new m8t0(this), cps0.Y0, new nfb((byte) 19, false)));
    }
}
