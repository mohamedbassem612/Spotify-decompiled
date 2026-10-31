package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.accountswitching.v1.Account;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nwp {
    public final em0 a;
    public final fdc b;
    public final nwp c = this;
    public final gbp d = new gbp(this, 1, (byte) 1);
    public final gbp e = new gbp(this, 2, (byte) 1);
    public final gbp f = new gbp(this, 3, (byte) 1);
    public final gbp g = new gbp(this, 5, (byte) 1);
    public final gbp h = new gbp(this, 4, (byte) 1);
    public final gbp i = new gbp(this, 6, (byte) 1);
    public final gbp j = new gbp(this, 7, (byte) 1);
    public final gbp k = new gbp(this, 8, (byte) 1);
    public final gbp l = new gbp(this, 9, (byte) 1);
    public final gbp m = new gbp(this, 10, (byte) 1);
    public final gbp n = new gbp(this, 11, (byte) 1);
    public final jly0 o = byo.o(this, 13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f33p = xqu.b(new gbp(this, 15, (byte) 1));
    public final jly0 q = byo.o(this, 14);
    public final jly0 r = xqu.b(new gbp(this, 12, (byte) 1));
    public final gbp s = new gbp(this, 16, (byte) 1);
    public final gbp t = new gbp(this, 17, (byte) 1);
    public final gbp u = new gbp(this, 18, (byte) 1);
    public final gbp v = new gbp(this, 19, (byte) 1);
    public final gbp w = new gbp(this, 20, (byte) 1);
    public final gbp x = new gbp(this, 21, (byte) 1);
    public final gbp y = new gbp(this, 22, (byte) 1);
    public final gbp z = new gbp(this, 23, (byte) 1);
    public final gbp A = new gbp(this, 24, (byte) 1);
    public final gbp B = new gbp(this, 25, (byte) 1);
    public final gbp C = new gbp(this, 0, (byte) 1);
    public final gbp D = new gbp(this, 27, (byte) 1);
    public final gbp E = new gbp(this, 28, (byte) 1);
    public final gbp F = new gbp(this, 29, (byte) 1);
    public final gbp G = new gbp(this, 30, (byte) 1);
    public final gbp H = new gbp(this, 31, (byte) 1);
    public final gbp I = new gbp(this, 32, (byte) 1);
    public final gbp J = new gbp(this, 33, (byte) 1);
    public final gbp K = new gbp(this, 34, (byte) 1);
    public final gbp L = new gbp(this, 26, (byte) 1);
    public final gbp M = new gbp(this, 35, (byte) 1);
    public final gbp N = new gbp(this, 37, (byte) 1);
    public final gbp O = new gbp(this, 36, (byte) 1);
    public final jly0 P = xqu.b(new gbp(this, 38, (byte) 1));
    public final jly0 Q = xqu.b(new gbp(this, 39, (byte) 1));
    public final gbp R = new gbp(this, 40, (byte) 1);
    public final gbp S = new gbp(this, 41, (byte) 1);
    public final jly0 T = xqu.b(new gbp(this, 42, (byte) 1));
    public final gbp U = new gbp(this, 44, (byte) 1);
    public final gbp V = new gbp(this, 45, (byte) 1);
    public final gbp W = new gbp(this, 46, (byte) 1);
    public final jly0 X = byo.o(this, 47);
    public final jly0 Y = byo.o(this, 48);
    public final gbp Z = new gbp(this, 50, (byte) 1);
    public final jly0 a0 = byo.o(this, 49);
    public final jly0 b0 = xqu.b(new gbp(this, 52, (byte) 1));
    public final jly0 c0 = byo.o(this, 53);
    public final jly0 d0 = byo.o(this, 51);
    public final jly0 e0 = xqu.b(new gbp(this, 54, (byte) 1));
    public final gbp f0 = new gbp(this, 57, (byte) 1);
    public final jly0 g0 = byo.o(this, 59);
    public final jly0 h0 = byo.o(this, 60);
    public final jly0 i0 = xqu.b(new gbp(this, 61, (byte) 1));
    public final jly0 j0 = xqu.b(new gbp(this, 62, (byte) 1));
    public final jly0 k0 = byo.o(this, 58);
    public final jly0 l0 = byo.o(this, 65);
    public final jly0 m0 = byo.o(this, 66);
    public final jly0 n0 = byo.o(this, 64);
    public final gbp o0 = new gbp(this, 67, (byte) 1);
    public final gbp p0 = new gbp(this, 68, (byte) 1);
    public final jly0 q0 = byo.o(this, 63);
    public final jly0 r0 = byo.o(this, 56);
    public final jly0 s0 = byo.o(this, 55);
    public final jly0 t0 = byo.o(this, 70);
    public final jly0 u0 = byo.o(this, 71);
    public final jly0 v0 = byo.o(this, 69);
    public final jly0 w0 = byo.o(this, 73);
    public final jly0 x0 = byo.o(this, 72);
    public final jly0 y0 = byo.o(this, 74);
    public final jly0 z0 = byo.o(this, 75);
    public final jly0 A0 = xqu.b(new gbp(this, 77, (byte) 1));
    public final gbp B0 = new gbp(this, 78, (byte) 1);
    public final jly0 C0 = byo.o(this, 76);
    public final jly0 D0 = byo.o(this, 79);
    public final jly0 E0 = xqu.b(new gbp(this, 81, (byte) 1));
    public final jly0 F0 = xqu.b(new gbp(this, 80, (byte) 1));
    public final gbp G0 = new gbp(this, 82, (byte) 1);
    public final jly0 H0 = xqu.b(new gbp(this, 84, (byte) 1));
    public final jly0 I0 = byo.o(this, 86);
    public final jly0 J0 = byo.o(this, 85);
    public final jly0 K0 = byo.o(this, 87);
    public final gbp L0 = new gbp(this, 89, (byte) 1);
    public final jly0 M0 = byo.o(this, 91);
    public final jly0 N0 = byo.o(this, 90);
    public final jly0 O0 = byo.o(this, 88);
    public final gbp P0 = new gbp(this, 92, (byte) 1);
    public final jly0 Q0 = byo.o(this, 83);
    public final jly0 R0 = byo.o(this, 93);
    public final jly0 S0 = byo.o(this, 94);
    public final jly0 T0 = byo.o(this, 95);
    public final jly0 U0 = byo.o(this, 96);
    public final gbp V0 = new gbp(this, 98, (byte) 1);
    public final jly0 W0 = byo.o(this, 97);
    public final jly0 X0 = byo.o(this, 100);
    public final jly0 Y0 = byo.o(this, 101);
    public final jly0 Z0 = byo.o(this, 99);
    public final jly0 a1 = byo.o(this, Account.MANAGED_ACCOUNT_FIELD_NUMBER);
    public final jly0 b1 = byo.o(this, 102);
    public final jly0 c1 = byo.o(this, 105);
    public final jly0 d1 = byo.o(this, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
    public final jly0 e1 = byo.o(this, 106);
    public final jly0 f1 = byo.o(this, 107);
    public final jly0 g1 = byo.o(this, 108);
    public final gbp h1 = new gbp(this, 111, (byte) 1);
    public final jly0 i1 = byo.o(this, 112);
    public final jly0 j1 = byo.o(this, 110);
    public final jly0 k1 = byo.o(this, 109);
    public final jly0 l1 = byo.o(this, 113);
    public final gbp m1 = new gbp(this, 43, (byte) 1);
    public final jly0 n1 = byo.o(this, 114);
    public final jly0 o1 = byo.o(this, 116);
    public final gbp p1 = new gbp(this, 115, (byte) 1);
    public final jly0 q1 = byo.o(this, 120);
    public final jly0 r1 = xqu.b(new gbp(this, 119, (byte) 1));
    public final jly0 s1 = byo.o(this, 118);
    public final gbp t1 = new gbp(this, 117, (byte) 1);
    public final jly0 u1 = byo.o(this, 122);
    public final gbp v1 = new gbp(this, 121, (byte) 1);
    public final gbp w1 = new gbp(this, 126, (byte) 1);
    public final jly0 x1 = xqu.b(new gbp(this, 127, (byte) 1));
    public final jly0 y1 = xqu.b(new gbp(this, 128, (byte) 1));
    public final jly0 z1 = xqu.b(new gbp(this, 129, (byte) 1));
    public final jly0 A1 = xqu.b(new gbp(this, 125, (byte) 1));
    public final jly0 B1 = byo.o(this, 124);
    public final gbp C1 = new gbp(this, 123, (byte) 1);
    public final jly0 D1 = byo.o(this, 131);
    public final gbp E1 = new gbp(this, 130, (byte) 1);
    public final jly0 F1 = byo.o(this, 133);
    public final gbp G1 = new gbp(this, 132, (byte) 1);
    public final jly0 H1 = byo.o(this, 135);
    public final gbp I1 = new gbp(this, 134, (byte) 1);
    public final jly0 J1 = byo.o(this, 137);
    public final gbp K1 = new gbp(this, 136, (byte) 1);
    public final jly0 L1 = xqu.b(new gbp(this, 138, (byte) 1));
    public final gbp M1 = new gbp(this, 139, (byte) 1);
    public final jly0 N1 = byo.o(this, 143);
    public final jly0 O1 = byo.o(this, 142);
    public final gbp P1 = new gbp(this, 144, (byte) 1);
    public final jly0 Q1 = byo.o(this, 141);
    public final jly0 R1 = byo.o(this, 140);
    public final jly0 S1 = byo.o(this, 145);
    public final jly0 T1 = byo.o(this, 146);

    public nwp(em0 em0Var, fdc fdcVar) {
        this.a = em0Var;
        this.b = fdcVar;
    }

    public final g62 A() {
        return new g62(new nup(this.c), (byte) 3);
    }

    public final s4w0 B() {
        em0 em0Var = this.a;
        daq daqVar = (daq) em0Var.b;
        w4h w4hVar = (w4h) daqVar.k7.get();
        c8o.l(w4hVar);
        ccc0 ccc0Var = (ccc0) ((teq) em0Var.c).q3.get();
        c8o.l(ccc0Var);
        g7h g7hVar = (g7h) daqVar.b7.get();
        c8o.l(g7hVar);
        return new s4w0(w4hVar, ccc0Var, g7hVar);
    }

    public final o0y C() {
        qup qupVar = new qup(this.c);
        rh11 rh11VarK0 = this.a.K0();
        c8o.l(rh11VarK0);
        return new o0y(qupVar, rh11VarK0, (byte) 3);
    }

    public final Single D() {
        em0 em0Var = this.a;
        boolean zBooleanValue = ((Boolean) ((teq) em0Var.c).ce.get()).booleanValue();
        xvo xvoVar = (xvo) ((daq) em0Var.b).H8.get();
        c8o.l(xvoVar);
        if (zBooleanValue) {
            Single singleFirstOrError = xvoVar.a(true).firstOrError();
            singleFirstOrError.getClass();
            return singleFirstOrError;
        }
        Single singleJust = Single.just(Boolean.FALSE);
        singleJust.getClass();
        return singleJust;
    }

    public final dxy E() {
        Context context = (Context) this.b.d;
        c8o.l(context);
        em0 em0Var = this.a;
        s8q s8qVar = (s8q) ((daq) em0Var.b).b5.get();
        c8o.l(s8qVar);
        teq teqVar = (teq) em0Var.c;
        lvc0 lvc0Var = (lvc0) teqVar.G1.get();
        c8o.l(lvc0Var);
        kxc0 kxc0Var = (kxc0) teqVar.F1.get();
        c8o.l(kxc0Var);
        uxc0 uxc0Var = (uxc0) teqVar.N4.get();
        c8o.l(uxc0Var);
        int i = t380.c;
        return new dxy(context, s8qVar, lvc0Var, kxc0Var, uxc0Var, kg11.t);
    }

    public final a1i1 F() {
        em0 em0Var = this.a;
        RetrofitMaker retrofitMakerM0 = em0Var.M0();
        c8o.l(retrofitMakerM0);
        knm knmVarM = k0i1.m(retrofitMakerM0);
        fdc fdcVar = this.b;
        Context context = (Context) fdcVar.d;
        c8o.l(context);
        wpv0 wpv0Var = new wpv0(context, new oh4((luk) this.g.get()));
        yqg yqgVar = (yqg) this.i.get();
        t2j0 t2j0VarI0 = em0Var.i0();
        c8o.l(t2j0VarI0);
        qy30 qy30Var = new qy30(t2j0VarI0);
        yzh1 yzh1Var = (yzh1) ((daq) em0Var.b).Br.get();
        c8o.l(yzh1Var);
        Context context2 = (Context) fdcVar.d;
        c8o.l(context2);
        return new a1i1(knmVarM, wpv0Var, yqgVar, qy30Var, yzh1Var, context2, k0i1.q());
    }

    public final o0y G() {
        return new o0y(new wup(this.c), new un4((luk) this.g.get()), (byte) 4);
    }

    public final g62 a() {
        return new g62(new cup(this.c), (byte) 0);
    }

    public final u961 b() {
        ov20 ov20Var = (ov20) ((daq) this.a.b).P5.get();
        c8o.l(ov20Var);
        return new u961(ov20Var, xqu.a(this.R), xqu.a(this.S), (vhs0) this.T.get());
    }

    public final cz2 c() {
        eup eupVar = new eup(this.c);
        gbp gbpVar = this.g;
        return new cz2(eupVar, new ev4(false, false, (luk) gbpVar.get()), new un4((luk) gbpVar.get()), new eg0((dg30) this.e.get()));
    }

    public final j44 d() {
        return new j44((luk) this.g.get());
    }

    public final sn4 e() {
        return new sn4((luk) this.g.get());
    }

    public final mr4 f() {
        return new mr4((luk) this.g.get());
    }

    public final g26 g() {
        return new g26((luk) this.g.get());
    }

    public final jc6 h() {
        a1r0 a1r0VarA0 = this.a.A0();
        c8o.l(a1r0VarA0);
        return new jc6(a1r0VarA0);
    }

    public final ajq0 i() {
        u961 u961VarB = b();
        em0 em0Var = this.a;
        dma1 dma1VarZ0 = em0Var.Z0();
        c8o.l(dma1VarZ0);
        in01 in01Var = new in01(dma1VarZ0);
        cn4 cn4Var = new cn4((luk) this.g.get());
        a1r0 a1r0VarA0 = em0Var.A0();
        c8o.l(a1r0VarA0);
        b0a0 b0a0Var = (b0a0) ((daq) em0Var.b).bm.get();
        c8o.l(b0a0Var);
        return new ajq0(u961VarB, in01Var, cn4Var, a1r0VarA0, b0a0Var);
    }

    public final joe j() {
        em0 em0Var = this.a;
        a1r0 a1r0VarA0 = em0Var.A0();
        c8o.l(a1r0VarA0);
        dma1 dma1VarZ0 = em0Var.Z0();
        c8o.l(dma1VarZ0);
        return new joe(a1r0VarA0, new poe((yqg) this.i.get(), dma1VarZ0), (v03) this.H0.get());
    }

    public final List k() {
        em0 em0Var = this.a;
        ao0 ao0VarH = em0Var.h();
        c8o.l(ao0VarH);
        b1x f2xVar = new f2x(ao0VarH, (txo) this.O1.get());
        gw70 gw70VarA0 = em0Var.a0();
        c8o.l(gw70VarA0);
        teq teqVar = (teq) em0Var.c;
        yiq yiqVar = teqVar.b;
        w3q w3qVar = (w3q) yiqVar.Ab.get();
        daq daqVar = yiqVar.a;
        o860 o860Var = new o860((i44) yiqVar.b.v7.get(), (i01) daqVar.a.V1.get(), (i01) daqVar.a.W1.get(), w3qVar, (byte) 12);
        ao0 ao0VarH2 = em0Var.h();
        c8o.l(ao0VarH2);
        b1x ezwVar = new ezw(gw70VarA0, o860Var, ao0VarH2);
        yiq yiqVar2 = teqVar.b;
        daq daqVar2 = yiqVar2.a;
        ao0 ao0Var = (ao0) daqVar2.Hk.get();
        hbq hbqVar = daqVar2.a;
        gid gidVarA = hbqVar.a();
        t2j0 t2j0Var = (t2j0) daqVar2.f2.get();
        teq teqVar2 = yiqVar2.b;
        ip31 ip31Var = new ip31(new c070(ao0Var, gidVarA, t2j0Var, (pxc) teqVar2.t7.get(), (i44) teqVar2.v7.get(), (q8n) daqVar2.E1.get(), (q8n) daqVar2.V2.get()), (ao0) daqVar2.Hk.get(), (i01) hbqVar.V1.get(), (i01) hbqVar.W1.get(), (i44) teqVar2.v7.get(), (yqg) daqVar2.J1.get(), (op0) teqVar2.C7.get(), (zle1) daqVar2.a3.get(), (byte) 27);
        ao0 ao0VarH3 = em0Var.h();
        c8o.l(ao0VarH3);
        b1x ezwVar2 = new ezw(ip31Var, ao0VarH3, d());
        gw70 gw70VarA1 = em0Var.a0();
        c8o.l(gw70VarA1);
        o290 o290Var = (o290) teqVar.tf.get();
        c8o.l(o290Var);
        ao0 ao0VarH4 = em0Var.h();
        c8o.l(ao0VarH4);
        b1x z0xVar = new z0x(gw70VarA1, o290Var, ao0VarH4);
        daq daqVar3 = (daq) em0Var.b;
        qaq qaqVar = (qaq) daqVar3.a.r2.get();
        c8o.l(qaqVar);
        av0 av0Var = (av0) daqVar3.a.s2.get();
        c8o.l(av0Var);
        q290 q290Var = (q290) teqVar.Wf.get();
        c8o.l(q290Var);
        a1r0 a1r0VarA0 = em0Var.A0();
        c8o.l(a1r0VarA0);
        n2x n2xVar = new n2x(qaqVar, av0Var, this.P1, q290Var, new yje(a1r0VarA0));
        woa woaVarS = em0Var.s();
        c8o.l(woaVarS);
        av0 av0Var2 = (av0) daqVar3.a.s2.get();
        c8o.l(av0Var2);
        List listW = daqVar3.a.w();
        yiq yiqVar3 = teqVar.b;
        c4q c4qVar = (c4q) yiqVar3.Jb.get();
        teq teqVar3 = yiqVar3.b;
        z3q z3qVar = (z3q) teqVar3.Uf.get();
        op0 op0Var = (op0) teqVar3.C7.get();
        a4q a4qVar = (a4q) teqVar3.Vf.get();
        daq daqVar4 = yiqVar3.a;
        byp bypVar = new byp(c4qVar, z3qVar, op0Var, a4qVar, (av0) daqVar4.a.s2.get(), (i44) teqVar3.v7.get(), (fv0) teqVar3.wf.get(), (gw70) daqVar4.d8.get(), (woa) daqVar4.W8.get());
        a1r0 a1r0VarA1 = em0Var.A0();
        c8o.l(a1r0VarA1);
        rmr rmrVar = new rmr(a1r0VarA1, (byte) 22);
        a1r0 a1r0VarA2 = em0Var.A0();
        c8o.l(a1r0VarA2);
        n2x l2xVar = new l2x(woaVarS, av0Var2, this.P1, listW, bypVar, rmrVar, new jut((lzn0) this.G.get(), a1r0VarA2, (byte) 22));
        if (new i44((luk) this.g.get()).g() == h44.c) {
            n2xVar = l2xVar;
        }
        return p7h.M(new b1x[]{f2xVar, ezwVar, ezwVar2, z0xVar, n2xVar});
    }

    public final xrk l() {
        return new xrk(new gm4((luk) this.g.get()), (o241) this.k.get());
    }

    public final g62 m() {
        return new g62(new oup(this.c), (byte) 1);
    }

    public final l6s n() {
        daq daqVar = (daq) this.a.b;
        xvo xvoVar = (xvo) daqVar.H8.get();
        c8o.l(xvoVar);
        ln91 ln91Var = (ln91) daqVar.yf.get();
        c8o.l(ln91Var);
        pqs pqsVar = (pqs) daqVar.ka.get();
        c8o.l(pqsVar);
        return new l6s(xvoVar, ln91Var, pqsVar);
    }

    public final gmt o() {
        return new gmt((z1x) this.A1.get(), new x3s((mr20) this.x1.get(), (byte) 23), (byte) 24);
    }

    public final sua p() {
        new im4(false, (luk) this.g.get());
        return new sua((byte) 9);
    }

    public final o0y q() {
        return new o0y(new sup(this.c), (i0y) this.o.get(), (byte) 0);
    }

    public final o0y r() {
        return new o0y(new tup(this.c), (us10) this.q.get(), (byte) 1);
    }

    public final m441 s() {
        fza1 fza1Var = (fza1) this.u.get();
        j44 j44VarD = d();
        q8n q8nVarG0 = this.a.g0();
        c8o.l(q8nVarG0);
        return bjv.a(new hce1(this.w1, fza1Var, j44VarD, q8nVarG0, (byte) 5));
    }

    public final g62 t() {
        return new g62(new vup(this.c), (byte) 2);
    }

    public final sp00 u() {
        hjc hjcVar = new hjc(((xfx) this.h.get()).b, (byte) 9);
        em0 em0Var = this.a;
        y5v0 y5v0Var = (y5v0) ((teq) em0Var.c).T4.get();
        c8o.l(y5v0Var);
        mcn1 mcn1Var = new mcn1(((Context) this.b.d).getApplicationContext());
        Activity activityM = em0Var.m();
        c8o.l(activityM);
        return new sp00(hjcVar, y5v0Var, mcn1Var, new ij81(activityM), (byte) 19);
    }

    public final o0y v() {
        return new o0y(new wup(this.c), new s6z0(((teq) this.a.c).b.b.W1(), (byte) 14), (byte) 2);
    }

    public final mmf0 w() {
        return new mmf0(new ypa((byte) 4, false), new iup(this.c));
    }

    public final o3e0 x() {
        em0 em0Var = this.a;
        f7i0 f7i0Var = (f7i0) ((daq) em0Var.b).Oq.get();
        c8o.l(f7i0Var);
        a1r0 a1r0VarA0 = em0Var.A0();
        c8o.l(a1r0VarA0);
        return new o3e0(f7i0Var, a1r0VarA0);
    }

    public final hyo0 y() {
        return (hyo0) this.m1.get();
    }

    public final fzg0 z() {
        return new fzg0(f(), (cwp) this.n1.get());
    }
}
