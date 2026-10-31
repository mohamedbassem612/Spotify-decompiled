package p;

import android.content.res.Resources;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class tk00 implements jly0 {
    public static np01 A(ghp ghpVar) {
        return new np01(new CosmosTransport(new x430((RxRouter) ghpVar.a.G.get(), (byte) 6)));
    }

    public static ks21 B(ghp ghpVar) {
        return new ks21((bqz) ghpVar.a.i.get(), (byte) 4);
    }

    public static m710 C(ghp ghpVar) {
        m710 m710Var = (m710) ghpVar.z0.get();
        c8o.m(m710Var);
        return m710Var;
    }

    public static i961 D(ghp ghpVar) {
        i961 i961Var = (i961) ghpVar.E0.get();
        c8o.m(i961Var);
        return i961Var;
    }

    public static c610 a(ghp ghpVar) {
        c610 c610Var = (c610) ghpVar.i0.get();
        c8o.m(c610Var);
        return c610Var;
    }

    public static ueg b(ghp ghpVar) {
        return new ueg(new CosmosTransport(new sn0((RxRouter) ghpVar.a.G.get(), (byte) 17)));
    }

    public static s610 c(ghp ghpVar) {
        s610 s610Var = (s610) ghpVar.m0.get();
        c8o.m(s610Var);
        return s610Var;
    }

    public static st00 d(ghp ghpVar) {
        st00 st00Var = (st00) ghpVar.n0.get();
        c8o.m(st00Var);
        return st00Var;
    }

    public static bm00 e(ghp ghpVar) {
        return ghp.f();
    }

    public static xpv0 f() {
        return new xpv0((byte) 16);
    }

    public static mc3 g(ynb0 ynb0Var) {
        mc3 mc3Var = new mc3((byte) 4);
        mc3Var.b = ynb0Var;
        return mc3Var;
    }

    public static y610 h(ghp ghpVar) {
        y610 y610Var = (y610) ghpVar.D0.get();
        c8o.m(y610Var);
        return y610Var;
    }

    public static a710 i(ghp ghpVar) {
        a710 a710Var = (a710) ghpVar.v0.get();
        c8o.m(a710Var);
        return a710Var;
    }

    public static uk00 j(Resources resources, boolean z) {
        return new uk00(2131427536, resources.getDimensionPixelSize(2131167023) + (z ? 0 : resources.getDimensionPixelSize(2131165289)), 2131428353, 2131428351);
    }

    public static jp00 k() {
        return new jp00();
    }

    public static zu00 l(zmj0 zmj0Var, pv00 pv00Var) {
        return new zu00(zmj0Var, pv00Var);
    }

    public static Set m() {
        return f46.S0(new ov00[]{new zb3((byte) 4), new zb3((byte) 3), new rn30((byte) 12), new zb3((byte) 1), new zb3((byte) 10), new zb3((byte) 12), new b3w0((byte) 0), new zb3((byte) 2), new zb3((byte) 8), new zb3((byte) 5), new b3w0((byte) 22), new b3w0((byte) 23), new zb3((byte) 6), new zb3((byte) 9), new zb3((byte) 13), new zb3((byte) 14), new zb3((byte) 16), new ad8(), new zb3((byte) 17), new zb3((byte) 18), new zb3((byte) 15), new zb3((byte) 19), new pjf1((byte) 4), new zb3((byte) 0), new zb3((byte) 7), new zb3((byte) 21), new pjf1((byte) 6), new lek((byte) 14), new lek((byte) 15), new rn30((byte) 0), new lek((byte) 5), new f7u0(), new lek((byte) 16), new lek((byte) 17), new lek((byte) 18), new b3w0((byte) 10), new b3w0((byte) 9), new pjf1((byte) 1), new lek((byte) 19), new lek((byte) 4), new pjf1((byte) 13), new b3w0((byte) 7), new lek((byte) 10), new rn30((byte) 5), new lek((byte) 21), new b3w0((byte) 2), new rn30((byte) 18), new b3w0((byte) 3), new rn30((byte) 3), new zb3((byte) 22), new zb3((byte) 25), new dxh(), new zb3((byte) 26), new pjf1((byte) 2), new lek((byte) 6), new zb3((byte) 11), new lek((byte) 8), new lek((byte) 11), new lek((byte) 12), new lek((byte) 13), new lek((byte) 20), new b3w0((byte) 12), new lek((byte) 22), new lek((byte) 23), new rn30((byte) 8), new rn30((byte) 9), new via((byte) 0), new lek((byte) 24), new lek((byte) 25), new n1z(), new lek((byte) 27), new lek((byte) 28), new lek((byte) 29), new ou00(), new rn30((byte) 4), new rn30((byte) 6), new rn30((byte) 7), new b3w0((byte) 13), new v351(), new rn30((byte) 10), new rn30((byte) 11), new rn30((byte) 13), new via((byte) 2), new rn30((byte) 15), new rn30((byte) 16), new rn30((byte) 14), new rn30((byte) 17), new b3w0((byte) 28), new b3w0((byte) 11), new b3w0((byte) 29), new rn30((byte) 29), new zb3((byte) 20), new b3w0((byte) 8), new rn30((byte) 19), new fmr0(), new rn30((byte) 21), new qnt0(), new rn30((byte) 22), new rn30((byte) 20), new so7(), new rn30((byte) 23), new rn30((byte) 24), new rn30((byte) 25), new pjf1((byte) 11), new b3w0((byte) 5), new b3w0((byte) 6), new zb3((byte) 27), new zb3((byte) 28), new zb3((byte) 29), new lek((byte) 0), new via((byte) 1), new lek((byte) 2), new lek((byte) 3), new lek((byte) 1), new w740(), new rn30((byte) 2), new rn30((byte) 1), new rn30((byte) 26), new rn30((byte) 27), new rn30((byte) 28), new b3w0((byte) 1), new b3w0((byte) 4), new b3w0((byte) 14), new b3w0((byte) 15), new b3w0((byte) 16), new b3w0((byte) 18), new b3w0((byte) 19), new b3w0((byte) 20), new b3w0((byte) 17), new b3w0((byte) 21), new b3w0((byte) 24), new zb3((byte) 23), new b3w0((byte) 25), new wpa1(), new b3w0((byte) 26), new b3w0((byte) 27), new zb3((byte) 24), new pjf1((byte) 0), new pjf1((byte) 3), new via((byte) 4), new pjf1((byte) 7), new pjf1((byte) 10), new pjf1((byte) 12), new pjf1((byte) 14), new pjf1((byte) 16), new lek((byte) 7), new lek((byte) 26), new pjf1((byte) 15), new via((byte) 3), new pjf1((byte) 8), new pjf1((byte) 9), new pjf1((byte) 5), new lek((byte) 9), new wio()});
    }

    public static bn70 n(vk00 vk00Var) {
        return new bn70(eqr0.I(vk00Var.a), nik1.n4, (nar0) null);
    }

    public static hjc o(xfx xfxVar) {
        return new hjc(xfxVar.b, (byte) 19);
    }

    public static Executor p(q8n q8nVar) {
        return qgo1.l(q8nVar);
    }

    public static iac0 q(q7r0 q7r0Var) {
        iac0 iac0Var = q7r0Var.d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public static zmj0 r(RxRouter rxRouter) {
        return new zmj0(new CosmosTransport(new sn0(rxRouter, (byte) 23)));
    }

    public static nay s(ozp ozpVar) {
        return new nay(ozpVar, (byte) 11);
    }

    public static fgx t(xfx xfxVar, kv01 kv01Var, i3h i3hVar) {
        return new fgx(xfxVar.b, new idd1(new cc00(kv01Var, (byte) 2)), i3hVar);
    }

    public static jn7 u(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 4)));
    }

    public static a931 v(CallbackRouter callbackRouter) {
        return new a931(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 5)));
    }

    public static uu0 w(xfx xfxVar, lo60 lo60Var, gw70 gw70Var, agc0 agc0Var) {
        return new uu0(xfxVar, gw70Var, agc0Var, lo60Var, false);
    }

    public static ExecutorService x() {
        return Executors.newSingleThreadExecutor();
    }

    public static uny y(kp00 kp00Var, lmo lmoVar, w25 w25Var) {
        return new uny(lmoVar, kp00Var, w25Var, (byte) 14);
    }

    public static String z(vk00 vk00Var) {
        String str = vk00Var.b;
        c8o.m(str);
        return str;
    }
}
