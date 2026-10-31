package p;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class u1n0 implements jly0 {
    public static nm31 A(RetrofitMaker retrofitMaker) {
        nm31 nm31Var = (nm31) retrofitMaker.createWebgateService(nm31.class, "android-notifications-notifications");
        c8o.m(nm31Var);
        return nm31Var;
    }

    public static ewy0 B(ftp ftpVar) {
        ewy0 ewy0Var = (ewy0) ftpVar.f18p.get();
        c8o.m(ewy0Var);
        return ewy0Var;
    }

    public static f15 C(ftp ftpVar) {
        f15 f15Var = (f15) ftpVar.L.get();
        c8o.m(f15Var);
        return f15Var;
    }

    public static jtl1 D(ftp ftpVar) {
        jtl1 jtl1Var = (jtl1) ftpVar.M.get();
        c8o.m(jtl1Var);
        return jtl1Var;
    }

    public static zo5 a(ftp ftpVar) {
        zo5 zo5Var = (zo5) ftpVar.F.get();
        c8o.m(zo5Var);
        return zo5Var;
    }

    public static cd30 b(ftp ftpVar) {
        return new cd30((Context) ftpVar.a.c.get());
    }

    public static fzm0 c(xov0 xov0Var, ajg ajgVar) {
        return new fzm0(xov0Var, ((zym0) ajgVar).c());
    }

    public static oo70 d(ftp ftpVar) {
        oo70 oo70Var = (oo70) ftpVar.J.get();
        c8o.m(oo70Var);
        return oo70Var;
    }

    public static gzm0 e(ftp ftpVar) {
        gzm0 gzm0Var = (gzm0) ftpVar.G.get();
        c8o.m(gzm0Var);
        return gzm0Var;
    }

    public static c9n f(ftp ftpVar) {
        c9n c9nVar = (c9n) ftpVar.K.get();
        c8o.m(c9nVar);
        return c9nVar;
    }

    public static ftp g(ym7 ym7Var) {
        return new ftp(ym7Var);
    }

    public static stw0 h(vi2 vi2Var, ugb ugbVar, db4 db4Var) {
        return db4Var.b() ? new ntp(vi2Var, ugbVar) : new wyp(vi2Var);
    }

    public static Observable i(zwz0 zwz0Var) {
        Observable observableI = yoi1.i(new nwd(zwz0Var.d(), (byte) 28), o6x.a);
        c8o.m(observableI);
        return observableI;
    }

    public static be j(RxRouter rxRouter) {
        return new be(new CosmosTransport(new x430(rxRouter, (byte) 1)));
    }

    public static FirebaseMessaging k() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(wi20.c());
        }
        c8o.m(firebaseMessaging);
        return firebaseMessaging;
    }

    public static a690 l(q7r0 q7r0Var) {
        return new a690(new gn10(q7r0Var.a()));
    }

    public static rrl0 m() {
        return new rrl0();
    }

    public static url0 n() {
        r6h1 r6h1Var = r6h1.c;
        return new url0();
    }

    public static vhc o(e5l0 e5l0Var) {
        c8o.l((uu00) e5l0Var.b);
        return new vhc((byte) 16);
    }

    public static t7n0 p(tp91 tp91Var, ywv0 ywv0Var) {
        return new t7n0(tp91Var.a(new pp91((nn61) null, (qp91) null, 0, ywv0Var, 95)));
    }

    public static vno0 q(Context context) {
        return new vno0(context);
    }

    public static czh0 r(ypa ypaVar) {
        return new czh0(ypaVar, (byte) 27);
    }

    public static czh0 s(mta mtaVar) {
        return new czh0(mtaVar, (byte) 28);
    }

    public static czh0 t(cua cuaVar) {
        return new czh0(cuaVar, (byte) 29);
    }

    public static m6k0 u(b0q b0qVar) {
        return new m6k0(b0qVar, (byte) 12);
    }

    public static m6k0 v(q0q q0qVar) {
        return new m6k0(q0qVar, (byte) 8);
    }

    public static m6k0 w(q2q q2qVar) {
        return new m6k0(q2qVar, (byte) 9);
    }

    public static m6k0 x(k3q k3qVar) {
        return new m6k0(k3qVar, (byte) 11);
    }

    public static ywv0 y(p3q p3qVar, dg30 dg30Var) {
        return p3qVar.a(dg30Var.e0());
    }

    public static i8h1 z(q7r0 q7r0Var) {
        i8h1 i8h1VarH = cwl1.H(q7r0Var);
        c8o.m(i8h1VarH);
        return i8h1VarH;
    }
}
