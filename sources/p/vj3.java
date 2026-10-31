package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class vj3 implements jly0 {
    public static thu0 A(izo izoVar) {
        return new thu0((xrc0) ((kly0) izoVar.a.X).get());
    }

    public static g21 B(ozp ozpVar) {
        return new g21(ozpVar, (byte) 25);
    }

    public static RxRouter C(ozo ozoVar) {
        RxRouter rxRouter = (RxRouter) ozoVar.q.get();
        c8o.m(rxRouter);
        return rxRouter;
    }

    public static j6g1 D(izo izoVar) {
        return izoVar.a();
    }

    public static ozo a(zl5 zl5Var) {
        return new ozo(zl5Var);
    }

    public static v2 b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 12);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static pt0 c(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 12);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static qs3 d(jly0 jly0Var, jly0 jly0Var2, jo80 jo80Var, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar, caq caqVar2, jo80 jo80Var2, caq caqVar3, kly0 kly0Var4, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, kly0 kly0Var5, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, kly0 kly0Var6, caq caqVar8, jly0 jly0Var6, kly0 kly0Var7, kly0 kly0Var8) {
        qs3 qs3Var = new qs3();
        qs3Var.a = jly0Var;
        qs3Var.b = jly0Var2;
        qs3Var.c = jo80Var;
        qs3Var.d = kly0Var;
        qs3Var.e = kly0Var2;
        qs3Var.f = kly0Var3;
        qs3Var.g = caqVar;
        qs3Var.h = caqVar2;
        qs3Var.i = jo80Var2;
        qs3Var.j = caqVar3;
        qs3Var.k = kly0Var4;
        qs3Var.l = jly0Var3;
        qs3Var.m = jly0Var4;
        qs3Var.n = jly0Var5;
        qs3Var.o = kly0Var5;
        qs3Var.f55p = caqVar4;
        qs3Var.q = caqVar5;
        qs3Var.r = caqVar6;
        qs3Var.s = caqVar7;
        qs3Var.t = kly0Var6;
        qs3Var.u = caqVar8;
        qs3Var.v = jly0Var6;
        qs3Var.w = kly0Var7;
        qs3Var.x = kly0Var8;
        return qs3Var;
    }

    public static kw3 e(r7q r7qVar, r7q r7qVar2, gbp gbpVar, kly0 kly0Var, r7q r7qVar3, caq caqVar, caq caqVar2, r7q r7qVar4, caq caqVar3) {
        kw3 kw3Var = new kw3();
        kw3Var.a = r7qVar;
        kw3Var.b = r7qVar2;
        kw3Var.c = gbpVar;
        kw3Var.d = kly0Var;
        kw3Var.e = r7qVar3;
        kw3Var.f = caqVar;
        kw3Var.g = caqVar2;
        kw3Var.h = r7qVar4;
        kw3Var.i = caqVar3;
        return kw3Var;
    }

    public static izo f(wj3 wj3Var) {
        return new izo(wj3Var);
    }

    public static nx3 g(RetrofitMaker retrofitMaker) {
        return (nx3) retrofitMaker.createWebgateService(nx3.class, "android-liveroom-listening-party-allowedfeatures");
    }

    public static zn41 h(ozo ozoVar) {
        zn41 zn41Var = (zn41) ozoVar.c.get();
        c8o.m(zn41Var);
        return zn41Var;
    }

    public static kma i(ozo ozoVar) {
        kma kmaVar = (kma) ozoVar.f.get();
        c8o.m(kmaVar);
        return kmaVar;
    }

    public static CallbackRouter j(ozo ozoVar) {
        CallbackRouter callbackRouter = (CallbackRouter) ozoVar.t.get();
        c8o.m(callbackRouter);
        return callbackRouter;
    }

    public static zn41 k(ozo ozoVar) {
        zn41 zn41Var = (zn41) ozoVar.d.get();
        c8o.m(zn41Var);
        return zn41Var;
    }

    public static ApplicationScopeConfiguration l(ozo ozoVar) {
        ApplicationScopeConfiguration applicationScopeConfiguration = (ApplicationScopeConfiguration) ozoVar.e.get();
        c8o.m(applicationScopeConfiguration);
        return applicationScopeConfiguration;
    }

    public static EnumSet m() {
        EnumSet enumSetOf = EnumSet.of(ose0.f);
        c8o.m(enumSetOf);
        return enumSetOf;
    }

    public static vlo n(izo izoVar) {
        return new vlo(new el3(xqu.a(izoVar.b), xqu.a(izoVar.c)));
    }

    public static j6y o(ozo ozoVar) {
        return new j6y(ozoVar.a.p(), (byte) 0);
    }

    public static m6y p(ozo ozoVar) {
        zl5 zl5Var = ozoVar.a;
        return new m6y((byte) 0, zl5Var.p(), (je4) ((kly0) zl5Var.u).get());
    }

    public static j6y q(ozo ozoVar) {
        return new j6y(ozoVar.a.p(), (byte) 1);
    }

    public static j6y r(ozo ozoVar) {
        return new j6y(ozoVar.a.p(), (byte) 2);
    }

    public static m6y s(ozo ozoVar) {
        zl5 zl5Var = ozoVar.a;
        return new m6y((byte) 1, zl5Var.p(), (ke4) ((kly0) zl5Var.t).get());
    }

    public static jd00 t(ozo ozoVar) {
        zl5 zl5Var = ozoVar.a;
        return new jd00(zl5Var.p(), (m26) ((kly0) zl5Var.r).get());
    }

    public static j6y u(ozo ozoVar) {
        return new j6y(ozoVar.a.p(), (byte) 3);
    }

    public static xs80 v(ozo ozoVar) {
        xs80 xs80Var = (xs80) ozoVar.g.get();
        c8o.m(xs80Var);
        return xs80Var;
    }

    public static EnumSet w() {
        EnumSet enumSetOf = EnumSet.of(ose0.d, ose0.e, ose0.f);
        c8o.m(enumSetOf);
        return enumSetOf;
    }

    public static y2g0 x(ozo ozoVar) {
        return new y2g0((tif1) ((kly0) ozoVar.a.b).get());
    }

    public static m6y y(ozo ozoVar) {
        zl5 zl5Var = ozoVar.a;
        return new m6y((byte) 2, zl5Var.p(), (zg4) ((kly0) zl5Var.s).get());
    }

    public static m6y z(ozo ozoVar) {
        zl5 zl5Var = ozoVar.a;
        return new m6y((byte) 3, zl5Var.p(), (yqg) ((kly0) zl5Var.g).get());
    }
}
