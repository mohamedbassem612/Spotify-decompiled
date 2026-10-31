package p;

import android.content.Context;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class w3p0 implements jly0 {
    public static n7h1 A(s4p0 s4p0Var) {
        n7h1 n7h1VarF = s4p0Var.f();
        c8o.m(n7h1VarF);
        return n7h1VarF;
    }

    public static i8h1 B(s4p0 s4p0Var) {
        i8h1 i8h1VarD = s4p0Var.d();
        c8o.m(i8h1VarD);
        return i8h1VarD;
    }

    public static txk0 C() {
        return new txk0((byte) 1);
    }

    public static spq0 D(hs71 hs71Var, Flowable flowable) {
        gs71 gs71VarA = hs71Var.a(new e5l0(flowable.j(mo9.Y).J(zz10.R0).t(Functions.a), (byte) 11));
        return gs71VarA != null ? new i5w0(gs71VarA) : j5.a;
    }

    public static egn0 a(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 11);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static v3p0 b(gbp gbpVar, gbp gbpVar2, gbp gbpVar3, gbp gbpVar4, gbp gbpVar5, gbp gbpVar6, gbp gbpVar7) {
        v3p0 v3p0Var = new v3p0();
        v3p0Var.a = gbpVar;
        v3p0Var.b = gbpVar2;
        v3p0Var.c = gbpVar3;
        v3p0Var.d = gbpVar4;
        v3p0Var.e = gbpVar5;
        v3p0Var.f = gbpVar6;
        v3p0Var.g = gbpVar7;
        return v3p0Var;
    }

    public static enp0 c(jo80 jo80Var, r7q r7qVar, caq caqVar, r7q r7qVar2) {
        enp0 enp0Var = new enp0();
        enp0Var.a = jo80Var;
        enp0Var.b = r7qVar;
        enp0Var.c = caqVar;
        enp0Var.d = r7qVar2;
        return enp0Var;
    }

    public static iu8 d(uwp uwpVar) {
        return new iu8((mwm1) ((kly0) uwpVar.a.e).get());
    }

    public static buc e(uwp uwpVar) {
        return (buc) uwpVar.d.get();
    }

    public static n3v f(uwp uwpVar) {
        return new n3v((mwm1) ((kly0) uwpVar.a.e).get());
    }

    public static mr20 g(jnk0 jnk0Var) {
        return rqt0.u(new r6k0(jnk0Var.a, (byte) 28));
    }

    public static tdp0 h(zc4 zc4Var) {
        return new tdp0(zc4Var);
    }

    public static upp0 i(uwp uwpVar) {
        upp0 upp0Var = (upp0) uwpVar.c.get();
        c8o.m(upp0Var);
        return upp0Var;
    }

    public static vpp0 j(uwp uwpVar) {
        return new vpp0(new CosmosTransport(new rtp0((RxRouter) ((kly0) uwpVar.a.c).get())));
    }

    public static byp0 k(uwp uwpVar) {
        return new byp0(new vpp0(new CosmosTransport(new rtp0((RxRouter) ((kly0) uwpVar.a.c).get()))));
    }

    public static lut0 l(uwp uwpVar) {
        lut0 lut0Var = (lut0) uwpVar.h.get();
        c8o.m(lut0Var);
        return lut0Var;
    }

    public static mut0 m(uwp uwpVar) {
        Context context = (Context) ((kly0) uwpVar.a.b).get();
        return new mut0(context.getString(2131959364), context.getString(2131959360));
    }

    public static qut0 n(uwp uwpVar) {
        qut0 qut0Var = (qut0) uwpVar.i.get();
        c8o.m(qut0Var);
        return qut0Var;
    }

    public static sut0 o(uwp uwpVar) {
        sut0 sut0Var = (sut0) uwpVar.k.get();
        c8o.m(sut0Var);
        return sut0Var;
    }

    public static zut0 p(uwp uwpVar) {
        zut0 zut0Var = (zut0) uwpVar.m.get();
        c8o.m(zut0Var);
        return zut0Var;
    }

    public static FlowableFilter q(vqb1 vqb1Var) {
        return vqb1Var.a().x(qs10.T0);
    }

    public static m6k0 r(izp izpVar) {
        return new m6k0(izpVar, (byte) 23);
    }

    public static m6k0 s(k3q k3qVar) {
        return new m6k0(k3qVar, (byte) 21);
    }

    public static m6k0 t(l3q l3qVar) {
        return new m6k0(l3qVar, (byte) 22);
    }

    public static ncn0 u(twa twaVar) {
        return new ncn0(twaVar, (byte) 27);
    }

    public static svw0 v(uwp uwpVar) {
        return new svw0((o241) ((kly0) uwpVar.a.f).get());
    }

    public static kyo0 w(hyo0 hyo0Var, q2p0 q2p0Var, o2p0 o2p0Var) {
        kly0 kly0Var = hyo0Var.a;
        kly0 kly0Var2 = hyo0Var.b;
        otf otfVar = hyo0Var.m;
        return new kyo0(q2p0Var, kly0Var, kly0Var2, otfVar, new nt21(new zfr(hyo0Var.c.a, o2p0Var, (byte) 21), otfVar, (byte) 13), hyo0Var.d, hyo0Var.e, o2p0Var, hyo0Var.f, hyo0Var.i, hyo0Var.g, hyo0Var.h, hyo0Var.j, hyo0Var.k, hyo0Var.l);
    }

    public static qia1 x(uwp uwpVar) {
        return new qia1((dma1) uwpVar.f.get());
    }

    public static vqb1 y(Flowable flowable, loc1 loc1Var, Scheduler scheduler, t8u0 t8u0Var, zf30 zf30Var, yqg yqgVar) {
        return new vqb1(t8u0Var.a(zf30Var.s1), flowable, loc1Var, scheduler, yqgVar);
    }

    public static l6h1 z(s4p0 s4p0Var) {
        l6h1 l6h1VarE = s4p0Var.e();
        c8o.m(l6h1VarE);
        return l6h1VarE;
    }
}
