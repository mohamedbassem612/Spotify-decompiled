package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u9p {
    public final jly0 A;
    public final jly0 B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final jly0 F;
    public final jly0 G;
    public final jly0 H;
    public final jly0 I;
    public final jly0 J;
    public final jly0 K;
    public final jly0 L;
    public final jly0 M;
    public final jly0 N;
    public final jly0 O;
    public final jly0 P;
    public final jly0 Q;
    public final jly0 R;
    public final jly0 S;
    public final jly0 T;
    public final jly0 U;
    public final jly0 V;
    public final jly0 W;
    public final jly0 a;
    public final jly0 b;
    public final jly0 c;
    public final jly0 d;
    public final jly0 e;
    public final jly0 f;
    public final jly0 g;
    public final jly0 h;
    public final jly0 i;
    public final jly0 j;
    public final jly0 k;
    public final jly0 l;
    public final jly0 m;
    public final jly0 n;
    public final jly0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f68p;
    public final jly0 q;
    public final jly0 r;
    public final jly0 s;
    public final jly0 t;
    public final jly0 u;
    public final jly0 v;
    public final jly0 w;
    public final jly0 x;
    public final jly0 y;
    public final jly0 z;

    public u9p(i1o i1oVar, l1o l1oVar, q7r0 q7r0Var) {
        this.C = i1oVar;
        this.D = l1oVar;
        this.E = q7r0Var;
        this.a = xqu.b(new d7p(this, 1, (byte) 19));
        this.b = xqu.b(new d7p(this, 2, (byte) 19));
        this.c = xqu.b(new d7p(this, 4, (byte) 19));
        this.d = xqu.b(new d7p(this, 3, (byte) 19));
        this.e = xqu.b(new d7p(this, 5, (byte) 19));
        this.f = xqu.b(new d7p(this, 6, (byte) 19));
        this.F = new d7p(this, 7, (byte) 19);
        this.g = xqu.b(new d7p(this, 8, (byte) 19));
        this.G = new d7p(this, 10, (byte) 19);
        this.H = new d7p(this, 11, (byte) 19);
        this.h = iy81.a(new d7p(this, 12, (byte) 19));
        this.I = new d7p(this, 13, (byte) 19);
        this.i = iy81.a(new d7p(this, 14, (byte) 19));
        this.j = iy81.a(new d7p(this, 15, (byte) 19));
        this.J = new d7p(this, 16, (byte) 19);
        this.K = new d7p(this, 19, (byte) 19);
        this.L = new d7p(this, 20, (byte) 19);
        this.M = new d7p(this, 18, (byte) 19);
        this.k = xqu.b(new d7p(this, 17, (byte) 19));
        this.l = iy81.a(new d7p(this, 21, (byte) 19));
        this.N = new d7p(this, 23, (byte) 19);
        this.m = xqu.b(new d7p(this, 22, (byte) 19));
        this.O = new d7p(this, 24, (byte) 19);
        this.P = new d7p(this, 25, (byte) 19);
        this.Q = new d7p(this, 26, (byte) 19);
        this.n = iy81.a(new d7p(this, 28, (byte) 19));
        this.R = new d7p(this, 31, (byte) 19);
        this.S = new d7p(this, 30, (byte) 19);
        this.o = iy81.a(new d7p(this, 29, (byte) 19));
        this.f68p = iy81.a(new d7p(this, 27, (byte) 19));
        this.q = iy81.a(new d7p(this, 32, (byte) 19));
        this.T = new d7p(this, 34, (byte) 19);
        this.U = new d7p(this, 35, (byte) 19);
        this.r = iy81.a(new d7p(this, 33, (byte) 19));
        this.V = new d7p(this, 36, (byte) 19);
        this.s = iy81.a(new d7p(this, 9, (byte) 19));
        this.t = iy81.a(new d7p(this, 37, (byte) 19));
        this.u = iy81.a(new d7p(this, 0, (byte) 19));
        this.v = iy81.a(new d7p(this, 38, (byte) 19));
        this.w = iy81.a(new d7p(this, 39, (byte) 19));
        this.W = new d7p(this, 41, (byte) 19);
        this.x = iy81.a(new d7p(this, 42, (byte) 19));
        this.y = iy81.a(new d7p(this, 43, (byte) 19));
        this.z = iy81.a(new d7p(this, 40, (byte) 19));
        this.A = iy81.a(new d7p(this, 44, (byte) 19));
        this.B = xqu.b(new d7p(this, 45, (byte) 19));
    }

    public zwg a() {
        i1o i1oVar = (i1o) this.C;
        yqg yqgVarA = i1oVar.a();
        c8o.l(yqgVarA);
        gw70 gw70VarE = i1oVar.e();
        c8o.l(gw70VarE);
        f6g1 f6g1Var = (f6g1) i1oVar.g1.get();
        c8o.l(f6g1Var);
        zs11 zs11Var = new zs11(yqgVarA, gw70VarE, f6g1Var);
        yqg yqgVarA2 = i1oVar.a();
        c8o.l(yqgVarA2);
        bf3 bf3Var = new bf3(yqgVarA2);
        lzn0 lzn0Var = (lzn0) this.G.get();
        abm abmVarB = i1oVar.b();
        c8o.l(abmVarB);
        return new zwg(zs11Var, bf3Var, lzn0Var, abmVarB, brt.x());
    }

    public ajq0 b() {
        zsc zscVarV = v();
        lzn0 lzn0Var = (lzn0) this.G.get();
        i1o i1oVar = (i1o) this.C;
        yqg yqgVarA = i1oVar.a();
        c8o.l(yqgVarA);
        ycc1 ycc1Var = new ycc1(yqgVarA, (opv0) this.H.get(), (byte) 27);
        ue3 ue3Var = new ue3();
        abm abmVarB = i1oVar.b();
        c8o.l(abmVarB);
        return new ajq0(zscVarV, lzn0Var, ycc1Var, ue3Var, abmVarB);
    }

    public xf4 c() {
        luk lukVar = (luk) ((i1o) this.C).j.get();
        c8o.l(lukVar);
        return new xf4(lukVar);
    }

    public vu4 d() {
        luk lukVarW = ((ys10) this.C).w();
        c8o.l(lukVarW);
        return new vu4(false, false, false, lukVarW);
    }

    public Context e() {
        Context contextC = ((i1o) this.C).c();
        c8o.l(contextC);
        return contextC.getApplicationContext();
    }

    public String f() {
        return "spotify:list:popular-release-segments-main-roles:artist_".concat(ihc1.X0(((l1o) this.D).a, ":"));
    }

    public String g() {
        return "spotify:list:offline-playable-artist:".concat(ihc1.X0(((l1o) this.D).a, ":"));
    }

    public hjc h() {
        xfx xfxVarD = ((i1o) this.C).d();
        c8o.l(xfxVarD);
        return new hjc(xfxVarD.b, (byte) 19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h1o i() {
        yxe1 yxe1Var;
        boolean zC;
        bn70 bn70Var;
        i1o i1oVar = (i1o) this.C;
        z7e0 z7e0Var = (z7e0) i1oVar.c.get();
        c8o.l(z7e0Var);
        final m9p m9pVar = (m9p) this.u.get();
        final i9p i9pVar = (i9p) this.v.get();
        l1o l1oVar = (l1o) this.D;
        final byte b = 0;
        final byte b2 = 1;
        iv30 iv30Var = l1oVar.b == 1 ? new iv30() { // from class: p.k1o
            public final j1o a(LinkedHashSet linkedHashSet) {
                byte b3 = b;
                Object obj = i9pVar;
                switch (b3) {
                    case 0:
                        u9p u9pVar = (u9p) ((i9p) obj).a.c;
                        xrc0 xrc0VarF = ((i1o) u9pVar.C).f();
                        c8o.l(xrc0VarF);
                        String strF = u9pVar.f();
                        mr20 mr20VarL = u9pVar.l();
                        l1o l1oVar2 = (l1o) u9pVar.D;
                        bdr0 bdr0VarQ = u9pVar.q();
                        t380 t380VarU = t380.u((oev0) u9pVar.g.get(), (cgf1) u9pVar.a.get(), (kc8) u9pVar.b.get());
                        f8b f8bVar = (f8b) ((i1o) u9pVar.C).r0.get();
                        c8o.l(f8bVar);
                        return new hkx0(xrc0VarF, strF, mr20VarL, l1oVar2, bdr0VarQ, t380VarU, f8bVar, brt.x(), (xev0) u9pVar.d.get(), (gev0) u9pVar.e.get(), (d0r) u9pVar.f.get(), (bt6) u9pVar.c.get(), linkedHashSet);
                    default:
                        u9p u9pVar2 = (u9p) ((m9p) obj).a.c;
                        xrc0 xrc0VarF2 = ((i1o) u9pVar2.C).f();
                        c8o.l(xrc0VarF2);
                        l1o l1oVar3 = (l1o) u9pVar2.D;
                        i1o i1oVar2 = (i1o) u9pVar2.C;
                        Scheduler scheduler = (Scheduler) i1oVar2.g0.get();
                        c8o.l(scheduler);
                        Scheduler scheduler2 = (Scheduler) i1oVar2.h0.get();
                        c8o.l(scheduler2);
                        uu00 uu00Var = (uu00) i1oVar2.f.get();
                        c8o.l(uu00Var);
                        w6e0 w6e0Var = new w6e0(l1oVar3.b == 1 ? new cvm0(uu00Var, "creator-page", scheduler, scheduler2) : new lim0("creator-page", uu00Var));
                        String strF2 = u9pVar2.f();
                        mr20 mr20VarL2 = u9pVar2.l();
                        l1o l1oVar4 = (l1o) u9pVar2.D;
                        bdr0 bdr0VarQ2 = u9pVar2.q();
                        t380 t380VarU2 = t380.u((oev0) u9pVar2.g.get(), (cgf1) u9pVar2.a.get(), (kc8) u9pVar2.b.get());
                        f8b f8bVar2 = (f8b) i1oVar2.r0.get();
                        c8o.l(f8bVar2);
                        return new vb6(xrc0VarF2, w6e0Var, strF2, mr20VarL2, l1oVar4, bdr0VarQ2, t380VarU2, f8bVar2, brt.x(), (xev0) u9pVar2.d.get(), (gev0) u9pVar2.e.get(), linkedHashSet);
                }
            }

            public final boolean equals(Object obj) {
                switch (b) {
                    case 0:
                        if ((obj instanceof k1o) && (obj instanceof iv30)) {
                            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                        }
                        return false;
                    default:
                        if ((obj instanceof k1o) && (obj instanceof iv30)) {
                            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                        }
                        return false;
                }
            }

            public final cv30 getFunctionDelegate() {
                byte b3 = b;
                Object obj = i9pVar;
                switch (b3) {
                    case 0:
                        return new tv30(1, (i9p) obj, i9p.class, "create", "create(Ljava/util/Set;)Lcom/spotify/creator/creatorpage/ProgressivePageLoadableResourceImpl;", 0);
                    default:
                        return new tv30(1, (m9p) obj, m9p.class, "create", "create(Ljava/util/Set;)Lcom/spotify/creator/creatorpage/ArtistAndAuthorPageLoadableResourceImpl;", 0);
                }
            }

            public final int hashCode() {
                switch (b) {
                    case 0:
                        break;
                }
                return getFunctionDelegate().hashCode();
            }
        } : new iv30() { // from class: p.k1o
            public final j1o a(LinkedHashSet linkedHashSet) {
                byte b3 = b2;
                Object obj = m9pVar;
                switch (b3) {
                    case 0:
                        u9p u9pVar = (u9p) ((i9p) obj).a.c;
                        xrc0 xrc0VarF = ((i1o) u9pVar.C).f();
                        c8o.l(xrc0VarF);
                        String strF = u9pVar.f();
                        mr20 mr20VarL = u9pVar.l();
                        l1o l1oVar2 = (l1o) u9pVar.D;
                        bdr0 bdr0VarQ = u9pVar.q();
                        t380 t380VarU = t380.u((oev0) u9pVar.g.get(), (cgf1) u9pVar.a.get(), (kc8) u9pVar.b.get());
                        f8b f8bVar = (f8b) ((i1o) u9pVar.C).r0.get();
                        c8o.l(f8bVar);
                        return new hkx0(xrc0VarF, strF, mr20VarL, l1oVar2, bdr0VarQ, t380VarU, f8bVar, brt.x(), (xev0) u9pVar.d.get(), (gev0) u9pVar.e.get(), (d0r) u9pVar.f.get(), (bt6) u9pVar.c.get(), linkedHashSet);
                    default:
                        u9p u9pVar2 = (u9p) ((m9p) obj).a.c;
                        xrc0 xrc0VarF2 = ((i1o) u9pVar2.C).f();
                        c8o.l(xrc0VarF2);
                        l1o l1oVar3 = (l1o) u9pVar2.D;
                        i1o i1oVar2 = (i1o) u9pVar2.C;
                        Scheduler scheduler = (Scheduler) i1oVar2.g0.get();
                        c8o.l(scheduler);
                        Scheduler scheduler2 = (Scheduler) i1oVar2.h0.get();
                        c8o.l(scheduler2);
                        uu00 uu00Var = (uu00) i1oVar2.f.get();
                        c8o.l(uu00Var);
                        w6e0 w6e0Var = new w6e0(l1oVar3.b == 1 ? new cvm0(uu00Var, "creator-page", scheduler, scheduler2) : new lim0("creator-page", uu00Var));
                        String strF2 = u9pVar2.f();
                        mr20 mr20VarL2 = u9pVar2.l();
                        l1o l1oVar4 = (l1o) u9pVar2.D;
                        bdr0 bdr0VarQ2 = u9pVar2.q();
                        t380 t380VarU2 = t380.u((oev0) u9pVar2.g.get(), (cgf1) u9pVar2.a.get(), (kc8) u9pVar2.b.get());
                        f8b f8bVar2 = (f8b) i1oVar2.r0.get();
                        c8o.l(f8bVar2);
                        return new vb6(xrc0VarF2, w6e0Var, strF2, mr20VarL2, l1oVar4, bdr0VarQ2, t380VarU2, f8bVar2, brt.x(), (xev0) u9pVar2.d.get(), (gev0) u9pVar2.e.get(), linkedHashSet);
                }
            }

            public final boolean equals(Object obj) {
                switch (b2) {
                    case 0:
                        if ((obj instanceof k1o) && (obj instanceof iv30)) {
                            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                        }
                        return false;
                    default:
                        if ((obj instanceof k1o) && (obj instanceof iv30)) {
                            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                        }
                        return false;
                }
            }

            public final cv30 getFunctionDelegate() {
                byte b3 = b2;
                Object obj = m9pVar;
                switch (b3) {
                    case 0:
                        return new tv30(1, (i9p) obj, i9p.class, "create", "create(Ljava/util/Set;)Lcom/spotify/creator/creatorpage/ProgressivePageLoadableResourceImpl;", 0);
                    default:
                        return new tv30(1, (m9p) obj, m9p.class, "create", "create(Ljava/util/Set;)Lcom/spotify/creator/creatorpage/ArtistAndAuthorPageLoadableResourceImpl;", 0);
                }
            }

            public final int hashCode() {
                switch (b2) {
                    case 0:
                        break;
                }
                return getFunctionDelegate().hashCode();
            }
        };
        t9h1 t9h1VarX = x();
        ne neVar = new ne(new hvp0((q7r0) this.E, (byte) 4), o(), new iyq0(w(), (byte) 4), l1oVar, c());
        b160 b160Var = new b160(l1oVar, (j9p) this.w.get(), (k9p) this.z.get(), c().v(), c().w(), c().b(), c().c(), c());
        q8n q8nVarX = brt.x();
        l9p l9pVar = (l9p) this.A.get();
        iac0 iac0VarO = o();
        muz muzVar = (muz) this.O.get();
        ruz ruzVarA = t().a();
        Scheduler scheduler = (Scheduler) i1oVar.f0.get();
        c8o.l(scheduler);
        ybq ybqVar = (ybq) i1oVar.e0.get();
        c8o.l(ybqVar);
        s880 s880Var = new s880(l1oVar, t9h1VarX, neVar, b160Var, q8nVarX, l9pVar, new frr(iac0VarO, muzVar, ruzVarA, scheduler, ybqVar), (hoc) this.B.get());
        hs71 hs71Var = (hs71) i1oVar.J.get();
        c8o.l(hs71Var);
        bt6 bt6Var = (bt6) this.c.get();
        int i = l1oVar.b;
        int iC = l1d.C(i);
        if (iC == 0) {
            yxe1Var = new yxe1(new jx21(2131952474));
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            yxe1Var = new yxe1(new jx21(2131952666));
        }
        p6r0 p6r0VarP = p();
        lik1 lik1VarZ = z();
        h2r0 h2r0Var = (h2r0) i1oVar.D0.get();
        c8o.l(h2r0Var);
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            zC = h2r0Var.a.c();
        } else {
            if (iC2 != 1) {
                eg.o();
                return null;
            }
            zC = true;
        }
        yko ykoVar = (yko) i1oVar.d1.get();
        c8o.l(ykoVar);
        String str = l1oVar.c;
        c8o.m(str);
        int iC3 = l1d.C(i);
        if (iC3 == 0) {
            bn70Var = new bn70(p6r0VarP, lik1VarZ, (nar0) null);
        } else {
            if (iC3 != 1) {
                eg.o();
                return null;
            }
            bn70Var = new bn70(p6r0VarP, lik1VarZ, new itk0(p6r0VarP.c, l1oVar.a));
        }
        dbr0[] dbr0VarArr = (dbr0[]) o7h.O0(new e5b0(30, Collections.singletonList(ykoVar.a((String) null, new vdm(str, (lnm) null, (byte) 1))), (List) null), p7h.M(new dbr0[]{yxe1Var, bn70Var, new p8r("Client-Native Creator Page"), new q1r0(false), new t1r0(zC), new s9h1(14, zC, false, false), new pu00(true)})).toArray(new dbr0[0]);
        return new h1o(z7e0Var, iv30Var, s880Var, hs71Var, bt6Var, new cbr0((dbr0[]) Arrays.copyOf(dbr0VarArr, dbr0VarArr.length), false));
    }

    public zl5 j() {
        i1o i1oVar = (i1o) this.C;
        Context contextC = i1oVar.c();
        c8o.l(contextC);
        iac0 iac0VarO = o();
        yqg yqgVarA = i1oVar.a();
        c8o.l(yqgVarA);
        lik1 lik1VarZ = z();
        c8o.l(i1oVar.e());
        c8o.l((ggv) i1oVar.w.get());
        aas aasVar = (aas) i1oVar.c0.get();
        c8o.l(aasVar);
        ijr ijrVar = (ijr) i1oVar.P.get();
        c8o.l(ijrVar);
        g7h g7hVar = (g7h) i1oVar.z.get();
        c8o.l(g7hVar);
        o241 o241Var = (o241) i1oVar.h.get();
        c8o.l(o241Var);
        vgm vgmVar = (vgm) this.J.get();
        jr6 jr6Var = (jr6) this.k.get();
        uvf1 uvf1Var = (uvf1) i1oVar.M.get();
        c8o.l(uvf1Var);
        ycm ycmVar = (ycm) i1oVar.y.get();
        c8o.l(ycmVar);
        x290 x290Var = (x290) i1oVar.s0.get();
        c8o.l(x290Var);
        y390 y390Var = (y390) i1oVar.v0.get();
        c8o.l(y390Var);
        t740 t740Var = (t740) i1oVar.x0.get();
        c8o.l(t740Var);
        d7p d7pVar = this.H;
        luk lukVar = (luk) i1oVar.j.get();
        c8o.l(lukVar);
        zsc zscVarV = v();
        vb2 vb2Var = (vb2) i1oVar.b1.get();
        c8o.l(vb2Var);
        qns0 qns0Var = (qns0) i1oVar.a1.get();
        c8o.l(qns0Var);
        q7r0 q7r0Var = (q7r0) this.E;
        u9c0 u9c0VarH = zso1.H(q7r0Var.d.c.getLifecycle());
        req reqVar = (req) i1oVar.E.get();
        c8o.l(reqVar);
        peq peqVar = (peq) i1oVar.C.get();
        c8o.l(peqVar);
        myq0 myq0Var = new myq0(q7r0Var);
        r6h1 r6h1VarB = x().b();
        c8o.m(r6h1VarB);
        zwg zwgVar = new zwg();
        zwgVar.a = ijrVar;
        zwgVar.b = g7hVar;
        zwgVar.c = o241Var;
        zwgVar.d = ycmVar;
        zwgVar.e = d7pVar;
        wzn wznVar = new wzn(zwgVar);
        i0p i0pVar = (i0p) ((jly0) wznVar.b).get();
        Context applicationContext = contextC.getApplicationContext();
        c8o.l(jr6Var);
        azo azoVar = (azo) ((jly0) wznVar.c).get();
        w1x0 w1x0Var = new w1x0((byte) 29);
        q8n q8nVarX = brt.x();
        fwo fwoVar = (fwo) wznVar.d;
        xf4 xf4Var = new xf4(lukVar);
        asn asnVar = new asn();
        asnVar.a = qns0Var;
        asnVar.b = new ConcurrentHashMap();
        asnVar.c = mno1.a(Integer.MAX_VALUE, 0, 6);
        fn31.T(u9c0VarH, (o8n) null, 0, new hxn(asnVar, (lnm) null, (byte) 0), 3);
        fn31.T(u9c0VarH, (o8n) null, 0, new awe(asnVar, null, (byte) 29), 3);
        return new zl5(i0pVar, zscVarV, yqgVarA, applicationContext, iac0VarO, lik1VarZ, aasVar, vgmVar, jr6Var, azoVar, uvf1Var, w1x0Var, x290Var, y390Var, q8nVarX, t740Var, fwoVar, r6h1VarB, xf4Var, asnVar, vb2Var, reqVar, peqVar, myq0Var);
    }

    public sas k() {
        return new sas((o2p0) this.s.get(), (n6r0) this.t.get(), (lik1) this.o.get(), (byte) 2);
    }

    public mr20 l() {
        huz huzVarU;
        l1o l1oVar = (l1o) this.D;
        i1o i1oVar = (i1o) this.C;
        p241 p241Var = (o241) i1oVar.h.get();
        c8o.l(p241Var);
        buf0 buf0Var = (buf0) i1oVar.t0.get();
        c8o.l(buf0Var);
        w4b1 w4b1Var = new w4b1(p241Var, buf0Var, c());
        xf4 xf4VarC = c();
        String str = l1oVar.a;
        int iC = l1d.C(l1oVar.b);
        if (iC == 0) {
            huzVarU = rqt0.u(new x010(yoi1.g(p241Var.a), t5p1.i(buf0Var.a()), new qt(str, w4b1Var, (lnm) null, (byte) 12), (byte) 1));
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            huzVarU = new huz(new y2r0(str, Collections.singletonList(new x2r0(1, p7h.M(new v2r0[]{new v2r0(w2r0.c), new v2r0(w2r0.d), new v2r0(w2r0.g), new v2r0(w2r0.X), new v2r0(w2r0.h)}))), xf4VarC.d() ? 1 : 0), (byte) 10);
        }
        return (mr20) huzVarU;
    }

    public FlowableMap m() {
        return f2u0.f((Flowable) this.a.get());
    }

    public Flowable n() {
        FlowableMap flowableMapM = m();
        ys10 ys10Var = (ys10) this.C;
        gw70 gw70VarB = ys10Var.b();
        c8o.l(gw70VarB);
        ufg1 ufg1VarS = ys10Var.S();
        c8o.l(ufg1VarS);
        Scheduler schedulerO = ys10Var.o();
        c8o.l(schedulerO);
        return f2u0.g(flowableMapM, gw70VarB, ufg1VarS, schedulerO);
    }

    public iac0 o() {
        iac0 iac0Var = ((q7r0) this.E).d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public p6r0 p() {
        int iC = l1d.C(((l1o) this.D).b);
        if (iC == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.N();
        }
        if (iC == 1) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.Y();
        }
        eg.o();
        return null;
    }

    public bdr0 q() {
        l1o l1oVar = (l1o) this.D;
        sjq0 sjq0VarR = r();
        pyu pyuVar = (pyu) ((i1o) this.C).s.get();
        c8o.l(pyuVar);
        em3 em3Var = new em3(sjq0VarR, pyuVar, (n9p) this.s.get());
        ow3 ow3Var = new ow3(r(), (h9p) this.t.get(), (byte) 15);
        int iC = l1d.C(l1oVar.b);
        if (iC == 0) {
            return ow3Var;
        }
        if (iC == 1) {
            return em3Var;
        }
        eg.o();
        return null;
    }

    public sjq0 r() {
        Context contextE = e();
        Context contextE2 = e();
        i1o i1oVar = (i1o) this.C;
        xrc0 xrc0VarF = i1oVar.f();
        c8o.l(xrc0VarF);
        cgf1 cgf1Var = (cgf1) this.a.get();
        kc8 kc8Var = (kc8) this.b.get();
        kn6 kn6Var = (kn6) i1oVar.o0.get();
        c8o.l(kn6Var);
        lq6 lq6Var = (lq6) i1oVar.N.get();
        c8o.l(lq6Var);
        z141 z141Var = (z141) i1oVar.n0.get();
        c8o.l(z141Var);
        xf4 xf4VarC = c();
        luk lukVar = (luk) i1oVar.j.get();
        c8o.l(lukVar);
        f54 f54Var = new f54(lukVar);
        v8n0 v8n0Var = (v8n0) i1oVar.A0.get();
        c8o.l(v8n0Var);
        String strF = f();
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        return new sjq0(contextE, new zl5(contextE2, xrc0VarF, cgf1Var, kc8Var, kn6Var, lq6Var, z141Var, xf4VarC, f54Var, v8n0Var, strF, (xev0) this.d.get(), (gev0) this.e.get(), zso1.H(((q7r0) this.E).d.c.getLifecycle()), xqu.a(this.f), xqu.a(this.F), (oev0) this.g.get()), (byte) 7);
    }

    public dpt0 s() {
        jly0 jly0Var = this.a;
        Flowable flowableJ = ((Flowable) jly0Var.get()).j(mo9.N0);
        FlowableMap flowableMapM = m();
        Flowable flowableJ2 = ((Flowable) jly0Var.get()).j(mo9.O0);
        w9u0 w9u0Var = (w9u0) this.b.get();
        gn10 gn10Var = (gn10) this.c.get();
        ys10 ys10Var = (ys10) this.C;
        mnk0 mnk0VarM = ys10Var.m();
        c8o.l(mnk0VarM);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var.get());
        pe peVarH = ys10Var.h();
        c8o.l(peVarH);
        luk lukVarW = ys10Var.w();
        c8o.l(lukVarW);
        return new dpt0(flowableJ, flowableMapM, flowableJ2, w9u0Var, gn10Var, mnk0VarM, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW)));
    }

    public cyp t() {
        t8u0 t8u0Var = (t8u0) ((i1o) this.C).H.get();
        c8o.l(t8u0Var);
        return t8u0Var.a(o().getLifecycle());
    }

    public FlowableMap u() {
        return f2u0.D((Flowable) this.a.get());
    }

    public zsc v() {
        i1o i1oVar = (i1o) this.C;
        yqg yqgVarA = i1oVar.a();
        c8o.l(yqgVarA);
        gw70 gw70VarE = i1oVar.e();
        c8o.l(gw70VarE);
        ggv ggvVar = (ggv) i1oVar.w.get();
        c8o.l(ggvVar);
        f6g1 f6g1Var = (f6g1) i1oVar.g1.get();
        c8o.l(f6g1Var);
        return new zsc(yqgVarA, gw70VarE, ggvVar, f6g1Var, (byte) 19);
    }

    public Set w() {
        l1o l1oVar = (l1o) this.D;
        ajq0 ajq0VarB = b();
        zwg zwgVarA = a();
        gev0 gev0Var = (gev0) this.e.get();
        i1o i1oVar = (i1o) this.C;
        abm abmVarB = i1oVar.b();
        c8o.l(abmVarB);
        xe3 xe3Var = new xe3(ajq0VarB, zwgVarA, gev0Var, abmVarB, c());
        oi51 x6eVar = new x6e(b(), a(), c(), (byte) 3);
        hjc hjcVarH = h();
        jly0 jly0Var = this.h;
        zu70 zu70Var = (zu70) jly0Var.get();
        d7p d7pVar = this.G;
        lzn0 lzn0Var = (lzn0) d7pVar.get();
        d7p d7pVar2 = this.I;
        oi51 gy5Var = new gy5(hjcVarH, zu70Var, lzn0Var, d7pVar2);
        oi51 gy5Var2 = new gy5((zu70) jly0Var.get(), h(), (lzn0) d7pVar.get(), d7pVar2, (byte) 2);
        oi51 gy5Var3 = new gy5((zu70) jly0Var.get(), h(), (lzn0) d7pVar.get(), d7pVar2, (byte) 3);
        ur6 ur6Var = new ur6((o9p) this.i.get(), (byte) 6);
        byte b = 8;
        ur6 ur6Var2 = new ur6((lzn0) d7pVar.get(), b);
        oi51 x6eVar2 = new x6e(e(), (lzn0) d7pVar.get());
        oi51 nmuVar = new nmu((byte) 0);
        iz6 iz6VarY = y();
        kly0 kly0Var = i1oVar.o;
        yyn yynVar = (yyn) kly0Var.get();
        c8o.l(yynVar);
        kly0 kly0Var2 = i1oVar.q;
        avp avpVar = (avp) kly0Var2.get();
        c8o.l(avpVar);
        lb6 lb6Var = new lb6(yynVar, avpVar, c(), (byte) 0);
        zl5 zl5VarJ = j();
        kly0 kly0Var3 = i1oVar.d0;
        b7r0 b7r0Var = (b7r0) kly0Var3.get();
        c8o.l(b7r0Var);
        xev0 xev0Var = (xev0) this.d.get();
        abm abmVarB2 = i1oVar.b();
        c8o.l(abmVarB2);
        iz6 iz6Var = new iz6(zl5VarJ, b7r0Var, xev0Var, abmVarB2, (byte) 3);
        gw70 gw70VarE = i1oVar.e();
        c8o.l(gw70VarE);
        lzn0 lzn0Var2 = (lzn0) d7pVar.get();
        z141 z141Var = (z141) i1oVar.n0.get();
        c8o.l(z141Var);
        lq6 lq6Var = (lq6) i1oVar.N.get();
        c8o.l(lq6Var);
        kn6 kn6Var = (kn6) i1oVar.o0.get();
        c8o.l(kn6Var);
        Context contextC = i1oVar.c();
        c8o.l(contextC);
        oi51 x6eVar3 = new x6e(new zcc0(gw70VarE, lzn0Var2, z141Var, lq6Var, kn6Var, contextC), l1oVar, c(), (byte) 4);
        oi51 x6eVar4 = new x6e(new uip0((q9p) this.l.get(), (byte) 1), l1oVar, g(), (byte) 5);
        bnr bnrVar = (bnr) i1oVar.O.get();
        c8o.l(bnrVar);
        ur6 ur6Var3 = new ur6(bnrVar, (byte) 3);
        oi51 nmuVar2 = new nmu((byte) 1);
        oi51 gy5Var4 = new gy5((zu70) jly0Var.get(), h(), (lzn0) d7pVar.get(), d7pVar2, (byte) 1);
        ur6 ur6Var4 = new ur6(new na9((lzn0) d7pVar.get(), (byte) 9), (byte) 5);
        f2o f2oVar = (f2o) i1oVar.Q.get();
        c8o.l(f2oVar);
        g2o g2oVar = (g2o) i1oVar.R.get();
        c8o.l(g2oVar);
        oi51 x6eVar5 = new x6e(f2oVar, g2oVar, c(), (byte) 2);
        yk10 yk10Var = (yk10) i1oVar.S.get();
        c8o.l(yk10Var);
        ur6 ur6Var5 = new ur6(yk10Var, (byte) 4);
        Context contextE = e();
        q7r0 q7r0Var = (q7r0) this.E;
        jly0 jly0Var2 = this.m;
        zei0 zei0Var = ((r2o) jly0Var2.get()).b;
        c8o.m(zei0Var);
        ojv0 ojv0Var = (ojv0) i1oVar.R0.get();
        c8o.l(ojv0Var);
        iz6 iz6Var2 = new iz6(contextE, q7r0Var, zei0Var, ojv0Var, (byte) 1);
        iac0 iac0VarO = o();
        xf4 xf4VarC = c();
        oqg oqgVar = new oqg(c(), q7r0Var, (byte) 1);
        heq heqVar = (heq) i1oVar.b0.get();
        c8o.l(heqVar);
        iz6 iz6Var3 = new iz6(iac0VarO, xf4VarC, oqgVar, heqVar, (byte) 0);
        tr6 tr6Var = (tr6) i1oVar.i0.get();
        c8o.l(tr6Var);
        ur6 ur6Var6 = new ur6(tr6Var, (byte) 0);
        g2q g2qVar = (g2q) i1oVar.j0.get();
        c8o.l(g2qVar);
        ynb0 ynb0VarA = xqu.a(this.O);
        lik1 lik1VarZ = z();
        oqg oqgVar2 = new oqg(c(), q7r0Var, (byte) 1);
        woa woaVar = (woa) i1oVar.l0.get();
        c8o.l(woaVar);
        kma kmaVar = (kma) i1oVar.m0.get();
        c8o.l(kmaVar);
        fpa fpaVar = (fpa) i1oVar.k0.get();
        c8o.l(fpaVar);
        luk lukVar = (luk) i1oVar.j.get();
        c8o.l(lukVar);
        v65 v65Var = new v65(lukVar);
        xf4 xf4VarC2 = c();
        q8n q8nVarX = brt.x();
        v290 v290Var = (v290) i1oVar.p0.get();
        c8o.l(v290Var);
        iac0 iac0VarO2 = o();
        d7p d7pVar3 = this.N;
        oi51 gsj1Var = new gsj1(g2qVar, ynb0VarA, lik1VarZ, oqgVar2, woaVar, kmaVar, fpaVar, v65Var, xf4VarC2, q8nVarX, v290Var, iac0VarO2, d7pVar3, this.P, this.Q);
        oi51 x6eVar6 = new x6e(new oqg(c(), q7r0Var, (byte) 1), ((r2o) jly0Var2.get()).a, c(), (byte) 1);
        zl5 zl5VarJ2 = j();
        b7r0 b7r0Var2 = (b7r0) kly0Var3.get();
        c8o.l(b7r0Var2);
        cgf1 cgf1Var = (cgf1) this.a.get();
        abm abmVarB3 = i1oVar.b();
        c8o.l(abmVarB3);
        iz6 iz6Var4 = new iz6(zl5VarJ2, b7r0Var2, cgf1Var, abmVarB3, (byte) 2);
        hlf1 hlf1Var = (hlf1) i1oVar.u0.get();
        c8o.l(hlf1Var);
        ur6 ur6Var7 = new ur6(hlf1Var, (byte) 9);
        Context contextE2 = e();
        r9p r9pVar = (r9p) this.f68p.get();
        Context contextE3 = e();
        uu00 uu00Var = (uu00) i1oVar.f.get();
        c8o.l(uu00Var);
        Set setS0 = f46.S0(new oi51[]{xe3Var, x6eVar, gy5Var, gy5Var2, gy5Var3, ur6Var, ur6Var2, x6eVar2, nmuVar, iz6VarY, lb6Var, iz6Var, x6eVar3, x6eVar4, ur6Var3, nmuVar2, gy5Var4, ur6Var4, x6eVar5, ur6Var5, iz6Var2, iz6Var3, ur6Var6, gsj1Var, x6eVar6, iz6Var4, ur6Var7, new x6e(contextE2, r9pVar, new zeu(contextE3, uu00Var, l1oVar), (byte) 0), new pc8((g9p) this.q.get(), l1oVar, (byte) 2), new pc8((oev0) this.g.get(), d7pVar3, (byte) 1), new ur6(c(), (byte) 7)});
        kly0 kly0Var4 = i1oVar.m;
        bb8 bb8Var = (bb8) kly0Var4.get();
        c8o.l(bb8Var);
        kly0 kly0Var5 = i1oVar.F;
        zet0 zet0Var = (zet0) kly0Var5.get();
        c8o.l(zet0Var);
        jly0 jly0Var3 = this.r;
        vyo vyoVar = (vyo) jly0Var3.get();
        iac0 iac0VarO3 = o();
        lik1 lik1VarZ2 = z();
        d7p d7pVar4 = this.R;
        oi51 ra8Var = new ra8(bb8Var, zet0Var, vyoVar, iac0VarO3, lik1VarZ2, xqu.a(d7pVar4));
        bb8 bb8Var2 = (bb8) kly0Var4.get();
        c8o.l(bb8Var2);
        zet0 zet0Var2 = (zet0) kly0Var5.get();
        c8o.l(zet0Var2);
        oi51 lb8Var = new lb8(bb8Var2, zet0Var2, (vyo) jly0Var3.get(), o(), z(), xqu.a(d7pVar4), (lzn0) d7pVar.get(), e());
        kly0 kly0Var6 = i1oVar.n;
        meq meqVar = (meq) kly0Var6.get();
        c8o.l(meqVar);
        ur6 ur6Var8 = new ur6(meqVar, (byte) 2);
        kc8 kc8Var = (kc8) this.b.get();
        meq meqVar2 = (meq) kly0Var6.get();
        c8o.l(meqVar2);
        pc8 pc8Var = new pc8(kc8Var, meqVar2, (byte) 0);
        ur6 ur6Var9 = new ur6(new na9((lzn0) d7pVar.get(), (byte) 9), (byte) 5);
        ur6 ur6Var10 = new ur6((lzn0) d7pVar.get(), b);
        oi51 x6eVar7 = new x6e(e(), (lzn0) d7pVar.get());
        oi51 nmuVar3 = new nmu((byte) 0);
        iz6 iz6VarY2 = y();
        yyn yynVar2 = (yyn) kly0Var.get();
        c8o.l(yynVar2);
        avp avpVar2 = (avp) kly0Var2.get();
        c8o.l(avpVar2);
        byte b2 = 1;
        Set setS1 = f46.S0(new oi51[]{ra8Var, lb8Var, ur6Var8, pc8Var, ur6Var9, ur6Var10, x6eVar7, nmuVar3, iz6VarY2, new lb6(yynVar2, avpVar2, c(), b2), new ur6(this.V, b2), new nmu((byte) 1)});
        int iC = l1d.C(l1oVar.b);
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return null;
            }
            setS0 = setS1;
        }
        return setS0;
    }

    public t9h1 x() {
        l1o l1oVar = (l1o) this.D;
        String str = p().c;
        String str2 = l1oVar.a;
        int iC = l1d.C(l1oVar.b);
        if (iC == 0) {
            return new txk0(str, str2, (byte) 5);
        }
        if (iC == 1) {
            return new itk0(str, str2);
        }
        eg.o();
        return null;
    }

    public iz6 y() {
        p9p p9pVar = (p9p) this.j.get();
        i1o i1oVar = (i1o) this.C;
        neq neqVar = (neq) i1oVar.f23p.get();
        c8o.l(neqVar);
        abm abmVarB = i1oVar.b();
        c8o.l(abmVarB);
        return new iz6(p9pVar, neqVar, abmVarB, c());
    }

    public lik1 z() {
        l1o l1oVar = (l1o) this.D;
        String str = l1oVar.a;
        int iC = l1d.C(l1oVar.b);
        if (iC == 0) {
            return nik1.N.b(str);
        }
        if (iC == 1) {
            return nik1.P4.b(str);
        }
        eg.o();
        return null;
    }

    public u9p(ys10 ys10Var, q2p0 q2p0Var) {
        this.C = ys10Var;
        this.D = q2p0Var;
        byte b = 2;
        this.a = byo.d(this, 2);
        this.b = byo.d(this, 3);
        this.c = byo.d(this, 4);
        this.d = byo.d(this, 6);
        this.e = byo.d(this, 7);
        this.f = byo.d(this, 5);
        this.g = byo.d(this, 9);
        this.h = byo.d(this, 8);
        this.i = byo.d(this, 10);
        this.j = byo.d(this, 11);
        this.k = byo.d(this, 12);
        this.l = byo.d(this, 13);
        this.m = byo.d(this, 14);
        this.n = byo.d(this, 15);
        this.o = byo.d(this, 17);
        this.f68p = byo.d(this, 16);
        this.q = xqu.b(new chp(this, 19, b));
        this.E = new chp(this, 18, b);
        this.r = byo.d(this, 21);
        this.F = new chp(this, 22, b);
        this.s = byo.d(this, 23);
        this.t = byo.d(this, 24);
        this.G = new chp(this, 20, b);
        this.H = new chp(this, 25, b);
        this.u = xqu.b(new chp(this, 27, b));
        this.v = xqu.b(new chp(this, 26, b));
        this.w = byo.d(this, 28);
        this.I = new chp(this, 29, b);
        this.J = new chp(this, 30, b);
        this.x = xqu.b(new chp(this, 31, b));
        this.K = new chp(this, 32, b);
        this.L = new chp(this, 33, b);
        this.M = new chp(this, 34, b);
        this.N = new chp(this, 35, b);
        this.O = new chp(this, 36, b);
        this.P = new chp(this, 37, b);
        this.y = byo.d(this, 1);
        this.Q = new chp(this, 38, b);
        this.z = byo.d(this, 40);
        this.R = new chp(this, 39, b);
        this.A = byo.d(this, 42);
        this.B = byo.d(this, 41);
        this.S = byo.d(this, 43);
        this.T = byo.d(this, 44);
        this.U = byo.d(this, 45);
        this.V = byo.d(this, 46);
        this.W = new chp(this, 0, b);
    }
}
