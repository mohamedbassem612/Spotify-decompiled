package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class q03 implements jly0 {
    public static g21 A(kzp kzpVar) {
        return new g21(kzpVar, (byte) 23);
    }

    public static uxy0 B(dyo dyoVar) {
        x03 x03Var = dyoVar.a;
        return new uxy0(x03Var.a.get(), (Object) new na((g0l) x03Var.b.get(), (j0u) x03Var.c.get(), (byte) 16), (byte) 27);
    }

    public static xh61 C(gyo gyoVar) {
        xh61 xh61Var = (xh61) gyoVar.a.get();
        c8o.m(xh61Var);
        return xh61Var;
    }

    public static mta D() {
        return new mta((byte) 3, false);
    }

    public static dyo a(x03 x03Var) {
        return new dyo(x03Var);
    }

    public static pt0 b(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 11);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static p03 c(jo80 jo80Var, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, caq caqVar, g5t g5tVar, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5) {
        p03 p03Var = new p03();
        p03Var.a = jo80Var;
        p03Var.b = jly0Var;
        p03Var.c = jly0Var2;
        p03Var.d = kly0Var;
        p03Var.e = kly0Var2;
        p03Var.f = caqVar;
        p03Var.g = g5tVar;
        p03Var.h = jly0Var3;
        p03Var.i = jly0Var4;
        p03Var.j = jly0Var5;
        return p03Var;
    }

    public static x13 d(RetrofitMaker retrofitMaker) {
        return (x13) retrofitMaker.createWebgateService(x13.class, "android-playlist-creation-networkimpl");
    }

    public static r23 e(RetrofitMaker retrofitMaker) {
        return (r23) retrofitMaker.createWebgateService(r23.class, "android-playlist-creation-networkimpl");
    }

    public static gyo f(a2x0 a2x0Var) {
        gyo gyoVar = new gyo();
        gyoVar.a = xqu.b(new fyo((byte) 0));
        return gyoVar;
    }

    public static bl3 g(izo izoVar) {
        wj3 wj3Var = izoVar.a;
        return new bl3((Context) ((kly0) wj3Var.c).get(), (xrc0) ((kly0) wj3Var.X).get(), (wqg) ((kly0) wj3Var.t).get(), new vlo(new el3(xqu.a(izoVar.b), xqu.a(izoVar.c))), (joo) ((kly0) wj3Var.P0).get(), (agc0) ((kly0) wj3Var.h).get(), (uu00) ((kly0) wj3Var.e).get(), (q8n) ((kly0) wj3Var.d).get(), (ut71) ((kly0) wj3Var.Y).get(), (vwm1) ((kly0) wj3Var.Z).get(), izoVar.a(), (xrm1) ((kly0) wj3Var.i).get(), (ov20) ((kly0) wj3Var.N0).get(), (r241) ((kly0) wj3Var.O0).get(), new thu0((xrc0) ((kly0) wj3Var.X).get()));
    }

    public static el3 h(izo izoVar) {
        return new el3(xqu.a(izoVar.b), xqu.a(izoVar.c));
    }

    public static u9c0 i(dg30 dg30Var) {
        return cto1.q(dg30Var);
    }

    public static dgb j() {
        return new dgb((byte) 17);
    }

    public static g21 k(kzp kzpVar) {
        return new g21(kzpVar, (byte) 13);
    }

    public static g21 l(nzp nzpVar) {
        return new g21(nzpVar, (byte) 19);
    }

    public static g21 m(ozp ozpVar) {
        return new g21(ozpVar, (byte) 16);
    }

    public static g21 n(uzp uzpVar) {
        return new g21(uzpVar, (byte) 14);
    }

    public static g21 o(wzp wzpVar) {
        return new g21(wzpVar, (byte) 15);
    }

    public static g21 p(zzp zzpVar) {
        return new g21(zzpVar, (byte) 18);
    }

    public static g21 q(a0q a0qVar) {
        return new g21(a0qVar, (byte) 22);
    }

    public static g21 r(d0q d0qVar) {
        return new g21(d0qVar, (byte) 24);
    }

    public static c9r s(mta mtaVar) {
        return new c9r(mtaVar, (byte) 9);
    }

    public static c9r t(cua cuaVar) {
        return new c9r(cuaVar, (byte) 10);
    }

    public static c9r u(sua suaVar) {
        return new c9r(suaVar, (byte) 11);
    }

    public static c9r v(twa twaVar) {
        return new c9r(twaVar, (byte) 12);
    }

    public static c9r w(jxa jxaVar) {
        return new c9r(jxaVar, (byte) 13);
    }

    public static g21 x(kzp kzpVar) {
        return new g21(kzpVar, (byte) 17);
    }

    public static g21 y(nzp nzpVar) {
        return new g21(nzpVar, (byte) 21);
    }

    public static g21 z(ozp ozpVar) {
        return new g21(ozpVar, (byte) 20);
    }
}
