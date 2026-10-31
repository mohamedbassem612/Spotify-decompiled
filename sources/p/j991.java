package p;

import android.app.Application;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class j991 implements jly0 {
    public static hj91 A(tp91 tp91Var, nn61 nn61Var, qp91 qp91Var) {
        return tp91Var.a(new pp91(nn61Var, qp91Var, 3, (ywv0) null, 108));
    }

    public static tp91 B(rqq rqqVar) {
        return new tp91(rqqVar);
    }

    public static mz91 C(RetrofitMaker retrofitMaker) {
        return (mz91) retrofitMaker.createWebgateService(mz91.class, "android-profile-socialgraph-impl");
    }

    public static dp5 D(Application application) {
        return new dp5(application.getResources(), (byte) 6);
    }

    public static ezc a(xvo xvoVar) {
        return yoi1.g(xvoVar.a(true));
    }

    public static ezc b(o241 o241Var) {
        return yoi1.g(((p241) o241Var).a.map(xpv0.g).distinctUntilChanged());
    }

    public static uww0 c(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 15);
    }

    public static k4z0 d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 12);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static g561 e(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 9);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static ba91 f(jo80 jo80Var, kly0 kly0Var, kly0 kly0Var2, jly0 jly0Var, kly0 kly0Var3, jly0 jly0Var2, jly0 jly0Var3) {
        ba91 ba91Var = new ba91();
        ba91Var.a = jo80Var;
        ba91Var.b = kly0Var;
        ba91Var.c = kly0Var2;
        ba91Var.d = jly0Var;
        ba91Var.e = kly0Var3;
        ba91Var.f = jly0Var2;
        ba91Var.g = jly0Var3;
        return ba91Var;
    }

    public static ha91 g(caq caqVar, jly0 jly0Var) {
        ha91 ha91Var = new ha91();
        ha91Var.a = caqVar;
        ha91Var.b = jly0Var;
        return ha91Var;
    }

    public static ka91 h(caq caqVar, jly0 jly0Var, jly0 jly0Var2) {
        ka91 ka91Var = new ka91();
        ka91Var.a = caqVar;
        ka91Var.b = jly0Var;
        ka91Var.c = jly0Var2;
        return ka91Var;
    }

    public static sn91 i(caq caqVar, jly0 jly0Var, jly0 jly0Var2) {
        sn91 sn91Var = new sn91();
        sn91Var.a = jly0Var;
        sn91Var.b = jly0Var2;
        sn91Var.c = caqVar;
        return sn91Var;
    }

    public static yw91 j(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, kly0 kly0Var, caq caqVar, jly0 jly0Var4, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var2, jly0 jly0Var5, caq caqVar7) {
        yw91 yw91Var = new yw91();
        yw91Var.a = jo80Var;
        yw91Var.b = jly0Var;
        yw91Var.c = jly0Var2;
        yw91Var.d = jly0Var3;
        yw91Var.e = kly0Var;
        yw91Var.f = caqVar;
        yw91Var.g = jly0Var4;
        yw91Var.h = caqVar2;
        yw91Var.i = caqVar3;
        yw91Var.j = caqVar4;
        yw91Var.k = caqVar5;
        yw91Var.l = caqVar6;
        yw91Var.m = kly0Var2;
        yw91Var.n = jly0Var5;
        yw91Var.o = caqVar7;
        return yw91Var;
    }

    public static uww0 k(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 16);
    }

    public static g561 l(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 11);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static uww0 m(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 17);
    }

    public static Application.ActivityLifecycleCallbacks n(ar91 ar91Var) {
        g5 g5Var = ar91Var.e;
        c8o.m(g5Var);
        return g5Var;
    }

    public static ujm o(RxRouter rxRouter) {
        return new ujm(new CosmosTransport(new opy0(rxRouter, (byte) 3)));
    }

    public static l4a1 p(d0q d0qVar) {
        return new l4a1(d0qVar);
    }

    public static m4a1 q(d0q d0qVar) {
        return new m4a1(d0qVar);
    }

    public static n4a1 r(d0q d0qVar) {
        return new n4a1(d0qVar);
    }

    public static o4a1 s(d0q d0qVar) {
        return new o4a1(d0qVar);
    }

    public static p4a1 t(d0q d0qVar) {
        return new p4a1(d0qVar);
    }

    public static ObservableRefCount u(ujm ujmVar, boolean z) {
        return k4p1.z(Observable.defer(new aj91(ujmVar, (byte) 1)).subscribeOn(Schedulers.c), Schedulers.b, z).map(r6x0.O0).distinctUntilChanged().replay(1).f();
    }

    public static hq81 v(y0q y0qVar) {
        return new hq81(y0qVar, (byte) 3);
    }

    public static hq81 w(l3q l3qVar) {
        return new hq81(l3qVar, (byte) 4);
    }

    public static n381 x(l8q l8qVar, Scheduler scheduler) {
        return new n381(l8qVar, scheduler, (byte) 13);
    }

    public static se91 y(RetrofitMaker retrofitMaker) {
        return (se91) retrofitMaker.createWebgateService(se91.class, "android-home-slotloading");
    }

    public static co91 z(yn91 yn91Var, ujm ujmVar, Observable observable) {
        return new co91(yn91Var, ujmVar, observable);
    }
}
