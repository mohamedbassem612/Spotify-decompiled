package p;

import android.app.Application;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.ExecutorServiceWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class w5n implements jly0 {
    public static dj7 A(bjn bjnVar, xh7 xh7Var, q8n q8nVar) {
        return new dj7(bjnVar, xh7Var, q8nVar);
    }

    public static so B(nfa0 nfa0Var, Scheduler scheduler) {
        return new so(scheduler, nfa0Var, (byte) 7);
    }

    public static kkl1 C(Cosmonaut cosmonaut) {
        kkl1 kkl1Var = (kkl1) cosmonaut.createCosmosService(kkl1.class);
        c8o.m(kkl1Var);
        return kkl1Var;
    }

    public static tdl a(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 9);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static hbn b(caq caqVar, caq caqVar2, kly0 kly0Var, caq caqVar3, jly0 jly0Var, caq caqVar4) {
        hbn hbnVar = new hbn();
        hbnVar.a = caqVar;
        hbnVar.b = caqVar2;
        hbnVar.c = kly0Var;
        hbnVar.d = caqVar3;
        hbnVar.e = jly0Var;
        hbnVar.f = caqVar4;
        return hbnVar;
    }

    public static ddn c(jo80 jo80Var, caq caqVar, kly0 kly0Var, jly0 jly0Var, caq caqVar2, jly0 jly0Var2, caq caqVar3, caq caqVar4, kly0 kly0Var2, jly0 jly0Var3, caq caqVar5) {
        ddn ddnVar = new ddn();
        ddnVar.a = jo80Var;
        ddnVar.b = caqVar;
        ddnVar.c = kly0Var;
        ddnVar.d = jly0Var;
        ddnVar.e = caqVar2;
        ddnVar.f = jly0Var2;
        ddnVar.g = caqVar3;
        ddnVar.h = caqVar4;
        ddnVar.i = kly0Var2;
        ddnVar.j = jly0Var3;
        ddnVar.k = caqVar5;
        return ddnVar;
    }

    public static hmn d(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, kly0 kly0Var) {
        hmn hmnVar = new hmn((byte) 0);
        hmnVar.b = kly0Var;
        hmnVar.c = r7qVar;
        hmnVar.d = r7qVar2;
        hmnVar.e = caqVar;
        hmnVar.f = r7qVar3;
        return hmnVar;
    }

    public static lnn e(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4) {
        lnn lnnVar = new lnn();
        lnnVar.a = r7qVar;
        lnnVar.b = r7qVar2;
        lnnVar.c = r7qVar3;
        lnnVar.d = r7qVar4;
        return lnnVar;
    }

    public static nnn f(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        nnn nnnVar = new nnn();
        nnnVar.a = ynb0Var;
        nnnVar.b = ynb0Var2;
        nnnVar.c = ynb0Var3;
        return nnnVar;
    }

    public static xon g(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, kly0 kly0Var, jly0 jly0Var5, kly0 kly0Var2, g5t g5tVar, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var3, jly0 jly0Var6, jly0 jly0Var7, kly0 kly0Var4, caq caqVar4, caq caqVar5, kly0 kly0Var5, jly0 jly0Var8, caq caqVar6) {
        xon xonVar = new xon();
        xonVar.a = jo80Var;
        xonVar.b = jly0Var;
        xonVar.c = jly0Var2;
        xonVar.d = jly0Var3;
        xonVar.e = jly0Var4;
        xonVar.f = kly0Var;
        xonVar.g = jly0Var5;
        xonVar.h = kly0Var2;
        xonVar.i = g5tVar;
        xonVar.j = caqVar;
        xonVar.k = caqVar2;
        xonVar.l = caqVar3;
        xonVar.m = kly0Var3;
        xonVar.n = jly0Var6;
        xonVar.o = jly0Var7;
        xonVar.f87p = kly0Var4;
        xonVar.q = caqVar4;
        xonVar.r = caqVar5;
        xonVar.s = kly0Var5;
        xonVar.t = jly0Var8;
        xonVar.u = caqVar6;
        return xonVar;
    }

    public static lpn h(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5) {
        lpn lpnVar = new lpn();
        lpnVar.a = r7qVar;
        lpnVar.b = r7qVar2;
        lpnVar.c = r7qVar3;
        lpnVar.d = r7qVar4;
        lpnVar.e = r7qVar5;
        return lpnVar;
    }

    public static npn i(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        npn npnVar = new npn();
        npnVar.b = ynb0Var;
        npnVar.c = ynb0Var2;
        npnVar.d = ynb0Var3;
        return npnVar;
    }

    public static tdl j(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 10);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static hmn k(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, kly0 kly0Var) {
        hmn hmnVar = new hmn((byte) 1);
        hmnVar.b = kly0Var;
        hmnVar.c = r7qVar;
        hmnVar.d = r7qVar2;
        hmnVar.e = caqVar;
        hmnVar.f = r7qVar3;
        return hmnVar;
    }

    public static tdl l(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 11);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static ExecutorServiceWorkRunner m() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(WorkRunners.a);
        Preconditions.b(executorServiceNewCachedThreadPool);
        return new ExecutorServiceWorkRunner(executorServiceNewCachedThreadPool);
    }

    public static zym0 n(Application application, jqt jqtVar) {
        return new zym0(application, application.getPackageName(), jqtVar.a());
    }

    public static imn o(vf4 vf4Var) {
        int iOrdinal = vf4Var.a().ordinal();
        if (iOrdinal == 0) {
            return imn.a;
        }
        if (iOrdinal == 1) {
            return imn.b;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List p(c21 c21Var) {
        return f46.i0(new enn[]{(q9b) c21Var.e, (zxg) c21Var.t, (avj0) c21Var.h, (c0b) c21Var.c, (b23) c21Var.f, (o3y0) c21Var.i, ((kly0) c21Var.g).get(), 0, (mq90) c21Var.b, 0});
    }

    public static List q(c21 c21Var) {
        return p7h.M(new pnn[]{c21Var.q(), c21Var.o(), new pnn(2131954662, Collections.singletonList((mq90) c21Var.b))});
    }

    public static List r(c21 c21Var) {
        return f46.i0(new enn[]{(q9b) c21Var.e, (l891) c21Var.d});
    }

    public static List s(c21 c21Var) {
        return Collections.singletonList(new pnn((Integer) null, p7h.M(new enn[]{(q9b) c21Var.e, (l891) c21Var.d})));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List t(c21 c21Var) {
        return f46.i0(new enn[]{(q9b) c21Var.e, (zxg) c21Var.t, (avj0) c21Var.h, (c0b) c21Var.c, (b23) c21Var.f, (o3y0) c21Var.i, ((kly0) c21Var.g).get(), 0, (l891) c21Var.d, (mq90) c21Var.b, 0});
    }

    public static List u(c21 c21Var) {
        return p7h.M(new pnn[]{c21Var.q(), c21Var.o(), new pnn(2131954660, Collections.singletonList((l891) c21Var.d))});
    }

    public static be v(RxRouter rxRouter) {
        return new be(new CosmosTransport(new sn0(rxRouter, (byte) 14)));
    }

    public static mvn w(xrc0 xrc0Var) {
        return new mvn(xrc0Var);
    }

    public static nbc x() {
        return new nbc((byte) 3);
    }

    public static y48 y(RxRouter rxRouter) {
        return new y48(new CosmosTransport(new sn0(rxRouter, (byte) 15)));
    }

    public static ExecutorServiceWorkRunner z() {
        return WorkRunners.a();
    }
}
