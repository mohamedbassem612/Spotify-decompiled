package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class y79 implements jly0 {
    public static gq9 A(RetrofitMaker retrofitMaker) {
        return (gq9) retrofitMaker.createWebgateService(gq9.class, "android-byom-entrypoint");
    }

    public static p900 B(Scheduler scheduler) {
        return new p900(scheduler);
    }

    public static ilb1 C(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, fr9.Z);
        objZ.getClass();
        return (ilb1) objZ;
    }

    public static w2k1 D() {
        return new w2k1();
    }

    public static v2 a(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 24);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static h89 b(g510 g510Var) {
        return new h89(g510Var);
    }

    public static ml9 c(r7q r7qVar, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, g5t g5tVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3) {
        ml9 ml9Var = new ml9();
        ml9Var.a = g5tVar;
        ml9Var.b = kly0Var;
        ml9Var.c = kly0Var2;
        ml9Var.d = caqVar;
        ml9Var.e = caqVar2;
        ml9Var.f = caqVar3;
        ml9Var.g = kly0Var3;
        ml9Var.h = caqVar4;
        ml9Var.i = r7qVar;
        return ml9Var;
    }

    public static jo9 d(jo80 jo80Var, kly0 kly0Var, g5t g5tVar, caq caqVar, kly0 kly0Var2, caq caqVar2, caq caqVar3, r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar4, caq caqVar5, r7q r7qVar4, caq caqVar6, caq caqVar7, kly0 kly0Var3, r7q r7qVar5, kly0 kly0Var4, kly0 kly0Var5, r7q r7qVar6, r7q r7qVar7, g5t g5tVar2, kly0 kly0Var6, caq caqVar8, caq caqVar9) {
        jo9 jo9Var = new jo9();
        jo9Var.a = jo80Var;
        jo9Var.b = kly0Var;
        jo9Var.c = g5tVar;
        jo9Var.d = caqVar;
        jo9Var.e = kly0Var2;
        jo9Var.f = caqVar2;
        jo9Var.g = caqVar3;
        jo9Var.h = r7qVar;
        jo9Var.i = r7qVar2;
        jo9Var.j = r7qVar3;
        jo9Var.k = caqVar4;
        jo9Var.l = caqVar5;
        jo9Var.m = r7qVar4;
        jo9Var.n = caqVar6;
        jo9Var.o = caqVar7;
        jo9Var.p = kly0Var3;
        jo9Var.q = r7qVar5;
        jo9Var.r = kly0Var4;
        jo9Var.s = kly0Var5;
        jo9Var.t = r7qVar6;
        jo9Var.u = r7qVar7;
        jo9Var.v = g5tVar2;
        jo9Var.w = kly0Var6;
        jo9Var.x = caqVar8;
        jo9Var.y = caqVar9;
        return jo9Var;
    }

    public static ft9 e(g5t g5tVar, kly0 kly0Var, kly0 kly0Var2, r7q r7qVar, caq caqVar, g5t g5tVar2, kly0 kly0Var3, caq caqVar2, g5t g5tVar3) {
        ft9 ft9Var = new ft9();
        ft9Var.a = g5tVar;
        ft9Var.b = kly0Var;
        ft9Var.c = kly0Var2;
        ft9Var.d = r7qVar;
        ft9Var.e = caqVar;
        ft9Var.f = g5tVar2;
        ft9Var.g = kly0Var3;
        ft9Var.h = caqVar2;
        ft9Var.i = g5tVar3;
        return ft9Var;
    }

    public static l0a f(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, jo80 jo80Var, jly0 jly0Var4) {
        l0a l0aVar = new l0a();
        l0aVar.a = jly0Var;
        l0aVar.b = jly0Var2;
        l0aVar.c = jly0Var3;
        l0aVar.d = caqVar;
        l0aVar.e = jo80Var;
        l0aVar.f = jly0Var4;
        return l0aVar;
    }

    public static v2 g(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 25);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static v2 h(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 26);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static p900 i(Scheduler scheduler) {
        return new p900(scheduler);
    }

    public static ezc j(ox4 ox4Var) {
        Observable observableH;
        if (ox4Var.b != null) {
            observableH = ((Observable) ox4Var.d.getValue()).map(ns80.t).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(ox4Var.a);
        }
        return yoi1.g(observableH);
    }

    public static t680 k() {
        return new t680();
    }

    public static tf9 l(vf9 vf9Var) {
        return vf9Var.a;
    }

    public static uf9 m(vf9 vf9Var) {
        return vf9Var.b;
    }

    public static vf9 n(ynb0 ynb0Var, ynb0 ynb0Var2, tgb tgbVar) {
        if (tgbVar.isEnabled()) {
            ndz0 ndz0Var = (ndz0) ynb0Var2.get();
            return new vf9(ndz0Var, ndz0Var, ndz0Var, ndz0Var);
        }
        vg9 vg9Var = (vg9) ynb0Var.get();
        return new vf9(vg9Var, vg9Var, vg9Var, vg9Var);
    }

    public static wg9 o(gjb gjbVar, tf9 tf9Var, xir xirVar, tgb tgbVar) {
        return new wg9(gjbVar, tf9Var, xirVar, tgbVar);
    }

    public static xg9 p(vf9 vf9Var) {
        return vf9Var.c;
    }

    public static kh9 q(vf9 vf9Var) {
        return vf9Var.d;
    }

    public static lh9 r(yu3 yu3Var, vf9 vf9Var) {
        boolean z = vf9Var.a instanceof ndz0;
        q8n q8nVar = (q8n) yu3Var.e;
        p8n p8nVar = q8n.b;
        q8n q8nVarM = q8nVar.M(1);
        kh9 kh9Var = (kh9) yu3Var.b;
        ni9 ni9Var = (ni9) yu3Var.c;
        return z ? new ydz0(kh9Var, ni9Var, q8nVarM, (pg5) yu3Var.d) : new wh9(kh9Var, ni9Var, q8nVarM);
    }

    public static py9 s() {
        return new py9((byte) 0);
    }

    public static sam0 t(xm41 xm41Var, xm41 xm41Var2, oo70 oo70Var, caq caqVar, dn41 dn41Var, tif1 tif1Var) {
        ym41 ym41Var = new ym41("Background");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(new x010(eqr0.m(xm41Var), eqr0.m(xm41Var2), new uvc(3, (lnm) null, (byte) 5), (byte) 1), new ms4((lnm) null, new hbz0(new tc11(new n891(oo70Var, tif1Var, caqVar, (byte) 26), ym41Var, (byte) 26), (byte) 21), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("Background", jgeVarE, f46.S0(new xm41[]{xm41Var, xm41Var2}), ym41Var.b, ym41Var.a);
    }

    public static ik u(mr20 mr20Var) {
        return new ik(new ir9(z4p1.v(rqt0.u(new hs6(mr20Var, (byte) 10)), 1), (byte) 1), (byte) 18);
    }

    public static tm9 v(RetrofitMaker retrofitMaker) {
        return (tm9) retrofitMaker.createWebgateService(tm9.class, "android-byom-volume");
    }

    public static av40 w(xm41 xm41Var) {
        Object objZ = eth.z(xm41Var, fr9.Y);
        objZ.getClass();
        return (av40) objZ;
    }

    public static ReplaySubject x() {
        return ReplaySubject.g(2000);
    }

    public static ReplaySubject y() {
        return ReplaySubject.g(2000);
    }

    public static osm0 z(msm0 msm0Var) {
        return msm0Var.a(new fz3((byte) 1));
    }
}
