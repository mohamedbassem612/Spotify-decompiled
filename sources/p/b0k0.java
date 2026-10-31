package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class b0k0 implements jly0 {
    public static m6k0 A(wzp wzpVar) {
        return new m6k0(wzpVar, (byte) 1);
    }

    public static m6k0 B(xzp xzpVar) {
        return new m6k0(xzpVar, (byte) 2);
    }

    public static mr20 C(mr20 mr20Var) {
        return rqt0.u(new k6e0(new r6k0(mr20Var, (byte) 4), (byte) 6));
    }

    public static u9c0 D(gj5 gj5Var) {
        return cto1.q(gj5Var);
    }

    public static aas a(zrl0 zrl0Var) {
        asl0 asl0VarCreate = zrl0Var.create();
        k9k k9kVar = new k9k(asl0VarCreate);
        ynb0 ynb0VarA = xqu.a((bsp) k9kVar.c);
        yqg yqgVarA = asl0VarCreate.a();
        c8o.l(yqgVarA);
        tuz tuzVarT = f2u0.t(ynb0VarA, new cve0(yqgVarA));
        xrc0 xrc0VarL = asl0VarCreate.l();
        c8o.l(xrc0VarL);
        l7m0 l7m0Var = new l7m0(xrc0VarL, (byte) 17);
        waz0 waz0VarY = asl0VarCreate.Y();
        c8o.l(waz0VarY);
        iqr iqrVar = new iqr(tuzVarT, l7m0Var, waz0VarY);
        s4z0 s4z0Var = (s4z0) ((jly0) k9kVar.e).get();
        fcz0 fcz0Var = (fcz0) ((jly0) k9kVar.f).get();
        xrc0 xrc0VarL2 = asl0VarCreate.l();
        c8o.l(xrc0VarL2);
        n3d0 n3d0VarC0 = asl0VarCreate.C0();
        c8o.l(n3d0VarC0);
        Observable observableE0 = asl0VarCreate.E0();
        c8o.l(observableE0);
        Scheduler schedulerO = asl0VarCreate.o();
        c8o.l(schedulerO);
        Scheduler schedulerY0 = asl0VarCreate.y0();
        c8o.l(schedulerY0);
        return new aas(iqrVar, s4z0Var, fcz0Var, xrc0VarL2, n3d0VarC0, observableE0, schedulerO, schedulerY0);
    }

    public static etp b(dj5 dj5Var) {
        return new etp(dj5Var);
    }

    public static t700 c(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 16);
    }

    public static gzc0 d(ynb0 ynb0Var) {
        gzc0 gzc0Var = new gzc0((byte) 26);
        gzc0Var.b = ynb0Var;
        return gzc0Var;
    }

    public static l9g0 e(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 13);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static k9k0 f(kly0 kly0Var, jly0 jly0Var, jo80 jo80Var, kly0 kly0Var2, caq caqVar, kly0 kly0Var3) {
        k9k0 k9k0Var = new k9k0();
        k9k0Var.a = kly0Var;
        k9k0Var.b = jly0Var;
        k9k0Var.c = jo80Var;
        k9k0Var.d = kly0Var2;
        k9k0Var.e = caqVar;
        k9k0Var.f = kly0Var3;
        return k9k0Var;
    }

    public static vem0 g(jly0 jly0Var, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var, jly0 jly0Var2, jly0 jly0Var3, kly0 kly0Var2, kly0 kly0Var3, caq caqVar4, caq caqVar5, kly0 kly0Var4, jly0 jly0Var4, caq caqVar6) {
        vem0 vem0Var = new vem0();
        vem0Var.a = jly0Var;
        vem0Var.b = caqVar;
        vem0Var.c = caqVar2;
        vem0Var.d = caqVar3;
        vem0Var.e = kly0Var;
        vem0Var.f = jly0Var2;
        vem0Var.g = jly0Var3;
        vem0Var.h = kly0Var2;
        vem0Var.i = kly0Var3;
        vem0Var.j = caqVar4;
        vem0Var.k = caqVar5;
        vem0Var.l = kly0Var4;
        vem0Var.m = jly0Var4;
        vem0Var.n = caqVar6;
        return vem0Var;
    }

    public static olm0 h(caq caqVar, caq caqVar2, kly0 kly0Var) {
        olm0 olm0Var = new olm0();
        olm0Var.a = caqVar;
        olm0Var.b = caqVar2;
        olm0Var.c = kly0Var;
        return olm0Var;
    }

    public static qqm0 i(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var) {
        qqm0 qqm0Var = new qqm0();
        qqm0Var.a = r7qVar;
        qqm0Var.b = r7qVar2;
        qqm0Var.c = r7qVar3;
        qqm0Var.d = kly0Var;
        return qqm0Var;
    }

    public static wum0 j(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, jly0 jly0Var4, caq caqVar2, caq caqVar3, caq caqVar4) {
        wum0 wum0Var = new wum0();
        wum0Var.a = jly0Var;
        wum0Var.b = jly0Var2;
        wum0Var.c = jly0Var3;
        wum0Var.d = caqVar;
        wum0Var.e = jly0Var4;
        wum0Var.f = caqVar2;
        wum0Var.g = caqVar3;
        wum0Var.h = caqVar4;
        return wum0Var;
    }

    public static gzc0 k(ynb0 ynb0Var) {
        gzc0 gzc0Var = new gzc0((byte) 27);
        gzc0Var.b = ynb0Var;
        return gzc0Var;
    }

    public static gzc0 l(ynb0 ynb0Var) {
        gzc0 gzc0Var = new gzc0((byte) 28);
        gzc0Var.b = ynb0Var;
        return gzc0Var;
    }

    public static jn7 m(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 26)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e5b0 n(m1k0 m1k0Var, zlk0 zlk0Var, vkk0 vkk0Var, pnk0 pnk0Var, y5k0 y5k0Var, c6k0 c6k0Var, rjk0 rjk0Var) {
        return new e5b0(30, p7h.M(new qua0[]{m1k0Var, zlk0Var, vkk0Var, pnk0Var, y5k0Var, c6k0Var, rjk0Var}), (List) null);
    }

    public static oyj0 o(q7r0 q7r0Var, rxj0 rxj0Var) {
        sck1 sck1Var = q7r0Var.d.d;
        hce1 hce1Var = new hce1(sck1Var.o(), new myj0(rxj0Var.X), n9p1.s(sck1Var));
        tka0 tka0VarB = rc11.a.b(oyj0.class);
        String strO = tka0VarB.o();
        if (strO != null) {
            return hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        }
        hhg1.n("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static z9k0 p(b9q b9qVar, xjl0 xjl0Var) {
        return b9qVar.a(xjl0Var.b());
    }

    public static bck0 q(RetrofitMaker retrofitMaker) {
        return (bck0) retrofitMaker.createWebgateService(bck0.class, "android-playlist-mixing-endpointsimpl");
    }

    public static elk0 r(xm41 xm41Var) {
        return new elk0(xm41Var);
    }

    public static jtk0 s() {
        return new jtk0();
    }

    public static msm0 t(etp etpVar) {
        dj5 dj5Var = etpVar.a;
        yqg yqgVar = (yqg) dj5Var.b.get();
        dlp dlpVar = etpVar.b;
        fpa fpaVar = (fpa) dj5Var.d.get();
        return new msm0(yqgVar, dlpVar, etpVar.c, fpaVar, new rt4(false, qt4.b, dj5Var.c()), (sec1) dj5Var.f.get(), (d0u0) dj5Var.r.get());
    }

    public static vwm0 u(c2u0 c2u0Var, pjm0 pjm0Var) {
        return new vwm0(c2u0Var, pjm0Var, (byte) 0);
    }

    public static rr6 v(etp etpVar) {
        dj5 dj5Var = etpVar.a;
        return new rr6(new g23((t8u0) dj5Var.g.get(), (c3s) dj5Var.h.get(), dj5Var.l(), (byte) 28), (byte) 16);
    }

    public static mnk0 w(ov20 ov20Var, jbk0 jbk0Var) {
        return new mnk0(ov20Var, jbk0Var);
    }

    public static m6k0 x(kzp kzpVar) {
        return new m6k0(kzpVar, (byte) 3);
    }

    public static m6k0 y(nzp nzpVar) {
        return new m6k0(nzpVar, (byte) 5);
    }

    public static m6k0 z(ozp ozpVar) {
        return new m6k0(ozpVar, (byte) 0);
    }
}
