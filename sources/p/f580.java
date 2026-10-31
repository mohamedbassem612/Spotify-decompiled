package p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class f580 implements jly0 {
    public static Set A(kqi0 kqi0Var) {
        return f46.S0(new ss80[]{new ddr((poj0) kqi0Var.c, (byte) 0), new ef10((kly0) kqi0Var.b), new ddr((adh1) kqi0Var.d, (byte) 1), new dc21()});
    }

    public static List B(o860 o860Var) {
        ArrayList arrayList = (ArrayList) ((idd1) o860Var.e).getValue();
        c8o.m(arrayList);
        return arrayList;
    }

    public static t380 C(h0y h0yVar) {
        return (t380) h0yVar.b;
    }

    public static q290 D(op0 op0Var, av0 av0Var, fv0 fv0Var, i44 i44Var, y3q y3qVar, z3q z3qVar, a4q a4qVar, gw70 gw70Var, g9c0 g9c0Var) {
        return new q290(op0Var, av0Var, fv0Var, i44Var, y3qVar, z3qVar, a4qVar, gw70Var, g9c0Var);
    }

    public static lu0 a(CallbackRouter callbackRouter) {
        return new lu0(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 10)));
    }

    public static Single b(g931 g931Var) {
        return ((o241) g931Var.c).a.filter(xpv0.e).take(1L).singleOrError().map(new s6z0(g931Var, (byte) 15));
    }

    public static l7b c(RetrofitMaker retrofitMaker) {
        return (l7b) retrofitMaker.createWebgateService(l7b.class, "android-podcast-interactivity-context-menu-impl");
    }

    public static fld d(CallbackRouter callbackRouter) {
        return new fld(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 11)));
    }

    public static sjp e(pbq pbqVar) {
        return new sjp(pbqVar);
    }

    public static ConnectivityManager f(Context context) {
        return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    public static jwt g(CallbackRouter callbackRouter) {
        return new jwt(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 12)));
    }

    public static re00 h(CallbackRouter callbackRouter) {
        return new re00(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 13)));
    }

    public static oe30 i(CallbackRouter callbackRouter) {
        return new oe30(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 14)));
    }

    public static GregorianCalendar j() {
        return new GregorianCalendar();
    }

    public static s680 k(sjp sjpVar) {
        s680 s680Var = (s680) sjpVar.b.get();
        c8o.m(s680Var);
        return s680Var;
    }

    public static d780 l(CallbackRouter callbackRouter) {
        return new d780(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 15)));
    }

    public static ruz m(dg30 dg30Var, t8u0 t8u0Var) {
        return t8u0Var.a(((f0i) dg30Var).a).a();
    }

    public static p680 n(sjp sjpVar) {
        return new p680((s680) sjpVar.b.get());
    }

    public static bf70 o(ozp ozpVar) {
        return new bf70(ozpVar, (byte) 2);
    }

    public static oo61 p(CallbackRouter callbackRouter) {
        return new oo61(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 17)));
    }

    public static pf91 q(CallbackRouter callbackRouter) {
        return new pf91(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 18)));
    }

    public static wob1 r(CallbackRouter callbackRouter) {
        return new wob1(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 19)));
    }

    public static srd1 s(CallbackRouter callbackRouter) {
        return new srd1(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 20)));
    }

    public static WifiManager t(Context context) {
        return (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public static z32 u(CallbackRouter callbackRouter) {
        return new z32(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 21)));
    }

    public static Flowable v(gid gidVar) {
        return gidVar.e().toFlowable(BackpressureStrategy.d);
    }

    public static o290 w(ao0 ao0Var, op0 op0Var, i01 i01Var, i01 i01Var2, i44 i44Var, f5q f5qVar, g5q g5qVar, gw70 gw70Var) {
        return new o290(ao0Var, op0Var, i01Var, i01Var2, i44Var, f5qVar, g5qVar, gw70Var);
    }

    public static p290 x(vhq vhqVar, op0 op0Var, gw70 gw70Var, gbp gbpVar, gbp gbpVar2, i44 i44Var) {
        return new p290(i44Var, gbpVar, gbpVar2, vhqVar, op0Var, gw70Var);
    }

    public static t380 y(eb80 eb80Var) {
        return (t380) eb80Var.b;
    }

    public static Set z(zwa zwaVar, cab cabVar, mp8 mp8Var, lo9 lo9Var, k9r k9rVar, m4e0 m4e0Var, e5l0 e5l0Var, yqu0 yqu0Var) {
        return f46.S0(new ct80[]{new bab((u9b) cabVar.b, (v9b) cabVar.c, (jab) cabVar.d, (byte) 0), new rbd((add) mp8Var.b), new bab((oc4) k9rVar.b, (a0m) k9rVar.c, (mtr) k9rVar.d, (byte) 1), new w8b((aqh) lo9Var.b, (byte) 1), new w8b((io60) e5l0Var.b, (byte) 2), new w8b((bbr0) zwaVar.b, (byte) 0), new w8b((r44) m4e0Var.b, (byte) 3), new d7y0((i5y0) yqu0Var.c, (x1i1) yqu0Var.b)});
    }
}
