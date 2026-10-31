package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class k0i1 implements jly0 {
    public static uww0 a(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 25);
    }

    public static k4z0 b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 20);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static dmg1 c(ynb0 ynb0Var) {
        dmg1 dmg1Var = new dmg1((byte) 8);
        dmg1Var.b = ynb0Var;
        return dmg1Var;
    }

    public static o0i1 d(r7q r7qVar, r7q r7qVar2, caq caqVar, r7q r7qVar3, r7q r7qVar4) {
        o0i1 o0i1Var = new o0i1();
        o0i1Var.a = r7qVar;
        o0i1Var.b = r7qVar2;
        o0i1Var.c = caqVar;
        o0i1Var.d = r7qVar3;
        o0i1Var.e = r7qVar4;
        return o0i1Var;
    }

    public static t1i1 e(r7q r7qVar, kly0 kly0Var, r7q r7qVar2, caq caqVar, jo80 jo80Var) {
        t1i1 t1i1Var = new t1i1();
        t1i1Var.a = r7qVar;
        t1i1Var.b = kly0Var;
        t1i1Var.c = r7qVar2;
        t1i1Var.d = caqVar;
        t1i1Var.e = jo80Var;
        return t1i1Var;
    }

    public static c4i1 f(caq caqVar, caq caqVar2, jly0 jly0Var, kly0 kly0Var) {
        c4i1 c4i1Var = new c4i1();
        c4i1Var.a = caqVar;
        c4i1Var.b = kly0Var;
        c4i1Var.c = jly0Var;
        c4i1Var.d = caqVar2;
        return c4i1Var;
    }

    public static v8i1 g(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6) {
        v8i1 v8i1Var = new v8i1();
        v8i1Var.a = jly0Var;
        v8i1Var.b = jly0Var2;
        v8i1Var.c = jly0Var3;
        v8i1Var.d = jly0Var4;
        v8i1Var.e = jly0Var5;
        v8i1Var.f = jly0Var6;
        return v8i1Var;
    }

    public static z8i1 h(jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, kly0 kly0Var, jly0 jly0Var2, caq caqVar, kly0 kly0Var2, kly0 kly0Var3, caq caqVar2, caq caqVar3, kly0 kly0Var4, kly0 kly0Var5, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, jo80 jo80Var3, jly0 jly0Var6, caq caqVar4, caq caqVar5, caq caqVar6) {
        z8i1 z8i1Var = new z8i1();
        z8i1Var.a = jo80Var;
        z8i1Var.b = jo80Var2;
        z8i1Var.c = jly0Var;
        z8i1Var.d = kly0Var;
        z8i1Var.e = jly0Var2;
        z8i1Var.f = caqVar;
        z8i1Var.g = kly0Var2;
        z8i1Var.h = kly0Var3;
        z8i1Var.i = caqVar2;
        z8i1Var.j = caqVar3;
        z8i1Var.k = kly0Var4;
        z8i1Var.l = kly0Var5;
        z8i1Var.m = jly0Var3;
        z8i1Var.n = jly0Var4;
        z8i1Var.o = jly0Var5;
        z8i1Var.f92p = jo80Var3;
        z8i1Var.q = jly0Var6;
        z8i1Var.r = caqVar4;
        z8i1Var.s = caqVar5;
        z8i1Var.t = caqVar6;
        return z8i1Var;
    }

    public static lii1 i(jo80 jo80Var, jo80 jo80Var2, gbp gbpVar, kly0 kly0Var, kly0 kly0Var2, r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, gbp gbpVar2, caq caqVar5, caq caqVar6, r7q r7qVar4, kly0 kly0Var3, kly0 kly0Var4, gbp gbpVar3, r7q r7qVar5, kly0 kly0Var5) {
        lii1 lii1Var = new lii1();
        lii1Var.a = jo80Var;
        lii1Var.b = jo80Var2;
        lii1Var.c = gbpVar;
        lii1Var.d = kly0Var;
        lii1Var.e = kly0Var2;
        lii1Var.f = r7qVar;
        lii1Var.g = r7qVar2;
        lii1Var.h = r7qVar3;
        lii1Var.i = caqVar;
        lii1Var.j = caqVar2;
        lii1Var.k = caqVar3;
        lii1Var.l = caqVar4;
        lii1Var.m = gbpVar2;
        lii1Var.n = caqVar5;
        lii1Var.o = caqVar6;
        lii1Var.f47p = r7qVar4;
        lii1Var.q = kly0Var3;
        lii1Var.r = kly0Var4;
        lii1Var.s = gbpVar3;
        lii1Var.t = r7qVar5;
        lii1Var.u = kly0Var5;
        return lii1Var;
    }

    public static k4z0 j(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 21);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static dmg1 k(ynb0 ynb0Var) {
        dmg1 dmg1Var = new dmg1((byte) 9);
        dmg1Var.b = ynb0Var;
        return dmg1Var;
    }

    public static k4z0 l(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 22);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static knm m(RetrofitMaker retrofitMaker) {
        return (knm) retrofitMaker.createWebgateService(knm.class, "android-upsells-impl");
    }

    public static ug90 n(RetrofitMaker retrofitMaker) {
        return (ug90) retrofitMaker.createWebgateService(ug90.class, "android-inappuserfeedback-issuereporterimpl");
    }

    public static daa0 o(RetrofitMaker retrofitMaker) {
        return (daa0) retrofitMaker.createWebgateService(daa0.class, "android-inappuserfeedback-issuereporterimpl");
    }

    public static j0i1 p(RetrofitMaker retrofitMaker) {
        return new j0i1((qnp0) retrofitMaker.createWebgateService(qnp0.class, "android-upsell-offer-endpoint-impl"));
    }

    public static llm q() {
        return smo1.e(flo1.l(guo1.B(), igu.a));
    }

    public static uai1 r(RetrofitMaker retrofitMaker) {
        return (uai1) retrofitMaker.createWebgateService(uai1.class, "android-entitysegments-userhighlightdataimpl");
    }
}
