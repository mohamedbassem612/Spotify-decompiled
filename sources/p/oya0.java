package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oya0 implements h0r0 {
    public final yuj a;
    public final lya0 b;
    public final thg1 c;
    public final haa0 d;
    public final shg1 e;
    public final xk f;

    public oya0(yuj yujVar, lya0 lya0Var, thg1 thg1Var, haa0 haa0Var, shg1 shg1Var, xk xkVar) {
        this.a = yujVar;
        this.b = lya0Var;
        this.c = thg1Var;
        this.d = haa0Var;
        this.e = shg1Var;
        this.f = xkVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new jx21(2131957091));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.n2(), cfm0.i("spotify:internal:kid-account-transition:consent:", this.c.a(), nik1.G3), (v8h1) z8p1.r()), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 1)), apo.j(-1060540354, new bt70(this, (byte) 18), true), new n7e0(new nya0(this), ul90.S0, bk20.g, jqa0.Y));
    }
}
