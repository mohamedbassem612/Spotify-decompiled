package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.liveevents.recentlocationsimpl.db.RecentLocationsDatabase;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class q901 implements jly0 {
    public static lwf1 A() {
        return new lwf1();
    }

    public static zfm1 B(RetrofitMaker retrofitMaker) {
        return (zfm1) retrofitMaker.createWebgateService(zfm1.class, "android-recents-wrapped-share-landscape");
    }

    public static mc3 a(ynb0 ynb0Var) {
        mc3 mc3Var = new mc3((byte) 9);
        mc3Var.b = ynb0Var;
        return mc3Var;
    }

    public static ppw0 b(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 12);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static k4z0 c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 6);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static ml01 d(caq caqVar, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2) {
        ml01 ml01Var = new ml01();
        ml01Var.a = caqVar;
        ml01Var.b = jly0Var;
        ml01Var.c = kly0Var;
        ml01Var.d = jly0Var2;
        ml01Var.e = kly0Var2;
        return ml01Var;
    }

    public static cv01 e(kly0 kly0Var, jly0 jly0Var, r7q r7qVar, kly0 kly0Var2, kly0 kly0Var3, caq caqVar, r7q r7qVar2, r7q r7qVar3, caq caqVar2, jo80 jo80Var, caq caqVar3, kly0 kly0Var4, r7q r7qVar4, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var5, g5t g5tVar, caq caqVar7, kly0 kly0Var6, kly0 kly0Var7, caq caqVar8, caq caqVar9, caq caqVar10, g5t g5tVar2, caq caqVar11, r7q r7qVar5, caq caqVar12, caq caqVar13, g5t g5tVar3, r7q r7qVar6, r7q r7qVar7, kly0 kly0Var8) {
        cv01 cv01Var = new cv01();
        cv01Var.a = kly0Var;
        cv01Var.b = jly0Var;
        cv01Var.c = r7qVar;
        cv01Var.d = kly0Var2;
        cv01Var.e = kly0Var3;
        cv01Var.f = caqVar;
        cv01Var.g = r7qVar2;
        cv01Var.h = r7qVar3;
        cv01Var.i = caqVar2;
        cv01Var.j = jo80Var;
        cv01Var.k = caqVar3;
        cv01Var.l = kly0Var4;
        cv01Var.m = r7qVar4;
        cv01Var.n = caqVar4;
        cv01Var.o = caqVar5;
        cv01Var.f11p = caqVar6;
        cv01Var.q = kly0Var5;
        cv01Var.r = g5tVar;
        cv01Var.s = caqVar7;
        cv01Var.t = kly0Var6;
        cv01Var.u = kly0Var7;
        cv01Var.v = caqVar8;
        cv01Var.w = caqVar9;
        cv01Var.x = caqVar10;
        cv01Var.y = g5tVar2;
        cv01Var.z = caqVar11;
        cv01Var.A = r7qVar5;
        cv01Var.B = caqVar12;
        cv01Var.C = caqVar13;
        cv01Var.D = g5tVar3;
        cv01Var.E = r7qVar6;
        cv01Var.F = r7qVar7;
        cv01Var.G = kly0Var8;
        return cv01Var;
    }

    public static d111 f(kly0 kly0Var, jo80 jo80Var, caq caqVar, jo80 jo80Var2, caq caqVar2, jly0 jly0Var, kly0 kly0Var2, caq caqVar3, caq caqVar4, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, caq caqVar5, caq caqVar6, kly0 kly0Var3, caq caqVar7, jly0 jly0Var5, kly0 kly0Var4, caq caqVar8, jly0 jly0Var6, g5t g5tVar, kly0 kly0Var5, caq caqVar9, jly0 jly0Var7, caq caqVar10, caq caqVar11, jly0 jly0Var8, g5t g5tVar2, caq caqVar12, caq caqVar13, jly0 jly0Var9, caq caqVar14, caq caqVar15, caq caqVar16) {
        d111 d111Var = new d111();
        d111Var.a = kly0Var;
        d111Var.b = jo80Var;
        d111Var.c = caqVar;
        d111Var.d = jo80Var2;
        d111Var.e = caqVar2;
        d111Var.f = jly0Var;
        d111Var.g = kly0Var2;
        d111Var.h = caqVar3;
        d111Var.i = caqVar4;
        d111Var.j = jly0Var2;
        d111Var.k = jly0Var3;
        d111Var.l = jly0Var4;
        d111Var.m = caqVar5;
        d111Var.n = caqVar6;
        d111Var.o = kly0Var3;
        d111Var.f13p = caqVar7;
        d111Var.q = jly0Var5;
        d111Var.r = kly0Var4;
        d111Var.s = caqVar8;
        d111Var.t = jly0Var6;
        d111Var.u = g5tVar;
        d111Var.v = kly0Var5;
        d111Var.w = caqVar9;
        d111Var.x = jly0Var7;
        d111Var.y = caqVar10;
        d111Var.z = caqVar11;
        d111Var.A = jly0Var8;
        d111Var.B = g5tVar2;
        d111Var.C = caqVar12;
        d111Var.D = caqVar13;
        d111Var.E = jly0Var9;
        d111Var.F = caqVar14;
        d111Var.G = caqVar15;
        d111Var.H = caqVar16;
        return d111Var;
    }

    public static qd11 g(caq caqVar, jly0 jly0Var) {
        qd11 qd11Var = new qd11();
        qd11Var.a = jly0Var;
        qd11Var.b = caqVar;
        return qd11Var;
    }

    public static ppw0 h(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 13);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static uf0 i(Context context) {
        return new uf0(context);
    }

    public static bn70 j() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new bn70(yon1.E4(), nik1.x0, (nar0) null);
    }

    public static o67 k(a9q a9qVar) {
        return a9qVar.a("home");
    }

    public static muz l(q7r0 q7r0Var, t8u0 t8u0Var) {
        return t8u0Var.a(q7r0Var.d.c.getLifecycle()).d();
    }

    public static nkx0 m(ejb ejbVar) {
        return new nkx0(ejbVar, (byte) 14);
    }

    public static c1y0 n(l3q l3qVar) {
        return new c1y0(l3qVar, (byte) 29);
    }

    public static ij01 o(ohv0 ohv0Var) {
        return new ij01(ohv0Var, (byte) 0);
    }

    public static gm01 p(RecentLocationsDatabase recentLocationsDatabase) {
        gm01 gm01VarU = recentLocationsDatabase.u();
        c8o.m(gm01VarU);
        return gm01VarU;
    }

    public static RecentLocationsDatabase q(Context context) {
        return u890.t(context, RecentLocationsDatabase.class, "main-locations-database").c();
    }

    public static lo01 r(RetrofitMaker retrofitMaker) {
        return new lo01(retrofitMaker);
    }

    public static f0v0 s(no01 no01Var) {
        return new f0v0(no01Var, (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set t(lvc0 lvc0Var, kxc0 kxc0Var, tlu tluVar, l27 l27Var, o67 o67Var, o67 o67Var2, o67 o67Var3) {
        bdc1 bdc1Var = bdc1.a;
        return f46.S0(new l2r[]{lvc0Var.a(bdc1Var), kxc0Var.a(bdc1Var), tluVar, l27Var, o67Var, o67Var2, o67Var3});
    }

    public static uqv0 u(dma1 dma1Var) {
        return new uqv0(new k511(dma1Var), (byte) 18);
    }

    public static m911 v(RetrofitMaker retrofitMaker) {
        return (m911) retrofitMaker.createWebgateService(m911.class, "android-referrals-service");
    }

    public static rk11 w(tvp tvpVar) {
        return new rk11(tvpVar);
    }

    public static pp11 x(t8u0 t8u0Var, zeu0 zeu0Var, yqg yqgVar) {
        return new pp11(t8u0Var, zeu0Var, yqgVar);
    }

    public static cna0 y() {
        return new cna0((byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set z(w25 w25Var, ynb0 ynb0Var, ynb0 ynb0Var2) {
        return w25Var.b0() ? f46.S0(new qua0[]{ynb0Var.get(), ynb0Var2.get()}) : w7x.a;
    }
}
