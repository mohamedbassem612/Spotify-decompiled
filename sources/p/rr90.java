package p;

import android.app.Application;
import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class rr90 implements jly0 {
    public static v4o0 A(mkp mkpVar) {
        return mkpVar.a.j();
    }

    public static vu60 B(mkp mkpVar) {
        vu60 vu60Var = (vu60) mkpVar.a.j.get();
        c8o.l(vu60Var);
        return vu60Var;
    }

    public static yt91 C(mkp mkpVar) {
        return mkpVar.a.k();
    }

    public static j5a1 D(mkp mkpVar) {
        nkp nkpVar = mkpVar.a;
        return new j5a1(nkpVar.a.d(), (xc71) xqu.a(nkpVar.o).get());
    }

    public static mkp a(uy90 uy90Var, sr90 sr90Var, nkp nkpVar) {
        return new mkp(uy90Var, sr90Var, nkpVar);
    }

    public static or90 b(nkp nkpVar) {
        return new or90(nkpVar.j, nkpVar.s, nkpVar.r, nkpVar.t, nkpVar.v, nkpVar.q);
    }

    public static nkp c(uy90 uy90Var, sr90 sr90Var) {
        return new nkp(uy90Var, sr90Var);
    }

    public static qr90 d(nkp nkpVar) {
        return new qr90(nkpVar.w, nkpVar.f30p, nkpVar.x, nkpVar.y, nkpVar.B, nkpVar.C, nkpVar.F, nkpVar.G, nkpVar.H);
    }

    public static ukp e(ye90 ye90Var, wp20 wp20Var, dkd dkdVar) {
        return new ukp(ye90Var, wp20Var, dkdVar);
    }

    public static vkp f(uy90 uy90Var, nkp nkpVar, or90 or90Var, ye90 ye90Var, wp20 wp20Var, dkd dkdVar) {
        return new vkp(uy90Var, ye90Var, dkdVar, or90Var);
    }

    public static wy90 g(vkp vkpVar) {
        ukp ukpVar = (ukp) vkpVar.a;
        wx90 wx90Var = (wx90) ukpVar.J.get();
        c8o.l(wx90Var);
        dj5 dj5Var = (dj5) vkpVar.b.b;
        g0l g0lVar = (g0l) dj5Var.i.get();
        c9c0 c9c0VarB = ukpVar.b();
        c8o.l(c9c0VarB);
        wr60 wr60Var = new wr60(g0lVar, c9c0VarB, ukpVar.l(), dj5Var.e());
        r3a0 r3a0Var = (r3a0) ukpVar.P.get();
        c8o.l(r3a0Var);
        return new wy90(wx90Var, wr60Var, r3a0Var, (t2a0) vkpVar.f.get(), vkpVar.d);
    }

    public static w7w h(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 12);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static eh50 i(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 14);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static is90 j(r7q r7qVar, r7q r7qVar2, caq caqVar, jo80 jo80Var, kly0 kly0Var, r7q r7qVar3, r7q r7qVar4, caq caqVar2, r7q r7qVar5, r7q r7qVar6, kly0 kly0Var2) {
        is90 is90Var = new is90();
        is90Var.a = r7qVar;
        is90Var.b = r7qVar2;
        is90Var.c = caqVar;
        is90Var.d = jo80Var;
        is90Var.e = kly0Var;
        is90Var.f = r7qVar3;
        is90Var.g = r7qVar4;
        is90Var.h = caqVar2;
        is90Var.i = r7qVar5;
        is90Var.j = r7qVar6;
        is90Var.k = kly0Var2;
        return is90Var;
    }

    public static ht90 k(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, caq caqVar, caq caqVar2, r7q r7qVar5) {
        ht90 ht90Var = new ht90();
        ht90Var.a = r7qVar;
        ht90Var.b = r7qVar2;
        ht90Var.c = r7qVar3;
        ht90Var.d = r7qVar4;
        ht90Var.e = caqVar;
        ht90Var.f = caqVar2;
        ht90Var.g = r7qVar5;
        return ht90Var;
    }

    public static sx90 l(caq caqVar, r7q r7qVar, kly0 kly0Var, caq caqVar2, kly0 kly0Var2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, r7q r7qVar2, caq caqVar8, kly0 kly0Var3, caq caqVar9, r7q r7qVar3, caq caqVar10, r7q r7qVar4, r7q r7qVar5) {
        sx90 sx90Var = new sx90();
        sx90Var.a = caqVar;
        sx90Var.b = r7qVar;
        sx90Var.c = kly0Var;
        sx90Var.d = caqVar2;
        sx90Var.e = kly0Var2;
        sx90Var.f = caqVar3;
        sx90Var.g = caqVar4;
        sx90Var.h = caqVar5;
        sx90Var.i = caqVar6;
        sx90Var.j = caqVar7;
        sx90Var.k = r7qVar2;
        sx90Var.l = caqVar8;
        sx90Var.m = kly0Var3;
        sx90Var.n = caqVar9;
        sx90Var.o = r7qVar3;
        sx90Var.f42p = caqVar10;
        sx90Var.q = r7qVar4;
        sx90Var.r = r7qVar5;
        return sx90Var;
    }

    public static iz90 m(r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2) {
        iz90 iz90Var = new iz90();
        iz90Var.a = r7qVar;
        iz90Var.b = caqVar;
        iz90Var.c = kly0Var;
        iz90Var.d = kly0Var2;
        iz90Var.e = r7qVar2;
        iz90Var.f = caqVar2;
        return iz90Var;
    }

    public static lca0 n(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, caq caqVar2, caq caqVar3, jo80 jo80Var, caq caqVar4, r7q r7qVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, caq caqVar10, kly0 kly0Var) {
        lca0 lca0Var = new lca0();
        lca0Var.a = r7qVar;
        lca0Var.b = r7qVar2;
        lca0Var.c = r7qVar3;
        lca0Var.d = caqVar;
        lca0Var.e = caqVar2;
        lca0Var.f = caqVar3;
        lca0Var.g = jo80Var;
        lca0Var.h = caqVar4;
        lca0Var.i = r7qVar4;
        lca0Var.j = caqVar5;
        lca0Var.k = caqVar6;
        lca0Var.l = caqVar7;
        lca0Var.m = caqVar8;
        lca0Var.n = caqVar9;
        lca0Var.o = caqVar10;
        lca0Var.f23p = kly0Var;
        return lca0Var;
    }

    public static eh50 o(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 15);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static eh50 p(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 16);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static z6a0 q(Context context) {
        Application.ActivityLifecycleCallbacks z6a0Var = new z6a0();
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(z6a0Var);
        return z6a0Var;
    }

    public static it90 r(mkp mkpVar) {
        sr90 sr90Var = mkpVar.a.a;
        return new it90(new ur00((l8s) sr90Var.B.get(), (Scheduler) sr90Var.i.get(), (Scheduler) sr90Var.j.get()), (r4a1) sr90Var.S.get(), sr90Var.d());
    }

    public static vt90 s(mkp mkpVar) {
        nkp nkpVar = mkpVar.a;
        lx91 lx91VarH = ((ukp) nkpVar.b).h();
        c8o.l(lx91VarH);
        return new vt90(lx91VarH, (kea0) nkpVar.n.get());
    }

    public static ox90 t(mkp mkpVar) {
        c9c0 c9c0VarB = ((ukp) mkpVar.b).b();
        c8o.l(c9c0VarB);
        nkp nkpVar = mkpVar.a;
        return new ox90(c9c0VarB, nkpVar.a(), nkpVar.k());
    }

    public static gz90 u(mkp mkpVar) {
        return new gz90(mkpVar.a.a());
    }

    public static p4s v(mkp mkpVar) {
        return mkpVar.a.e();
    }

    public static p410 w(mkp mkpVar) {
        return mkpVar.a.h();
    }

    public static byp x(mkp mkpVar) {
        return mkpVar.a.i();
    }

    public static bbl0 y(mkp mkpVar) {
        return new bbl0(0);
    }

    public static o1o0 z(mkp mkpVar) {
        o1o0 o1o0Var = (o1o0) mkpVar.a.f.get();
        c8o.l(o1o0Var);
        return o1o0Var;
    }
}
