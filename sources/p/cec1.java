package p;

import android.content.Context;
import android.os.Build;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import javax.net.ssl.HostnameVerifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class cec1 implements jly0 {
    public static uww0 a(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 23);
    }

    public static g561 b(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 17);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static vrc1 c(jo80 jo80Var, jly0 jly0Var, g5t g5tVar, jo80 jo80Var2, kly0 kly0Var, jly0 jly0Var2, kly0 kly0Var2, kly0 kly0Var3, caq caqVar, kly0 kly0Var4) {
        vrc1 vrc1Var = new vrc1();
        vrc1Var.a = jo80Var;
        vrc1Var.b = jly0Var;
        vrc1Var.c = g5tVar;
        vrc1Var.d = jo80Var2;
        vrc1Var.e = kly0Var;
        vrc1Var.f = jly0Var2;
        vrc1Var.g = kly0Var2;
        vrc1Var.h = kly0Var3;
        vrc1Var.i = caqVar;
        vrc1Var.j = kly0Var4;
        return vrc1Var;
    }

    public static m0d1 d(caq caqVar, jly0 jly0Var, jly0 jly0Var2) {
        m0d1 m0d1Var = new m0d1();
        m0d1Var.a = caqVar;
        m0d1Var.b = jly0Var;
        m0d1Var.c = jly0Var2;
        return m0d1Var;
    }

    public static svt e(RetrofitMaker retrofitMaker) {
        return (svt) retrofitMaker.createWebgateService(svt.class, "android-deviceproxy-registrar");
    }

    public static tzc1 f(a0d1 a0d1Var, hp91 hp91Var) {
        return new tzc1(a0d1Var, hp91Var);
    }

    public static uh61 g(nbc nbcVar) {
        return new uh61(nbcVar, (byte) 26);
    }

    public static uh61 h(ubc ubcVar) {
        return new uh61(ubcVar, (byte) 27);
    }

    public static ifb1 i(b0q b0qVar) {
        return new ifb1(b0qVar, (byte) 9);
    }

    public static ifb1 j(g0q g0qVar) {
        return new ifb1(g0qVar, (byte) 10);
    }

    public static ifb1 k(q0q q0qVar) {
        return new ifb1(q0qVar, (byte) 7);
    }

    public static ifb1 l(y0q y0qVar) {
        return new ifb1(y0qVar, (byte) 8);
    }

    public static void m() {
        c8o.m(Build.VERSION.RELEASE);
    }

    public static be n(RxRouter rxRouter) {
        return new be(new CosmosTransport(new x430(rxRouter, (byte) 9)));
    }

    public static hec1 o(RxRouter rxRouter) {
        return new hec1(new CosmosTransport(new x430(rxRouter, (byte) 10)));
    }

    public static jn7 p(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 13)));
    }

    public static gtv0 q() {
        return new gtv0((byte) 20);
    }

    public static ejc1 r(RetrofitMaker retrofitMaker) {
        return (ejc1) retrofitMaker.createWebgateService(ejc1.class, "android-sts-mascotimpl");
    }

    public static vco0 s() {
        return new vco0();
    }

    public static hxc1 t(RetrofitMaker retrofitMaker) {
        return (hxc1) retrofitMaker.createWebgateService(hxc1.class, "android-bluejay-data-impl");
    }

    public static no5 u(Context context) {
        return new no5(context);
    }

    public static vbd1 v(wsq wsqVar) {
        vbd1 vbd1Var = (vbd1) wsqVar.b.get();
        c8o.m(vbd1Var);
        return vbd1Var;
    }

    public static wbd1 w(wsq wsqVar) {
        wbd1 wbd1Var = (wbd1) wsqVar.c.get();
        c8o.m(wbd1Var);
        return wbd1Var;
    }

    public static azp0 x() {
        zyp0 zyp0Var = new zyp0();
        HostnameVerifier hostnameVerifier = (dc30) dc30.k.getValue();
        if (hostnameVerifier != zyp0Var.u) {
            zyp0Var.E = null;
        }
        zyp0Var.u = hostnameVerifier;
        return new azp0(zyp0Var);
    }

    public static Single y(ut71 ut71Var, Flowable flowable, Context context) {
        return new FlowableTake(flowable.x(hgx0.R0).x(mgx0.Q0)).J(bjx0.R0).z().map(new esa1((Object) ut71Var, (Object) context, (byte) 15));
    }

    public static wsq z(dn81 dn81Var) {
        return new wsq(dn81Var);
    }
}
