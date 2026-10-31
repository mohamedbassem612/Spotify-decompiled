package p;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class sd30 implements jly0 {
    public static hk30 A(dg30 dg30Var, cgx cgxVar, t2j0 t2j0Var, bbr0 bbr0Var) {
        return cgxVar.a() ? new c0s(new zf10(dg30Var, t2j0Var, (byte) 19), new ik30(bbr0Var, (byte) 0)) : cco0.a;
    }

    public static cyp B(t8u0 t8u0Var, zf30 zf30Var) {
        return t8u0Var.a(zf30Var.s1);
    }

    public static kgv0 C(djp djpVar) {
        yc00 yc00Var = djpVar.a;
        return new kgv0((o241) yc00Var.e.get(), djpVar.a(), new k2b0((o2b0) ((RetrofitMaker) yc00Var.a.get()).createWebgateService(o2b0.class, "android-genalpha-datasourceimpl")), (mr20) yc00Var.h.get(), (bp) yc00Var.f.get());
    }

    public static Single D(kly0 kly0Var, kly0 kly0Var2, rh11 rh11Var) {
        return rh11Var.d().map(new tbl(kly0Var2, kly0Var)).firstOrError().onErrorReturnItem(kly0Var.get());
    }

    public static hl30 a(RetrofitMaker retrofitMaker) {
        return (hl30) retrofitMaker.createWebgateService(hl30.class, "android-payment-commerce-safety-impl");
    }

    public static ajp b(h310 h310Var) {
        return new ajp(h310Var);
    }

    public static ezc c(bk4 bk4Var) {
        Observable observableH;
        if (bk4Var.k != null) {
            observableH = ((Observable) bk4Var.m.getValue()).map(uh21.g).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(bk4Var.h);
        }
        return yoi1.g(observableH);
    }

    public static x0w d(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 17);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static vm30 e(jo80 jo80Var, r7q r7qVar, caq caqVar, caq caqVar2, kly0 kly0Var, r7q r7qVar2, gbp gbpVar, r7q r7qVar3, r7q r7qVar4, kly0 kly0Var2, r7q r7qVar5, caq caqVar3, caq caqVar4, g5t g5tVar, r7q r7qVar6, caq caqVar5, caq caqVar6, r7q r7qVar7, kly0 kly0Var3, r7q r7qVar8, r7q r7qVar9, r7q r7qVar10, jo80 jo80Var2, kly0 kly0Var4, g5t g5tVar2, r7q r7qVar11, caq caqVar7, caq caqVar8, r7q r7qVar12, caq caqVar9, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, r7q r7qVar13, kly0 kly0Var8, kly0 kly0Var9, r7q r7qVar14, kly0 kly0Var10, caq caqVar10, kly0 kly0Var11, r7q r7qVar15, kly0 kly0Var12, gbp gbpVar2, caq caqVar11, caq caqVar12, kly0 kly0Var13, gbp gbpVar3, kly0 kly0Var14, r7q r7qVar16, caq caqVar13) {
        vm30 vm30Var = new vm30();
        vm30Var.a = jo80Var;
        vm30Var.b = r7qVar;
        vm30Var.c = caqVar;
        vm30Var.d = caqVar2;
        vm30Var.e = kly0Var;
        vm30Var.f = r7qVar2;
        vm30Var.g = gbpVar;
        vm30Var.h = r7qVar3;
        vm30Var.i = r7qVar4;
        vm30Var.j = kly0Var2;
        vm30Var.k = r7qVar5;
        vm30Var.l = caqVar3;
        vm30Var.m = caqVar4;
        vm30Var.n = g5tVar;
        vm30Var.o = r7qVar6;
        vm30Var.p = caqVar5;
        vm30Var.q = caqVar6;
        vm30Var.r = r7qVar7;
        vm30Var.s = kly0Var3;
        vm30Var.t = r7qVar8;
        vm30Var.u = r7qVar9;
        vm30Var.v = r7qVar10;
        vm30Var.w = jo80Var2;
        vm30Var.x = kly0Var4;
        vm30Var.y = g5tVar2;
        vm30Var.z = r7qVar11;
        vm30Var.A = caqVar7;
        vm30Var.B = caqVar8;
        vm30Var.C = r7qVar12;
        vm30Var.D = caqVar9;
        vm30Var.E = kly0Var5;
        vm30Var.F = kly0Var6;
        vm30Var.G = kly0Var7;
        vm30Var.H = r7qVar13;
        vm30Var.I = kly0Var8;
        vm30Var.J = kly0Var9;
        vm30Var.K = r7qVar14;
        vm30Var.L = kly0Var10;
        vm30Var.M = caqVar10;
        vm30Var.N = kly0Var11;
        vm30Var.O = r7qVar15;
        vm30Var.P = kly0Var12;
        vm30Var.Q = gbpVar2;
        vm30Var.R = caqVar11;
        vm30Var.S = caqVar12;
        vm30Var.T = kly0Var13;
        vm30Var.U = gbpVar3;
        vm30Var.V = kly0Var14;
        vm30Var.W = r7qVar16;
        vm30Var.X = caqVar13;
        return vm30Var;
    }

    public static fn30 f(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4) {
        fn30 fn30Var = new fn30();
        fn30Var.a = r7qVar;
        fn30Var.b = r7qVar2;
        fn30Var.c = r7qVar3;
        fn30Var.d = r7qVar4;
        return fn30Var;
    }

    public static ln30 g(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4) {
        ln30 ln30Var = new ln30();
        ln30Var.a = r7qVar;
        ln30Var.b = r7qVar2;
        ln30Var.c = r7qVar3;
        ln30Var.d = r7qVar4;
        return ln30Var;
    }

    public static js30 h(jly0 jly0Var, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar4, caq caqVar5, kly0 kly0Var4, jly0 jly0Var2, caq caqVar6) {
        js30 js30Var = new js30();
        js30Var.a = jly0Var;
        js30Var.b = caqVar;
        js30Var.c = caqVar2;
        js30Var.d = caqVar3;
        js30Var.e = kly0Var;
        js30Var.f = kly0Var2;
        js30Var.g = kly0Var3;
        js30Var.h = caqVar4;
        js30Var.i = caqVar5;
        js30Var.j = kly0Var4;
        js30Var.k = jly0Var2;
        js30Var.l = caqVar6;
        return js30Var;
    }

    public static yw30 i(kly0 kly0Var, caq caqVar, kly0 kly0Var2, r7q r7qVar, kly0 kly0Var3, thq thqVar, kly0 kly0Var4, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var5, caq caqVar2, kly0 kly0Var6, kly0 kly0Var7, r7q r7qVar4, jly0 jly0Var, caq caqVar3, thq thqVar2, r7q r7qVar5, kly0 kly0Var8, kly0 kly0Var9, thq thqVar3, kly0 kly0Var10, thq thqVar4, g5t g5tVar, caq caqVar4, kly0 kly0Var11, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, kly0 kly0Var12, kly0 kly0Var13, kly0 kly0Var14, kly0 kly0Var15, kly0 kly0Var16, caq caqVar10, r7q r7qVar6, kly0 kly0Var17) {
        yw30 yw30Var = new yw30();
        yw30Var.a = kly0Var;
        yw30Var.b = caqVar;
        yw30Var.c = kly0Var2;
        yw30Var.d = r7qVar;
        yw30Var.e = kly0Var3;
        yw30Var.f = thqVar;
        yw30Var.g = kly0Var4;
        yw30Var.h = r7qVar2;
        yw30Var.i = r7qVar3;
        yw30Var.j = kly0Var5;
        yw30Var.k = caqVar2;
        yw30Var.l = kly0Var6;
        yw30Var.m = kly0Var7;
        yw30Var.n = r7qVar4;
        yw30Var.o = jly0Var;
        yw30Var.p = caqVar3;
        yw30Var.q = thqVar2;
        yw30Var.r = r7qVar5;
        yw30Var.s = kly0Var8;
        yw30Var.t = kly0Var9;
        yw30Var.u = thqVar3;
        yw30Var.v = kly0Var10;
        yw30Var.w = thqVar4;
        yw30Var.x = g5tVar;
        yw30Var.y = caqVar4;
        yw30Var.z = kly0Var11;
        yw30Var.A = caqVar5;
        yw30Var.B = caqVar6;
        yw30Var.C = caqVar7;
        yw30Var.D = caqVar8;
        yw30Var.E = caqVar9;
        yw30Var.F = kly0Var12;
        yw30Var.G = kly0Var13;
        yw30Var.H = kly0Var14;
        yw30Var.I = kly0Var15;
        yw30Var.J = kly0Var16;
        yw30Var.K = caqVar10;
        yw30Var.L = r7qVar6;
        yw30Var.M = kly0Var17;
        return yw30Var;
    }

    public static v540 j(jo80 jo80Var, jly0 jly0Var, kly0 kly0Var, jly0 jly0Var2, kly0 kly0Var2, kly0 kly0Var3, caq caqVar, caq caqVar2, kly0 kly0Var4, jly0 jly0Var3, caq caqVar3) {
        v540 v540Var = new v540();
        v540Var.a = jo80Var;
        v540Var.b = jly0Var;
        v540Var.c = kly0Var;
        v540Var.d = jly0Var2;
        v540Var.e = kly0Var2;
        v540Var.f = kly0Var3;
        v540Var.g = caqVar;
        v540Var.h = caqVar2;
        v540Var.i = kly0Var4;
        v540Var.j = jly0Var3;
        v540Var.k = caqVar3;
        return v540Var;
    }

    public static dc40 k(r7q r7qVar, r7q r7qVar2, caq caqVar, r7q r7qVar3, kly0 kly0Var, caq caqVar2, kly0 kly0Var2) {
        dc40 dc40Var = new dc40();
        dc40Var.a = r7qVar;
        dc40Var.b = r7qVar2;
        dc40Var.c = caqVar;
        dc40Var.d = r7qVar3;
        dc40Var.e = kly0Var;
        dc40Var.f = caqVar2;
        dc40Var.g = kly0Var2;
        return dc40Var;
    }

    public static x0w l(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 18);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static x0w m(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 19);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static x0w n(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 20);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static x0w o(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 21);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static Bundle p(zf30 zf30Var) {
        Bundle bundle = zf30Var.f;
        return bundle == null ? new Bundle() : bundle;
    }

    public static f8b q(ajp ajpVar) {
        h310 h310Var = ajpVar.a;
        return new f8b((g7h) h310Var.b.get(), (o241) h310Var.a.get(), (uu00) h310Var.c.get(), (Scheduler) h310Var.d.get());
    }

    public static rd30 r(Context context, NotificationManager notificationManager, kqi0 kqi0Var, wd30 wd30Var, ow3 ow3Var, Scheduler scheduler, q8n q8nVar) {
        return new rd30(context, notificationManager, kqi0Var, wd30Var, ow3Var, scheduler, q8nVar);
    }

    public static llm s(dg30 dg30Var, q8n q8nVar) {
        return smo1.e(cto1.q(dg30Var).b.y(q8nVar));
    }

    public static s940 t(ov20 ov20Var, h2i1 h2i1Var, luk lukVar, krh krhVar, c9n c9nVar, jly0 jly0Var, t2j0 t2j0Var, Optional optional) {
        return new s940(ov20Var, h2i1Var, lukVar, krhVar, c9nVar, jly0Var, t2j0Var, new xj4(false, false, lukVar), optional);
    }

    public static va40 u(ajp ajpVar) {
        h310 h310Var = ajpVar.a;
        return new va40((oa40) ((RetrofitMaker) h310Var.e.get()).createWebgateService(oa40.class, "android-genalphablocking-datasourceimpl"), new amd((uu00) h310Var.c.get()));
    }

    public static sb40 v(ajp ajpVar) {
        h310 h310Var = ajpVar.a;
        return new sb40((o241) h310Var.a.get(), new ek4(false, false, false, false, false, false, false, false, (tgp0) h310Var.g.get(), (luk) h310Var.h.get()));
    }

    public static djp w(yc00 yc00Var) {
        return new djp(yc00Var);
    }

    public static eq80 x(i8h1 i8h1Var, l6h1 l6h1Var) {
        return new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
    }

    public static bza0 y(djp djpVar) {
        return djpVar.a();
    }

    public static k2b0 z(djp djpVar) {
        return new k2b0((o2b0) ((RetrofitMaker) djpVar.a.a.get()).createWebgateService(o2b0.class, "android-genalpha-datasourceimpl"));
    }
}
