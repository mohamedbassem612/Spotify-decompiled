package p;

import com.google.protobuf.Empty;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class f2u0 implements jly0 {
    public static Flowable A(Flowable flowable, Scheduler scheduler, yqg yqgVar, vu4 vu4Var) {
        long j;
        if (hzd1.a) {
            j = 10000;
        } else {
            j = !vu4Var.c() ? 32L : 200L;
        }
        return l4p1.w(flowable.j(new xeu0(j, scheduler, yqgVar)).J(va20.Z0), vu4Var.c());
    }

    public static Flowable B(FlowableMap flowableMap, Flowable flowable, Flowable flowable2, vu4 vu4Var) {
        return l4p1.w(flowableMap.X(new yeu0((Object) flowable, (Object) flowable2, (byte) 0)), vu4Var.c());
    }

    public static Flowable C(FlowableMap flowableMap, Flowable flowable, Flowable flowable2, vu4 vu4Var) {
        return l4p1.w(flowableMap.X(new sjq0(flowable, flowable2, (byte) 26)), vu4Var.c());
    }

    public static FlowableMap D(Flowable flowable) {
        return flowable.j(mo9.Z).J(rh20.a1);
    }

    public static egn0 a(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 20);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static a7u0 b(caq caqVar, caq caqVar2, caq caqVar3, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, kly0 kly0Var) {
        a7u0 a7u0Var = new a7u0();
        a7u0Var.a = jly0Var;
        a7u0Var.b = jly0Var2;
        a7u0Var.c = caqVar;
        a7u0Var.d = caqVar2;
        a7u0Var.e = jly0Var3;
        a7u0Var.f = kly0Var;
        a7u0Var.g = caqVar3;
        a7u0Var.h = jly0Var4;
        return a7u0Var;
    }

    public static dyp c(uau0 uau0Var) {
        return new dyp(uau0Var);
    }

    public static FlowableDistinctUntilChanged d(Flowable flowable) {
        return flowable.J(ok10.Y0).t(Functions.a);
    }

    public static ujm e(dyp dypVar) {
        return (ujm) dypVar.b.get();
    }

    public static FlowableMap f(Flowable flowable) {
        return flowable.j(mo9.Y).J(sl10.c1);
    }

    public static Flowable g(FlowableMap flowableMap, gw70 gw70Var, ufg1 ufg1Var, Scheduler scheduler) {
        return flowableMap.j(new ac10(gw70Var, ufg1Var, scheduler, (byte) 0));
    }

    public static e2u0 h(pjm0 pjm0Var, c3s c3sVar) {
        hhp0 hhp0Var = hhp0.a;
        return new e2u0(pjm0Var, c3sVar);
    }

    public static ezc i(byp0 byp0Var) {
        return yoi1.g(byp0Var.a.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeError", Empty.n()).map(aj20.T0).map(een.o1).map(ak20.X0));
    }

    public static FlowableDistinctUntilChanged j(Flowable flowable) {
        return flowable.J(as10.Z0).t(Functions.a);
    }

    public static a3u0 k(vb2 vb2Var, yh2 yh2Var, zr00 zr00Var, y390 y390Var, qns0 qns0Var) {
        return new a3u0(vb2Var, yh2Var, zr00Var, y390Var, qns0Var);
    }

    public static v3u0 l(RxRouter rxRouter) {
        return new v3u0(new CosmosTransport(new sn0(rxRouter, (byte) 29)));
    }

    public static CompletableObserveOn m(Flowable flowable, Scheduler scheduler) {
        return new FlowableIgnoreElementsCompletable(new FlowableTake(flowable.J(o810.Y0).t(Functions.a).q(1L, TimeUnit.SECONDS).x(yb10.Z0))).n(scheduler);
    }

    public static muz n(ynb0 ynb0Var, cve0 cve0Var, List list) {
        return new muz((ujm) ynb0Var.get(), cve0Var, list);
    }

    public static t8u0 o(dyp dypVar) {
        uau0 uau0Var = dypVar.a;
        RxRouterProvider rxRouterProvider = (RxRouterProvider) uau0Var.b.get();
        yqg yqgVar = (yqg) uau0Var.c.get();
        return new t8u0(new r0s0((Object) rxRouterProvider, (Object) yqgVar, uau0Var.e.get(), (byte) 21));
    }

    public static ruz p(cyp cypVar) {
        return cypVar.a();
    }

    public static ruz q(ynb0 ynb0Var, cve0 cve0Var) {
        return new ruz((ujm) ynb0Var.get(), cve0Var);
    }

    public static suz r(ynb0 ynb0Var, cve0 cve0Var) {
        return new suz((ujm) ynb0Var.get(), cve0Var);
    }

    public static tuz s(dyp dypVar) {
        return t(xqu.a(dypVar.b), new cve0((yqg) dypVar.a.c.get()));
    }

    public static tuz t(ynb0 ynb0Var, cve0 cve0Var) {
        return new tuz((ujm) ynb0Var.get(), cve0Var);
    }

    public static uuz u(ujm ujmVar, cve0 cve0Var) {
        return new uuz(ujmVar, cve0Var);
    }

    public static kge v(dyp dypVar) {
        Flowable flowable = (Flowable) dypVar.d.get();
        vbm[] vbmVarArr = q601.a;
        return new kge(flowable);
    }

    public static Flowable w(dyp dypVar) {
        Flowable flowable = (Flowable) dypVar.d.get();
        c8o.m(flowable);
        return flowable;
    }

    public static zeu0 x(dyp dypVar) {
        zeu0 zeu0Var = (zeu0) dypVar.c.get();
        c8o.m(zeu0Var);
        return zeu0Var;
    }

    public static Flowable y(Flowable flowable, vu4 vu4Var) {
        return l4p1.w(flowable.j(weu0.a).J(ws10.b1), vu4Var.c());
    }

    public static Flowable z(Flowable flowable, Scheduler scheduler, yqg yqgVar, vu4 vu4Var) {
        long j;
        if (hzd1.a) {
            j = 10000;
        } else {
            j = !vu4Var.c() ? 32L : 1000L;
        }
        return l4p1.w(flowable.j(new xeu0(j, scheduler, yqgVar)).J(sa20.a1), vu4Var.c());
    }
}
