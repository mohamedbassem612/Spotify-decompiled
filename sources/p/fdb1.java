package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class fdb1 implements jly0 {
    public static pjm1 A(bsq bsqVar) {
        l8a l8aVar = bsqVar.a;
        return new pjm1((ajg) l8aVar.b.get(), new f5u(), B((g420) l8aVar.a.get()));
    }

    public static hn60 B(g420 g420Var) {
        return new hn60(g420Var.a(), (byte) 1);
    }

    public static asq C(yt91 yt91Var) {
        return new asq(yt91Var);
    }

    public static bsq D(l8a l8aVar) {
        return new bsq(l8aVar);
    }

    public static uww0 a(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 21);
    }

    public static g561 b(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 15);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static zib1 c(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, caq caqVar, kly0 kly0Var, kly0 kly0Var2, gbp gbpVar, caq caqVar2) {
        zib1 zib1Var = new zib1();
        zib1Var.a = r7qVar;
        zib1Var.b = r7qVar2;
        zib1Var.c = r7qVar3;
        zib1Var.d = r7qVar4;
        zib1Var.e = caqVar;
        zib1Var.f = kly0Var;
        zib1Var.g = kly0Var2;
        zib1Var.h = gbpVar;
        zib1Var.i = caqVar2;
        return zib1Var;
    }

    public static jqb1 d(dma1 dma1Var, Random random) {
        return new jqb1(dma1Var, random);
    }

    public static g420 e(asq asqVar) {
        bpq bpqVar = asqVar.b;
        yt91 yt91Var = asqVar.a;
        return new g420(bpqVar, (Context) ((kly0) yt91Var.b).get(), (ajg) ((kly0) yt91Var.c).get());
    }

    public static gpm0 f(bsq bsqVar) {
        gpm0 gpm0Var = (gpm0) bsqVar.b.get();
        c8o.m(gpm0Var);
        return gpm0Var;
    }

    public static uh61 g(l7c l7cVar) {
        return new uh61(l7cVar, (byte) 19);
    }

    public static uh61 h(c9c c9cVar) {
        return new uh61(c9cVar, (byte) 20);
    }

    public static uh61 i(v9c v9cVar) {
        return new uh61(v9cVar, (byte) 21);
    }

    public static hq81 j(rzp rzpVar) {
        return new hq81(rzpVar, (byte) 26);
    }

    public static hq81 k(b1q b1qVar) {
        return new hq81(b1qVar, (byte) 23);
    }

    public static hq81 l(t2q t2qVar) {
        return new hq81(t2qVar, (byte) 25);
    }

    public static hq81 m(k3q k3qVar) {
        return new hq81(k3qVar, (byte) 24);
    }

    public static hq81 n(l3q l3qVar) {
        return new hq81(l3qVar, (byte) 29);
    }

    public static hq81 o(jbq jbqVar) {
        return new hq81(jbqVar, (byte) 22);
    }

    public static ifb1 p(uzp uzpVar) {
        return new ifb1((Object) uzpVar, (byte) 0);
    }

    public static ifb1 q(n0q n0qVar) {
        return new ifb1((Object) n0qVar, (byte) 1);
    }

    public static ifb1 r(k3q k3qVar) {
        return new ifb1((Object) k3qVar, (byte) 6);
    }

    public static ifb1 s(jbq jbqVar) {
        return new ifb1((Object) jbqVar, (byte) 2);
    }

    public static hq81 t(k3q k3qVar) {
        return new hq81(k3qVar, (byte) 28);
    }

    public static hq81 u(jbq jbqVar) {
        return new hq81(jbqVar, (byte) 27);
    }

    public static Observable v(kq41 kq41Var) {
        Observable observableI = yoi1.i(new h6a(kq41Var.a.a, (byte) 14), o6x.a);
        c8o.m(observableI);
        return observableI;
    }

    public static oyb1 w(RetrofitMaker retrofitMaker) {
        return (oyb1) retrofitMaker.createWebgateService(oyb1.class, "android-stickers-datasource-impl");
    }

    public static gma1 x(asq asqVar) {
        return new gma1(asqVar.b);
    }

    public static e4c1 y(RetrofitMaker retrofitMaker) {
        return (e4c1) retrofitMaker.createWebgateService(e4c1.class, "android-martini-martini-data-impl");
    }

    public static gtk1 z() {
        return new gtk1();
    }
}
