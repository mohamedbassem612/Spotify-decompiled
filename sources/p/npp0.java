package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class npp0 implements jly0 {
    public static hrg1 A(ucd ucdVar, Context context, joo jooVar) {
        return new hrg1(ucdVar, context, jooVar);
    }

    public static ftg1 B(ucd ucdVar, Context context, joo jooVar) {
        return new ftg1(ucdVar, context, jooVar);
    }

    public static mwm1 C(RxRouter rxRouter) {
        return new mwm1(new CosmosTransport(new sn0(rxRouter, (byte) 28)));
    }

    public static ucd D(gma1 gma1Var) {
        return new ucd(gma1Var.a(), (byte) 4);
    }

    public static t700 a(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 23);
    }

    public static hxp0 b(gbp gbpVar, kly0 kly0Var, caq caqVar) {
        hxp0 hxp0Var = new hxp0();
        hxp0Var.a = gbpVar;
        hxp0Var.b = kly0Var;
        hxp0Var.c = caqVar;
        return hxp0Var;
    }

    public static nbq0 c(thq thqVar, r7q r7qVar, kly0 kly0Var, g5t g5tVar, thq thqVar2, r7q r7qVar2, kly0 kly0Var2, r7q r7qVar3, caq caqVar, kly0 kly0Var3, caq caqVar2, kly0 kly0Var4, kly0 kly0Var5, r7q r7qVar4) {
        nbq0 nbq0Var = new nbq0();
        nbq0Var.a = thqVar;
        nbq0Var.b = r7qVar;
        nbq0Var.c = kly0Var;
        nbq0Var.d = g5tVar;
        nbq0Var.e = thqVar2;
        nbq0Var.f = r7qVar2;
        nbq0Var.g = kly0Var2;
        nbq0Var.h = r7qVar3;
        nbq0Var.i = caqVar;
        nbq0Var.j = kly0Var3;
        nbq0Var.k = caqVar2;
        nbq0Var.l = kly0Var4;
        nbq0Var.m = kly0Var5;
        nbq0Var.n = r7qVar4;
        return nbq0Var;
    }

    public static uwp d(f0a f0aVar) {
        return new uwp(f0aVar);
    }

    public static List e(l9q l9qVar, m9q m9qVar, n9q n9qVar, o9q o9qVar, p9q p9qVar, q9q q9qVar, raq raqVar, saq saqVar, r9q r9qVar, s9q s9qVar) {
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(l9qVar);
        smc0VarN.add(m9qVar);
        smc0VarN.add(n9qVar);
        smc0VarN.add(o9qVar);
        smc0VarN.add(p9qVar);
        smc0VarN.add(q9qVar);
        smc0VarN.add(raqVar);
        smc0VarN.add(saqVar);
        smc0VarN.add(r9qVar);
        smc0VarN.add(s9qVar);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        c8o.m(smc0VarK);
        return smc0VarK;
    }

    public static zzp0 f(Observable observable) {
        return new zzp0(observable);
    }

    public static zwp g(byp bypVar) {
        zwp zwpVar = (zwp) new z2p(new l1p0(bypVar, (byte) 7)).a.get();
        c8o.m(zwpVar);
        return zwpVar;
    }

    public static g3q0 h(w6e0 w6e0Var, buf0 buf0Var, yqg yqgVar, hh4 hh4Var, q8n q8nVar) {
        return new g3q0(w6e0Var, buf0Var, yqgVar, hh4Var.a(), q8nVar);
    }

    public static be i(RxRouter rxRouter) {
        return new be(new CosmosTransport(new x430(rxRouter, (byte) 2)));
    }

    public static p3q0 j(cxc cxcVar) {
        k370 k370Var = new k370();
        k370Var.i("https");
        k370Var.e("spclient.wg.spotify.com");
        l370 l370VarB = k370Var.b();
        ne neVar = new ne((byte) 10);
        neVar.a = cxcVar;
        neVar.h(l370VarB);
        neVar.c(new tpq0((byte) 1));
        ((ArrayList) neVar.d).add(new j241((Scheduler) null, true));
        return (p3q0) neVar.j().b(p3q0.class);
    }

    public static k4q0 k(RetrofitMaker retrofitMaker) {
        return new k4q0((l4q0) retrofitMaker.createWebgateService(l4q0.class, "android-on-demand-trials-trial-start-impl"));
    }

    public static r0s0 l(ifl1 ifl1Var) {
        return new toj0((f9p) ifl1Var.b).z();
    }

    public static tut0 m(uwp uwpVar) {
        tut0 tut0Var = (tut0) uwpVar.j.get();
        c8o.m(tut0Var);
        return tut0Var;
    }

    public static x6u0 n(uwp uwpVar) {
        return new x6u0((t2j0) ((kly0) uwpVar.a.Q0).get());
    }

    public static m6k0 o(uzp uzpVar) {
        return new m6k0(uzpVar, (byte) 25);
    }

    public static m6k0 p(vzp vzpVar) {
        return new m6k0(vzpVar, (byte) 26);
    }

    public static m6k0 q(n0q n0qVar) {
        return new m6k0(n0qVar, (byte) 27);
    }

    public static m6k0 r(q0q q0qVar) {
        return new m6k0(q0qVar, (byte) 28);
    }

    public static m6k0 s(d1q d1qVar) {
        return new m6k0(d1qVar, (byte) 24);
    }

    public static ncn0 t(jxa jxaVar) {
        return new ncn0(jxaVar, (byte) 28);
    }

    public static ncn0 u(fza fzaVar) {
        return new ncn0(fzaVar, (byte) 29);
    }

    public static qpp0 v(a0b a0bVar) {
        return new qpp0(a0bVar, (byte) 0);
    }

    public static qpp0 w(t2b t2bVar) {
        return new qpp0(t2bVar, (byte) 1);
    }

    public static qpp0 x(hfb hfbVar) {
        return new qpp0(hfbVar, (byte) 2);
    }

    public static pjq0 y(k3q k3qVar) {
        return new pjq0(k3qVar, (byte) 0);
    }

    public static pjq0 z(l3q l3qVar) {
        return new pjq0(l3qVar, (byte) 1);
    }
}
