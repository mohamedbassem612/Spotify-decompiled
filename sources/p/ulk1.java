package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class ulk1 implements jly0 {
    public static uww0 a(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 26);
    }

    public static dmg1 b(ynb0 ynb0Var) {
        dmg1 dmg1Var = new dmg1((byte) 18);
        dmg1Var.b = ynb0Var;
        return dmg1Var;
    }

    public static aqk1 c(jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, caq caqVar, caq caqVar2, caq caqVar3, jly0 jly0Var3) {
        aqk1 aqk1Var = new aqk1();
        aqk1Var.a = jly0Var;
        aqk1Var.b = jly0Var2;
        aqk1Var.c = kly0Var;
        aqk1Var.d = caqVar;
        aqk1Var.e = caqVar2;
        aqk1Var.f = caqVar3;
        aqk1Var.g = jly0Var3;
        return aqk1Var;
    }

    public static tkl1 d(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, kly0 kly0Var, jly0 jly0Var3, caq caqVar9) {
        tkl1 tkl1Var = new tkl1();
        tkl1Var.a = jo80Var;
        tkl1Var.b = jly0Var;
        tkl1Var.c = jly0Var2;
        tkl1Var.d = caqVar;
        tkl1Var.e = caqVar2;
        tkl1Var.f = caqVar3;
        tkl1Var.g = caqVar4;
        tkl1Var.h = caqVar5;
        tkl1Var.i = caqVar6;
        tkl1Var.j = caqVar7;
        tkl1Var.k = caqVar8;
        tkl1Var.l = kly0Var;
        tkl1Var.m = jly0Var3;
        tkl1Var.n = caqVar9;
        return tkl1Var;
    }

    public static dmg1 e(ynb0 ynb0Var) {
        dmg1 dmg1Var = new dmg1((byte) 21);
        dmg1Var.b = ynb0Var;
        return dmg1Var;
    }

    public static be f(RxRouter rxRouter) {
        return new be(new CosmosTransport(new opy0(rxRouter, (byte) 6)));
    }

    public static be g(RxRouter rxRouter) {
        return new be(new CosmosTransport(new opy0(rxRouter, (byte) 7)));
    }

    public static Handler h() {
        return new Handler(Looper.getMainLooper());
    }

    public static t8e1 i(mhc mhcVar) {
        return new t8e1(mhcVar, (byte) 21);
    }

    public static t8e1 j(nhc nhcVar) {
        return new t8e1(nhcVar, (byte) 22);
    }

    public static iyh1 k(b0q b0qVar) {
        return new iyh1(b0qVar, (byte) 9);
    }

    public static iyh1 l(l3q l3qVar) {
        return new iyh1(l3qVar, (byte) 13);
    }

    public static iyh1 m(jbq jbqVar) {
        return new iyh1(jbqVar, (byte) 12);
    }

    public static Single n(ut71 ut71Var, Flowable flowable, Context context) {
        return new FlowableTake(flowable.x(bjx0.Y0).x(djx0.Y0)).J(njx0.Y0).z().map(new np91(ut71Var, context));
    }

    public static lxh1 o() {
        xkg0 xkg0Var = new xkg0();
        xkg0Var.putAll(ii3.b);
        xkg0Var.putAll(jya.b);
        xkg0Var.putAll(l9n.b);
        xkg0Var.putAll(d050.a);
        xkg0Var.putAll(bij0.b);
        return new lxh1(xkg0Var.b(), (byte) 5);
    }

    public static q900 p(Scheduler scheduler) {
        return new q900(scheduler);
    }

    public static qzs q(wuq wuqVar) {
        return new qzs(xqu.a(wuqVar.b), xqu.a(wuqVar.c));
    }

    public static vuq r(uy2 uy2Var) {
        return new vuq(uy2Var);
    }

    public static wuq s(tbl tblVar) {
        return new wuq(tblVar);
    }
}
