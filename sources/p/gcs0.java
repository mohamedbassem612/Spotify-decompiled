package p;

import android.app.Application;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class gcs0 implements jly0 {
    public static fcs0 a(RetrofitMaker retrofitMaker) {
        return (fcs0) retrofitMaker.createWebgateService(fcs0.class, "android-payment-endpoint");
    }

    public static t700 b(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 25);
    }

    public static egn0 c(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 17);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static ans0 d(caq caqVar, caq caqVar2, kly0 kly0Var, r7q r7qVar, r7q r7qVar2, r7q r7qVar3) {
        ans0 ans0Var = new ans0();
        ans0Var.a = caqVar;
        ans0Var.b = caqVar2;
        ans0Var.c = kly0Var;
        ans0Var.d = r7qVar;
        ans0Var.e = r7qVar2;
        ans0Var.f = r7qVar3;
        return ans0Var;
    }

    public static v0t0 e(kly0 kly0Var) {
        v0t0 v0t0Var = new v0t0();
        v0t0Var.a = kly0Var;
        return v0t0Var;
    }

    public static azt0 f(kly0 kly0Var, kly0 kly0Var2, jly0 jly0Var, jly0 jly0Var2, caq caqVar, caq caqVar2, jly0 jly0Var3, caq caqVar3, jly0 jly0Var4) {
        azt0 azt0Var = new azt0();
        azt0Var.a = kly0Var;
        azt0Var.b = kly0Var2;
        azt0Var.c = jly0Var;
        azt0Var.d = jly0Var2;
        azt0Var.e = caqVar;
        azt0Var.f = caqVar2;
        azt0Var.g = jly0Var3;
        azt0Var.h = caqVar3;
        azt0Var.i = jly0Var4;
        return azt0Var;
    }

    public static t700 g(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 26);
    }

    public static t700 h(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 27);
    }

    public static swm0 i(o5n o5nVar) {
        return new swm0(o5nVar, (byte) 22);
    }

    public static oy30 j(t2j0 t2j0Var) {
        return new oy30(t2j0Var);
    }

    public static qrl0 k() {
        r6h1 r6h1Var = r6h1.c;
        return new qrl0((byte) 1);
    }

    public static hul0 l() {
        return new hul0();
    }

    public static String m(Application application) {
        return application.getPackageName();
    }

    public static String n(ajg ajgVar) {
        return ((zym0) ajgVar).a;
    }

    public static jn7 o(CallbackRouter callbackRouter, cx4 cx4Var) {
        ens0.b = cx4Var.a();
        return new jn7(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 6)));
    }

    public static p3t0 p(RetrofitMaker retrofitMaker) {
        return (p3t0) retrofitMaker.createWebgateService(p3t0.class, "android-integrity-integrityimpl");
    }

    public static List q(e5l0 e5l0Var) {
        smc0 smc0Var = (smc0) e5l0Var.b;
        c8o.m(smc0Var);
        return smc0Var;
    }

    public static ctt0 r(RxRouter rxRouter) {
        return new ctt0(new CosmosTransport(new x430(rxRouter, (byte) 4)));
    }

    public static List s() {
        return p7h.M(new String[]{"AutomotivePlaybackGrabbingException", "ProjectedCarPlaybackGrabbingException", "SpeakerDeeplinkPlaybackGrabbingException", "PlaybackGrabbingExceptionDefault"});
    }

    public static pjq0 t(mzp mzpVar) {
        return new pjq0(mzpVar, (byte) 9);
    }

    public static pjq0 u(t2q t2qVar) {
        return new pjq0(t2qVar, (byte) 8);
    }

    public static pjq0 v(l3q l3qVar) {
        return new pjq0(l3qVar, (byte) 13);
    }

    public static pjq0 w(w7q w7qVar) {
        return new pjq0(w7qVar, (byte) 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fdh x(jo80 jo80Var, boolean z, oy30 oy30Var, ax4 ax4Var) {
        bte0 bte0Var = new bte0();
        if (z) {
        }
        fdh fdhVar = new fdh(new ooe1[]{oy30Var, bte0Var});
        fdhVar.setEnabled(ax4Var.p());
        return fdhVar;
    }

    public static myq0 y(clm clmVar, ynb0 ynb0Var) {
        return new myq0(clmVar, ynb0Var, (byte) 19);
    }
}
