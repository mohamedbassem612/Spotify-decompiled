package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hto {
    public final a5b0 a;
    public final a7n b;
    public final kly0 c;
    public final cyu d;
    public final dtt0 e;
    public final q0d0 f;
    public final yko g;
    public final mtt0 h;
    public final a9q i;
    public final Flowable j;
    public final six0 k;
    public final csy l;
    public final iry m;
    public final gd0 n;
    public final nlj1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ztw0 f21p;
    public final ytf0 q;
    public final saz0 r;
    public final lrh s;
    public final fum t;
    public final w4b0 u;
    public final yaq v;
    public final l20 w;
    public final co9 x;
    public final kc3 y;

    public hto(a5b0 a5b0Var, a7n a7nVar, r7q r7qVar, cyu cyuVar, dtt0 dtt0Var, q0d0 q0d0Var, yko ykoVar, mtt0 mtt0Var, a9q a9qVar, Flowable flowable, six0 six0Var, csy csyVar, iry iryVar, gd0 gd0Var, nlj1 nlj1Var, ztw0 ztw0Var, ytf0 ytf0Var, saz0 saz0Var, lrh lrhVar, fum fumVar, w4b0 w4b0Var, yaq yaqVar, l20 l20Var, co9 co9Var, kc3 kc3Var) {
        this.a = a5b0Var;
        this.b = a7nVar;
        this.c = r7qVar;
        this.d = cyuVar;
        this.e = dtt0Var;
        this.f = q0d0Var;
        this.g = ykoVar;
        this.h = mtt0Var;
        this.i = a9qVar;
        this.j = flowable;
        this.k = six0Var;
        this.l = csyVar;
        this.m = iryVar;
        this.n = gd0Var;
        this.o = nlj1Var;
        this.f21p = ztw0Var;
        this.q = ytf0Var;
        this.r = saz0Var;
        this.s = lrhVar;
        this.t = fumVar;
        this.u = w4b0Var;
        this.v = yaqVar;
        this.w = l20Var;
        this.x = co9Var;
        this.y = kc3Var;
    }

    public final rzq a(n6r0 n6r0Var, String str, iu30 iu30Var) {
        kc3 kc3Var = this.y;
        ht20 huzVar = (str == null || str.length() == 0 || !nhc1.Y(str, "spotify:album:", false)) ? new huz(Boolean.FALSE, (byte) 10) : new ht20(new x010(((t7n0) kc3Var.a.get()).a(str), t5p1.i(((buf0) kc3Var.b.get()).a()), new ap51(3, (lnm) null, (byte) 13), (byte) 1), new egv0(2, (lnm) null, (byte) 28));
        lql1 lql1Var = new lql1(huzVar, dm5.F(v061.e, kc3Var.c, new hdo(huzVar, (byte) 3), u5l1.R0, (vu30) null, 24));
        j3r j3rVar = rzq.y;
        return l2p1.f(((r2r) this.c.get()).a("android-kodiak-datasourcebuilderimpl", new uh0(this, n6r0Var, str, lql1Var, iu30Var, (byte) 18)));
    }
}
