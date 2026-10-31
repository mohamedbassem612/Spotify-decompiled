package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class k9o0 implements jly0 {
    public static xbu0 A(q2p0 q2p0Var) {
        crb1 crb1Var;
        uqb1 uqb1VarC = q2p0Var.c();
        switch (uqb1VarC.a) {
            case 0:
                crb1Var = uqb1VarC.b.c;
                break;
            case 1:
                crb1Var = uqb1VarC.b.c;
                break;
            default:
                crb1Var = uqb1VarC.b.c;
                break;
        }
        c8o.m(crb1Var);
        return crb1Var;
    }

    public static Flowable B(q2p0 q2p0Var) {
        return q2p0Var.c().d();
    }

    public static pnv0 C(RetrofitMaker retrofitMaker) {
        return (pnv0) retrofitMaker.createWebgateService(pnv0.class, "android-notifications-remotedatasource");
    }

    public static gyy0 D(RetrofitMaker retrofitMaker) {
        return (gyy0) retrofitMaker.createWebgateService(gyy0.class, "android-notification-appintegrationmusic");
    }

    public static kco0 a() {
        return new kco0();
    }

    public static t700 b(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 18);
    }

    public static egn0 c(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 5);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static n9o0 d(jo80 jo80Var, jo80 jo80Var2, r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, gbp gbpVar, r7q r7qVar3, r7q r7qVar4, g5t g5tVar, kly0 kly0Var, caq caqVar3, caq caqVar4, caq caqVar5, r7q r7qVar5, r7q r7qVar6, gbp gbpVar2, r7q r7qVar7, r7q r7qVar8, r7q r7qVar9, kly0 kly0Var2, r7q r7qVar10, caq caqVar6, g5t g5tVar2, r7q r7qVar11, kly0 kly0Var3, jly0 jly0Var, kly0 kly0Var4, caq caqVar7, caq caqVar8, gbp gbpVar3, kly0 kly0Var5, r7q r7qVar12, gbp gbpVar4, caq caqVar9, gbp gbpVar5) {
        n9o0 n9o0Var = new n9o0();
        n9o0Var.a = jo80Var;
        n9o0Var.b = jo80Var2;
        n9o0Var.c = r7qVar;
        n9o0Var.d = r7qVar2;
        n9o0Var.e = caqVar;
        n9o0Var.f = caqVar2;
        n9o0Var.g = gbpVar;
        n9o0Var.h = r7qVar3;
        n9o0Var.i = r7qVar4;
        n9o0Var.j = g5tVar;
        n9o0Var.k = kly0Var;
        n9o0Var.l = caqVar3;
        n9o0Var.m = caqVar4;
        n9o0Var.n = caqVar5;
        n9o0Var.o = r7qVar5;
        n9o0Var.f56p = r7qVar6;
        n9o0Var.q = gbpVar2;
        n9o0Var.r = r7qVar7;
        n9o0Var.s = r7qVar8;
        n9o0Var.t = r7qVar9;
        n9o0Var.u = kly0Var2;
        n9o0Var.v = r7qVar10;
        n9o0Var.w = caqVar6;
        n9o0Var.x = g5tVar2;
        n9o0Var.y = r7qVar11;
        n9o0Var.z = kly0Var3;
        n9o0Var.A = jly0Var;
        n9o0Var.B = kly0Var4;
        n9o0Var.C = caqVar7;
        n9o0Var.D = caqVar8;
        n9o0Var.E = gbpVar3;
        n9o0Var.F = kly0Var5;
        n9o0Var.G = r7qVar12;
        n9o0Var.H = gbpVar4;
        n9o0Var.I = caqVar9;
        n9o0Var.J = gbpVar5;
        return n9o0Var;
    }

    public static qgo0 e(jly0 jly0Var, kly0 kly0Var, kly0 kly0Var2, caq caqVar, kly0 kly0Var3) {
        qgo0 qgo0Var = new qgo0();
        qgo0Var.a = jly0Var;
        qgo0Var.b = kly0Var;
        qgo0Var.c = kly0Var2;
        qgo0Var.d = caqVar;
        qgo0Var.e = kly0Var3;
        return qgo0Var;
    }

    public static rio0 f(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var) {
        rio0 rio0Var = new rio0();
        rio0Var.a = r7qVar;
        rio0Var.b = r7qVar2;
        rio0Var.c = r7qVar3;
        rio0Var.d = kly0Var;
        return rio0Var;
    }

    public static dpo0 g(caq caqVar, caq caqVar2, jly0 jly0Var, kly0 kly0Var) {
        dpo0 dpo0Var = new dpo0();
        dpo0Var.a = jly0Var;
        dpo0Var.b = caqVar;
        dpo0Var.c = kly0Var;
        dpo0Var.d = caqVar2;
        return dpo0Var;
    }

    public static kqo0 h(jly0 jly0Var, caq caqVar, kly0 kly0Var, jly0 jly0Var2, caq caqVar2, kly0 kly0Var2, jly0 jly0Var3, caq caqVar3) {
        kqo0 kqo0Var = new kqo0();
        kqo0Var.a = jly0Var;
        kqo0Var.b = caqVar;
        kqo0Var.c = kly0Var;
        kqo0Var.d = jly0Var2;
        kqo0Var.e = caqVar2;
        kqo0Var.f = kly0Var2;
        kqo0Var.g = jly0Var3;
        kqo0Var.h = caqVar3;
        return kqo0Var;
    }

    public static rvo0 i(jo80 jo80Var, jo80 jo80Var2, r7q r7qVar, kly0 kly0Var, gbp gbpVar, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var2, caq caqVar, caq caqVar2, r7q r7qVar4, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6) {
        rvo0 rvo0Var = new rvo0();
        rvo0Var.a = jo80Var;
        rvo0Var.b = jo80Var2;
        rvo0Var.c = r7qVar;
        rvo0Var.d = kly0Var;
        rvo0Var.e = gbpVar;
        rvo0Var.f = r7qVar2;
        rvo0Var.g = r7qVar3;
        rvo0Var.h = kly0Var2;
        rvo0Var.i = caqVar;
        rvo0Var.j = caqVar2;
        rvo0Var.k = r7qVar4;
        rvo0Var.l = caqVar3;
        rvo0Var.m = caqVar4;
        rvo0Var.n = caqVar5;
        rvo0Var.o = caqVar6;
        return rvo0Var;
    }

    public static cwo0 j(jo80 jo80Var, r7q r7qVar, kly0 kly0Var, gbp gbpVar, kly0 kly0Var2, caq caqVar, caq caqVar2, r7q r7qVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, r7q r7qVar3) {
        cwo0 cwo0Var = new cwo0();
        cwo0Var.a = jo80Var;
        cwo0Var.b = r7qVar;
        cwo0Var.c = kly0Var;
        cwo0Var.d = gbpVar;
        cwo0Var.e = kly0Var2;
        cwo0Var.f = caqVar;
        cwo0Var.g = caqVar2;
        cwo0Var.h = r7qVar2;
        cwo0Var.i = caqVar3;
        cwo0Var.j = caqVar4;
        cwo0Var.k = caqVar5;
        cwo0Var.l = caqVar6;
        cwo0Var.m = r7qVar3;
        return cwo0Var;
    }

    public static r2p0 k(gbp gbpVar, gbp gbpVar2, gbp gbpVar3, gbp gbpVar4, gbp gbpVar5, gbp gbpVar6, gbp gbpVar7, gbp gbpVar8, gbp gbpVar9, kly0 kly0Var, gbp gbpVar10, gbp gbpVar11, gbp gbpVar12, gbp gbpVar13, gbp gbpVar14, gbp gbpVar15, gbp gbpVar16, gbp gbpVar17, gbp gbpVar18, gbp gbpVar19) {
        r2p0 r2p0Var = new r2p0((byte) 1);
        r2p0Var.b = gbpVar;
        r2p0Var.c = gbpVar2;
        r2p0Var.d = gbpVar3;
        r2p0Var.e = gbpVar4;
        r2p0Var.f = gbpVar5;
        r2p0Var.g = gbpVar6;
        r2p0Var.h = gbpVar7;
        r2p0Var.i = gbpVar8;
        r2p0Var.j = gbpVar9;
        r2p0Var.k = kly0Var;
        r2p0Var.l = gbpVar10;
        r2p0Var.m = gbpVar11;
        r2p0Var.n = gbpVar12;
        r2p0Var.o = gbpVar13;
        r2p0Var.f67p = gbpVar14;
        r2p0Var.q = gbpVar15;
        r2p0Var.r = gbpVar16;
        r2p0Var.s = gbpVar17;
        r2p0Var.t = gbpVar18;
        r2p0Var.u = gbpVar19;
        return r2p0Var;
    }

    public static t700 l(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 19);
    }

    public static egn0 m(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 6);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static t700 n(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 21);
    }

    public static egn0 o(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 7);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static egn0 p(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 8);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static egn0 q(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 10);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static hnl r(q2p0 q2p0Var) {
        hnl hnlVarL = q2p0Var.l();
        c8o.m(hnlVarL);
        return hnlVarL;
    }

    public static u9c0 s(dg30 dg30Var) {
        return cto1.q(dg30Var);
    }

    public static d0r t(q2p0 q2p0Var) {
        d0r d0rVarN = q2p0Var.n();
        c8o.m(d0rVarN);
        return d0rVarN;
    }

    public static awt u(RetrofitMaker retrofitMaker) {
        return (awt) retrofitMaker.createWebgateService(awt.class, "android-notifications-remotedatasource");
    }

    public static iac0 v(q2p0 q2p0Var) {
        iac0 iac0VarB = q2p0Var.b();
        c8o.m(iac0VarB);
        return iac0VarB;
    }

    public static h0p0 w() {
        return new h0p0("", nik1.m1.a);
    }

    public static pqq0 x(q2p0 q2p0Var) {
        pqq0 pqq0VarK = q2p0Var.k();
        c8o.m(pqq0VarK);
        return pqq0VarK;
    }

    public static FlowableJust y(hnl hnlVar) {
        boolean zI;
        switch (hnlVar.a) {
            case 0:
                zI = hnlVar.i();
                break;
            case 1:
                zI = hnlVar.g();
                break;
            default:
                zI = !hnlVar.b;
                break;
        }
        return Flowable.I(zI ? yqq0.c : yqq0.a);
    }

    public static w9u0 z(q2p0 q2p0Var) {
        arb1 arb1VarA = q2p0Var.c().a();
        c8o.m(arb1VarA);
        return arb1VarA;
    }
}
