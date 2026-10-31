package p;

import android.os.Build;
import android.view.View;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class d1j1 implements jly0 {
    public static k4z0 a(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 26);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static pcj1 b(r7q r7qVar, r7q r7qVar2, kly0 kly0Var) {
        pcj1 pcj1Var = new pcj1();
        pcj1Var.a = kly0Var;
        pcj1Var.b = r7qVar;
        pcj1Var.c = r7qVar2;
        return pcj1Var;
    }

    public static vjj1 c(jly0 jly0Var) {
        vjj1 vjj1Var = new vjj1();
        vjj1Var.a = jly0Var;
        return vjj1Var;
    }

    public static mwj1 d(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, jo80 jo80Var, g5t g5tVar, r7q r7qVar, caq caqVar) {
        mwj1 mwj1Var = new mwj1();
        mwj1Var.a = kly0Var;
        mwj1Var.b = kly0Var2;
        mwj1Var.c = kly0Var3;
        mwj1Var.d = jo80Var;
        mwj1Var.e = g5tVar;
        mwj1Var.f = r7qVar;
        mwj1Var.g = caqVar;
        return mwj1Var;
    }

    public static zzj1 e(caq caqVar, kly0 kly0Var, caq caqVar2, kly0 kly0Var2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, kly0 kly0Var3, jly0 jly0Var, caq caqVar9) {
        zzj1 zzj1Var = new zzj1();
        zzj1Var.a = caqVar;
        zzj1Var.b = kly0Var;
        zzj1Var.c = caqVar2;
        zzj1Var.d = kly0Var2;
        zzj1Var.e = caqVar3;
        zzj1Var.f = caqVar4;
        zzj1Var.g = caqVar5;
        zzj1Var.h = caqVar6;
        zzj1Var.i = caqVar7;
        zzj1Var.j = caqVar8;
        zzj1Var.k = kly0Var3;
        zzj1Var.l = jly0Var;
        zzj1Var.m = caqVar9;
        return zzj1Var;
    }

    public static e1k1 f(kly0 kly0Var, caq caqVar, jo80 jo80Var, kly0 kly0Var2, g5t g5tVar, g5t g5tVar2, kly0 kly0Var3, jly0 jly0Var, kly0 kly0Var4, kly0 kly0Var5, jly0 jly0Var2, gbp gbpVar, kly0 kly0Var6, gbp gbpVar2, jly0 jly0Var3, caq caqVar2, kly0 kly0Var7, jly0 jly0Var4) {
        e1k1 e1k1Var = new e1k1();
        e1k1Var.a = kly0Var;
        e1k1Var.b = caqVar;
        e1k1Var.c = jo80Var;
        e1k1Var.d = kly0Var2;
        e1k1Var.e = g5tVar;
        e1k1Var.f = g5tVar2;
        e1k1Var.g = kly0Var3;
        e1k1Var.h = jly0Var;
        e1k1Var.i = kly0Var4;
        e1k1Var.j = kly0Var5;
        e1k1Var.k = jly0Var2;
        e1k1Var.l = gbpVar;
        e1k1Var.m = kly0Var6;
        e1k1Var.n = gbpVar2;
        e1k1Var.o = jly0Var3;
        e1k1Var.f16p = caqVar2;
        e1k1Var.q = kly0Var7;
        e1k1Var.r = jly0Var4;
        return e1k1Var;
    }

    public static g1k1 g(ynb0 ynb0Var, ynb0 ynb0Var2) {
        g1k1 g1k1Var = new g1k1((byte) 0);
        g1k1Var.b = ynb0Var;
        g1k1Var.c = ynb0Var2;
        return g1k1Var;
    }

    public static k4z0 h(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 27);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static k4z0 i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 28);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static dmg1 j(ynb0 ynb0Var) {
        dmg1 dmg1Var = new dmg1((byte) 17);
        dmg1Var.b = ynb0Var;
        return dmg1Var;
    }

    public static ncj1 k(d1x d1xVar, Flowable flowable, dg30 dg30Var, t8u0 t8u0Var, qaq qaqVar, av0 av0Var, r7q r7qVar, woa woaVar, i44 i44Var, lr0 lr0Var, q8n q8nVar) {
        boolean z = i44Var.g() == h44.c;
        ruz ruzVarA = t8u0Var.a(((f0i) dg30Var).a).a();
        return new ncj1(d1xVar, z, lr0Var, ruzVarA, us71.h(q8nVar), new r0s0(flowable, ruzVarA), r7qVar, av0Var, q8nVar, woaVar, qaqVar);
    }

    public static FlowableObserveOn l(FlowableMap flowableMap, ip91 ip91Var, pta1 pta1Var, Scheduler scheduler) {
        return Flowable.e(flowableMap.X(new dmj1(ip91Var, (byte) 0)), pta1Var.a().map(hcx0.W0).toFlowable(BackpressureStrategy.d), flowableMap.J(icx0.V0), new sua((byte) 29)).L(scheduler);
    }

    public static iyh1 m(a0q a0qVar) {
        return new iyh1(a0qVar, (byte) 7);
    }

    public static iyh1 n(k3q k3qVar) {
        return new iyh1(k3qVar, (byte) 6);
    }

    public static iyh1 o(jbq jbqVar) {
        return new iyh1(jbqVar, (byte) 5);
    }

    public static ggx p(xfx xfxVar, ssf1 ssf1Var, woa woaVar, kma kmaVar, fpa fpaVar, lzn0 lzn0Var, a6z a6zVar, i4q i4qVar, zr00 zr00Var, yh2 yh2Var) {
        return new ggx(new lik1("video-preview-carousel"), xfxVar, ssf1Var, woaVar, kmaVar, fpaVar, a6zVar, i4qVar, zr00Var, yh2Var, xfxVar.b, lzn0Var);
    }

    public static ptf1 q(luq luqVar) {
        jij1 jij1Var = luqVar.a;
        return new ptf1(jij1Var.e, new a42(jij1Var.h, (byte) 9), (byte) 2);
    }

    public static vi11 r(luq luqVar) {
        jij1 jij1Var = luqVar.a;
        return new vi11(jij1Var.c, jij1Var.b, jij1Var.a, new ltf1(jij1Var.d, (byte) 12), new a42(jij1Var.h, (byte) 9), (byte) 22);
    }

    public static fkk1 s(dg30 dg30Var, eua0 eua0Var, ced1 ced1Var, cmo cmoVar, y45 y45Var) {
        if (Build.VERSION.SDK_INT < 30) {
            return new mr30(dg30Var, y45Var.a());
        }
        View decorView = dg30Var.getWindow().getDecorView();
        y45Var.a();
        return new jkk1(decorView, cmoVar, dg30Var, eua0Var, ced1Var);
    }

    public static wlk1 t(vuq vuqVar) {
        uy2 uy2Var = vuqVar.a;
        return new wlk1((g0l) uy2Var.a.get(), (Flowable) uy2Var.b.get(), (b7n) uy2Var.c.get(), new be(new CosmosTransport(new opy0((RxRouter) uy2Var.d.get(), (byte) 5))));
    }

    public static ouq u(hce1 hce1Var) {
        return new ouq(hce1Var);
    }
}
