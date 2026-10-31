package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b1k1 implements h0r0 {
    public final yuj a;
    public final lzn0 b;
    public final f1k1 c;
    public final gj10 d;
    public final r0k1 e;
    public final wpv0 f;

    public b1k1(yuj yujVar, lzn0 lzn0Var, f1k1 f1k1Var, gj10 gj10Var, r0k1 r0k1Var, wpv0 wpv0Var) {
        this.a = yujVar;
        this.b = lzn0Var;
        this.c = f1k1Var;
        this.d = gj10Var;
        this.e = r0k1Var;
        this.f = wpv0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.d4(), cfm0.i("spotify:internal:regular-member-sub-account-details:video-settings:", this.c.a(), nik1.Z3), (nar0) null), new pu00(true), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 24)), apo.j(2128848758, new zyf1(this, (byte) 23), true), new n7e0(new a1k1(this), olj1.X, u3x0.X0));
    }
}
