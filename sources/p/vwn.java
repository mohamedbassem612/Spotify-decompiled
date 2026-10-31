package p;

import android.content.Context;
import android.os.Build;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class vwn implements jly0 {
    public static xmo A(mr20 mr20Var, q8n q8nVar) {
        return new xmo(mr20Var, q8nVar);
    }

    public static t0b B() {
        return new t0b((byte) 2);
    }

    public static ap31 C(kly0 kly0Var, kly0 kly0Var2, f4n0 f4n0Var) {
        if (f4n0Var.a()) {
            Object obj = kly0Var2.get();
            obj.getClass();
            return (ap31) obj;
        }
        Object obj2 = kly0Var.get();
        obj2.getClass();
        return (ap31) obj2;
    }

    public static zia D(pap papVar) {
        return ((t1r) papVar.k.get()).c();
    }

    public static cmo a(av7 av7Var) {
        return Build.VERSION.SDK_INT >= 30 ? new gmo((mmo) av7Var.c, av7Var.a, av7Var.b, (dg30) av7Var.d, (iac0) av7Var.e, (akr) av7Var.f, (yun0) av7Var.g) : new hmo();
    }

    public static pap b(l1r l1rVar) {
        return new pap(l1rVar);
    }

    public static String c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("CULTURALMOMENTS_STORIES", "culturalmoments/stories", 464, "culturalmoments").c;
    }

    public static odc d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 22);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static tdl e(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 14);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static x2o f(r7q r7qVar, r7q r7qVar2, kly0 kly0Var, g5t g5tVar, g5t g5tVar2, kly0 kly0Var2, caq caqVar, caq caqVar2, r7q r7qVar3, kly0 kly0Var3, caq caqVar3, r7q r7qVar4) {
        x2o x2oVar = new x2o();
        x2oVar.a = r7qVar;
        x2oVar.b = r7qVar2;
        x2oVar.c = kly0Var;
        x2oVar.d = g5tVar;
        x2oVar.e = g5tVar2;
        x2oVar.f = kly0Var2;
        x2oVar.g = caqVar;
        x2oVar.h = caqVar2;
        x2oVar.i = r7qVar3;
        x2oVar.j = kly0Var3;
        x2oVar.k = caqVar3;
        x2oVar.l = r7qVar4;
        return x2oVar;
    }

    public static b7o g(jly0 jly0Var, caq caqVar, caq caqVar2, jly0 jly0Var2, kly0 kly0Var, caq caqVar3, jly0 jly0Var3, jly0 jly0Var4, caq caqVar4) {
        b7o b7oVar = new b7o();
        b7oVar.a = jly0Var;
        b7oVar.b = caqVar;
        b7oVar.c = caqVar2;
        b7oVar.d = jly0Var2;
        b7oVar.e = kly0Var;
        b7oVar.f = caqVar3;
        b7oVar.g = jly0Var3;
        b7oVar.h = jly0Var4;
        b7oVar.i = caqVar4;
        return b7oVar;
    }

    public static vfo h(caq caqVar, kly0 kly0Var, r7q r7qVar, caq caqVar2, kly0 kly0Var2, caq caqVar3, jo80 jo80Var, kly0 kly0Var3, g5t g5tVar, jo80 jo80Var2, kly0 kly0Var4, r7q r7qVar2, caq caqVar4, kly0 kly0Var5, caq caqVar5, r7q r7qVar3, caq caqVar6, gbp gbpVar, kly0 kly0Var6, caq caqVar7, caq caqVar8, kly0 kly0Var7, kly0 kly0Var8, r7q r7qVar4, g5t g5tVar2, caq caqVar9, caq caqVar10, caq caqVar11, r7q r7qVar5, r7q r7qVar6, kly0 kly0Var9, r7q r7qVar7, caq caqVar12, caq caqVar13, r7q r7qVar8, caq caqVar14, r7q r7qVar9, caq caqVar15, caq caqVar16, r7q r7qVar10, r7q r7qVar11, r7q r7qVar12, caq caqVar17, caq caqVar18, gbp gbpVar2, kly0 kly0Var10, caq caqVar19, gbp gbpVar3, kly0 kly0Var11) {
        vfo vfoVar = new vfo();
        vfoVar.a = caqVar;
        vfoVar.b = kly0Var;
        vfoVar.c = r7qVar;
        vfoVar.d = caqVar2;
        vfoVar.e = kly0Var2;
        vfoVar.f = caqVar3;
        vfoVar.g = jo80Var;
        vfoVar.h = kly0Var3;
        vfoVar.i = g5tVar;
        vfoVar.j = jo80Var2;
        vfoVar.k = kly0Var4;
        vfoVar.l = r7qVar2;
        vfoVar.m = caqVar4;
        vfoVar.n = kly0Var5;
        vfoVar.o = caqVar5;
        vfoVar.f71p = r7qVar3;
        vfoVar.q = caqVar6;
        vfoVar.r = gbpVar;
        vfoVar.s = kly0Var6;
        vfoVar.t = caqVar7;
        vfoVar.u = caqVar8;
        vfoVar.v = kly0Var7;
        vfoVar.w = kly0Var8;
        vfoVar.x = r7qVar4;
        vfoVar.y = g5tVar2;
        vfoVar.z = caqVar9;
        vfoVar.A = caqVar10;
        vfoVar.B = caqVar11;
        vfoVar.C = r7qVar5;
        vfoVar.D = r7qVar6;
        vfoVar.E = kly0Var9;
        vfoVar.F = r7qVar7;
        vfoVar.G = caqVar12;
        vfoVar.H = caqVar13;
        vfoVar.I = r7qVar8;
        vfoVar.J = caqVar14;
        vfoVar.K = r7qVar9;
        vfoVar.L = caqVar15;
        vfoVar.M = caqVar16;
        vfoVar.N = r7qVar10;
        vfoVar.O = r7qVar11;
        vfoVar.P = r7qVar12;
        vfoVar.Q = caqVar17;
        vfoVar.R = caqVar18;
        vfoVar.S = gbpVar2;
        vfoVar.T = kly0Var10;
        vfoVar.U = caqVar19;
        vfoVar.V = gbpVar3;
        vfoVar.W = kly0Var11;
        return vfoVar;
    }

    public static mqo i(kly0 kly0Var, jly0 jly0Var, kly0 kly0Var2, caq caqVar, jly0 jly0Var2, jly0 jly0Var3, g5t g5tVar, jly0 jly0Var4, caq caqVar2, jly0 jly0Var5) {
        mqo mqoVar = new mqo();
        mqoVar.a = kly0Var;
        mqoVar.b = jly0Var;
        mqoVar.c = kly0Var2;
        mqoVar.d = caqVar;
        mqoVar.e = jly0Var2;
        mqoVar.f = jly0Var3;
        mqoVar.g = g5tVar;
        mqoVar.h = jly0Var4;
        mqoVar.i = caqVar2;
        mqoVar.j = jly0Var5;
        return mqoVar;
    }

    public static fvo j(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, jly0 jly0Var, r7q r7qVar5, g5t g5tVar, kly0 kly0Var, r7q r7qVar6, caq caqVar, r7q r7qVar7, r7q r7qVar8, kly0 kly0Var2, r7q r7qVar9, r7q r7qVar10, kly0 kly0Var3) {
        fvo fvoVar = new fvo();
        fvoVar.a = r7qVar;
        fvoVar.b = r7qVar2;
        fvoVar.c = r7qVar3;
        fvoVar.d = r7qVar4;
        fvoVar.e = jly0Var;
        fvoVar.f = r7qVar5;
        fvoVar.g = g5tVar;
        fvoVar.h = kly0Var;
        fvoVar.i = r7qVar6;
        fvoVar.j = caqVar;
        fvoVar.k = r7qVar7;
        fvoVar.l = r7qVar8;
        fvoVar.m = kly0Var2;
        fvoVar.n = r7qVar9;
        fvoVar.o = r7qVar10;
        fvoVar.f16p = kly0Var3;
        return fvoVar;
    }

    public static a5m k() {
        return new a5m();
    }

    public static ezc l(g84 g84Var) {
        Observable observableH;
        if (g84Var.c != null) {
            observableH = ((Observable) g84Var.e.getValue()).map(stf0.t).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(g84Var.a);
        }
        return yoi1.g(observableH);
    }

    public static tko m(nko nkoVar, oj3 oj3Var) {
        return new tko(nkoVar, oj3Var);
    }

    public static wvo n(RetrofitMaker retrofitMaker) {
        return (wvo) retrofitMaker.createWebgateService(wvo.class, "android-dsa-setting-monitor-impl");
    }

    public static g2o o(asn asnVar) {
        return new g2o(new x2p(asnVar));
    }

    public static mr20 p(pap papVar) {
        mr20 mr20Var = (mr20) papVar.i.get();
        c8o.m(mr20Var);
        return mr20Var;
    }

    public static Observable q(pap papVar) {
        Observable observable = (Observable) papVar.j.get();
        c8o.m(observable);
        return observable;
    }

    public static t1r r(pap papVar) {
        t1r t1rVar = (t1r) papVar.k.get();
        c8o.m(t1rVar);
        return t1rVar;
    }

    public static htr s(Context context, ftr ftrVar) {
        return new htr(context, ftrVar);
    }

    public static h2o t(asn asnVar) {
        return new h2o(new x2p(asnVar));
    }

    public static o3o u(rsm rsmVar) {
        return new o3o(new b6p(rsmVar));
    }

    public static lc20 v(abm abmVar, Optional optional) {
        return new lc20(abmVar, (kmj1) optional.orElse(null));
    }

    public static t1r w(pap papVar) {
        t1r t1rVar = (t1r) papVar.c.get();
        c8o.m(t1rVar);
        return t1rVar;
    }

    public static njj0 x(wf4 wf4Var, uu00 uu00Var, Scheduler scheduler, Scheduler scheduler2) {
        return wf4Var.c() ? new cvm0(uu00Var, "cwp", scheduler, scheduler2) : new lim0("cwp", uu00Var);
    }

    public static w6e0 y(njj0 njj0Var) {
        return new w6e0(njj0Var);
    }

    public static int z(ag4 ag4Var) {
        int iOrdinal = ag4Var.b().ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        eg.o();
        return 0;
    }
}
