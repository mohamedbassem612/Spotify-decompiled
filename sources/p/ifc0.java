package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ifc0 implements drb {
    public final mop a;
    public final nop b;
    public final dt71 c;
    public final bpb1 d;
    public final LinkedHashMap e;
    public final xe01 f;
    public final xe01 g;
    public final yd91 h;
    public final mr20 i;
    public final ke71 j;
    public final String k;
    public final orb l;
    public final dt71 m;
    public final xe01 n;
    public final pdb0 o;

    public ifc0(u9c0 u9c0Var, ff20 ff20Var, xec0 xec0Var, mop mopVar, nop nopVar) {
        this.a = mopVar;
        this.b = nopVar;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.c = dt71VarE;
        this.d = gio1.b(Boolean.FALSE);
        this.e = new LinkedHashMap();
        s1g s1gVar = new s1g(new fu20(ff20Var.c, new c4z(2, xec0Var, xec0.class, "reconcile", "reconcile(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 19), (byte) 1), (byte) 3);
        alb1 alb1VarA = ey71.a(2);
        z6x z6xVar = z6x.a;
        xe01 xe01VarT = d5p1.t(s1gVar, u9c0Var, alb1VarA, z6xVar);
        this.f = xe01VarT;
        this.g = d5p1.t(new xr0(xe01VarT, (byte) 20), u9c0Var, ey71.a(3), (Object) null);
        this.h = new yd91(3, new dfc0(this, (byte) 1));
        this.i = rqt0.u(new xr0(xe01VarT, (byte) 21));
        lx70 lx70Var = lx70.c1;
        ke71 ke71Var = o381.a;
        this.j = new ke71(lx70Var);
        this.k = "liked_songs_genres";
        this.l = new orb(true, true);
        this.m = dt71VarE;
        this.n = d5p1.t(new xr0(xe01VarT, (byte) 22), u9c0Var, ey71.a(3), new rrb(1, mqo1.F(z6xVar)));
        this.o = new pdb0(this, (byte) 15);
    }

    @Override // p.xe91
    public final l381 c() {
        return this.j;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.h;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.i;
    }

    @Override // p.r2g
    public final Integer i() {
        return 1;
    }

    @Override // p.drb
    public final mr20 l() {
        return this.m;
    }

    @Override // p.drb
    public final Object o(qrb qrbVar, hsb hsbVar) {
        Boolean boolValueOf = Boolean.valueOf(qrbVar.a);
        bpb1 bpb1Var = this.d;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, boolValueOf);
        return rih1.a;
    }

    @Override // p.drb
    public final iu30 p() {
        return this.o;
    }

    @Override // p.drb
    public final xe01 r() {
        return this.n;
    }

    @Override // p.drb
    public final orb s() {
        return this.l;
    }

    @Override // p.drb
    public final String v() {
        return this.k;
    }
}
