package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class svf implements jly0 {
    public static ekg A(j7m0 j7m0Var) {
        return new ekg(j7m0Var, (byte) 3);
    }

    public static g3s0 B(RetrofitMaker retrofitMaker) {
        return (g3s0) retrofitMaker.createEarlyAccessWebgateService(g3s0.class, "android-gpb-clientimpl");
    }

    public static bih1 C(z5p z5pVar) {
        return new bih1(z5pVar.a(), (zhh1) z5pVar.a.h.get(), (byte) 0);
    }

    public static hik1 D(z5p z5pVar) {
        return new hik1((y5p) z5pVar.l.get());
    }

    public static z5p a(mk mkVar) {
        return new z5p(mkVar);
    }

    public static h21 b(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 14);
    }

    public static t8c c(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 18);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }

    public static qyf d(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6) {
        qyf qyfVar = new qyf();
        qyfVar.a = kly0Var;
        qyfVar.b = kly0Var2;
        qyfVar.c = kly0Var3;
        qyfVar.d = kly0Var4;
        qyfVar.e = kly0Var5;
        qyfVar.f = kly0Var6;
        return qyfVar;
    }

    public static xyf e(jly0 jly0Var, kly0 kly0Var, caq caqVar) {
        xyf xyfVar = new xyf();
        xyfVar.a = jly0Var;
        xyfVar.b = kly0Var;
        xyfVar.c = caqVar;
        return xyfVar;
    }

    public static ejg f() {
        return new ejg();
    }

    public static ekg g(j7m0 j7m0Var) {
        return new ekg(j7m0Var, (byte) 0);
    }

    public static byf h(z5p z5pVar) {
        return z5pVar.a();
    }

    public static ryf i(z5p z5pVar) {
        mk mkVar = z5pVar.a;
        return new ryf(new frv0(mkVar.d()), mkVar.b());
    }

    public static zwg j(xrc0 xrc0Var, uu00 uu00Var, b7n b7nVar, o241 o241Var, wf4 wf4Var) {
        return new zwg(uu00Var, xrc0Var, b7nVar, o241Var, wf4Var);
    }

    public static List k(owf1 owf1Var, eea0 eea0Var, zb91 zb91Var, jd1 jd1Var, t4d1 t4d1Var, rgm rgmVar, s8y0 s8y0Var, xq81 xq81Var, ujc1 ujc1Var, vee0 vee0Var, s8y0 s8y0Var2, m7y0 m7y0Var, s8y0 s8y0Var3, uic uicVar, a0b a0bVar, wcr wcrVar, rgm rgmVar2, nl51 nl51Var, lo9 lo9Var, s8y0 s8y0Var4, djm djmVar, rgm rgmVar3, uip0 uip0Var, jxp0 jxp0Var, rut0 rut0Var, mlw0 mlw0Var, ujc1 ujc1Var2, jd1 jd1Var2, aod aodVar, av8 av8Var, gna0 gna0Var, rgm rgmVar4, gna0 gna0Var2, ruc0 ruc0Var, jkp0 jkp0Var, jl00 jl00Var, gna0 gna0Var3, tpp0 tpp0Var, nt21 nt21Var, s8y0 s8y0Var5, n801 n801Var, s8y0 s8y0Var6, tpp0 tpp0Var2, ujc1 ujc1Var3, tpp0 tpp0Var3, twa1 twa1Var, tym0 tym0Var, vee0 vee0Var2, tpp0 tpp0Var4, tpp0 tpp0Var5, s8y0 s8y0Var7, tpp0 tpp0Var6) {
        return p7h.M(new k1v0[]{new k1v0(jd1Var, new uve0(r6p1.u(uicVar, eea0Var).r(new n0v0(jxp0Var, (byte) 0)).r(new n0v0(ruc0Var, (byte) 0)))), new k1v0(ujc1Var2, owf1Var), new k1v0(gna0Var, new uve0(r6p1.p(eea0Var, wcrVar))), new k1v0(s8y0Var6, n801Var), new k1v0(s8y0Var5, nt21Var), new k1v0(vee0Var2, tym0Var), new k1v0(gna0Var2, ruc0Var), new k1v0(av8Var, aodVar), new k1v0(s8y0Var2, uicVar), new k1v0(tpp0Var5, new uve0(r6p1.p(jxp0Var, mlw0Var))), new k1v0(vee0Var, new uve0(r6p1.p(jxp0Var, uip0Var))), new k1v0(tpp0Var4, a0bVar), new k1v0(tpp0Var3, new uve0(r6p1.p(jxp0Var, rut0Var).r(jkp0Var))), new k1v0(s8y0Var7, jxp0Var), new k1v0(tpp0Var, jxp0Var), new k1v0(vee0Var, new uve0(r6p1.p(uicVar, new n0v0(jxp0Var, (byte) 0)))), new k1v0(rgmVar4, lo9Var), new k1v0(ujc1Var3, zb91Var), new k1v0(gna0Var3, new uve0(r6p1.p(jl00Var, eea0Var).r(new n0v0(jxp0Var, (byte) 0)))), new k1v0(ujc1Var, new n0v0(jxp0Var, (byte) 0)), new k1v0(jd1Var2, t4d1Var), new k1v0(tpp0Var2, jxp0Var), new k1v0(tpp0Var6, a0bVar), new k1v0(rgmVar, new uve0(r6p1.p(uicVar, new n0v0(jxp0Var, (byte) 0)))), new k1v0(s8y0Var4, new uve0(r6p1.u(uicVar, jxp0Var).r(new n0v0(nl51Var, (byte) 0)))), new k1v0(rgmVar2, new ypa((byte) 20, false)), new k1v0(rgmVar3, new uve0(r6p1.p(djmVar, new n0v0(eea0Var, (byte) 0)).r(new n0v0(jxp0Var, (byte) 0)).r(new n0v0(ruc0Var, (byte) 0)))), new k1v0(s8y0Var, new uve0(r6p1.p(new n0v0(jxp0Var, (byte) 0), new n0v0(ruc0Var, (byte) 0)))), new k1v0(s8y0Var3, new uve0(r6p1.p(m7y0Var, new n0v0(jxp0Var, (byte) 0)))), new k1v0(twa1Var, xq81Var)});
    }

    public static flg l(RxRouter rxRouter, Scheduler scheduler) {
        return new flg(new be(new CosmosTransport(new sn0(rxRouter, (byte) 7))), scheduler);
    }

    public static Optional m(h6p h6pVar) {
        Optional optional = (Optional) h6pVar.a.get();
        c8o.m(optional);
        return optional;
    }

    public static w2n n(z5p z5pVar) {
        return new w2n((y2g0) z5pVar.a.a.get());
    }

    public static bbn o() {
        return new bbn((byte) 0);
    }

    public static z350 p(kly0 kly0Var) {
        return (z350) kly0Var.get();
    }

    public static ekg q(j7m0 j7m0Var) {
        return new ekg(j7m0Var, (byte) 1);
    }

    public static lpd r(nzp nzpVar) {
        return new lpd(nzpVar, (byte) 9);
    }

    public static lpd s(ozp ozpVar) {
        return new lpd(ozpVar, (byte) 10);
    }

    public static swv0 t(z5p z5pVar) {
        mk mkVar = z5pVar.a;
        return new swv0(new frv0(mkVar.d()), new ryf(new frv0(mkVar.d()), mkVar.b()));
    }

    public static x8c0 u() {
        tac0 tac0Var = krw0.i.f;
        c8o.m(tac0Var);
        return tac0Var;
    }

    public static amy0 v(z5p z5pVar) {
        amy0 amy0Var = (amy0) z5pVar.i.get();
        c8o.m(amy0Var);
        return amy0Var;
    }

    public static ekg w(j7m0 j7m0Var) {
        return new ekg(j7m0Var, (byte) 2);
    }

    public static x5p x(z5p z5pVar) {
        x5p x5pVar = (x5p) z5pVar.j.get();
        c8o.m(x5pVar);
        return x5pVar;
    }

    public static pf61 y(z5p z5pVar) {
        pf61 pf61Var = (pf61) z5pVar.c.get();
        c8o.m(pf61Var);
        return pf61Var;
    }

    public static q7b1 z(z5p z5pVar) {
        mk mkVar = z5pVar.a;
        Scheduler schedulerE = mkVar.e();
        Scheduler scheduler = (Scheduler) mkVar.c.get();
        rm5 rm5Var = new rm5();
        rm5Var.a = scheduler;
        rm5Var.b = Single.fromCallable(a3n.b).subscribeOn(schedulerE).cache();
        return new q7b1(rm5Var, new lb((Context) mkVar.e.get()), (String) mkVar.d.get(), new b94(true, mkVar.c()).a());
    }
}
