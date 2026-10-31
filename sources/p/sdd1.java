package p;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class sdd1 implements jly0 {
    public static mgf1 A(RetrofitMaker retrofitMaker, yqg yqgVar, ucd ucdVar, Context context, joo jooVar) {
        jgf1 jgf1Var = (jgf1) retrofitMaker.createWebgateService(jgf1.class, "android-reinvent-free-topup-eligibility-impl");
        fns fnsVar = igu.a;
        return new mgf1(jgf1Var, yqgVar, smo1.e(flo1.l(b3s.c, guo1.B())), ucdVar, context, jooVar);
    }

    public static String B(ajg ajgVar) {
        return ((zym0) ajgVar).e();
    }

    public static kcs C() {
        return new kcs();
    }

    public static ucd D(gma1 gma1Var) {
        return new ucd(gma1Var.a(), (byte) 6);
    }

    public static sva a(ynb0 ynb0Var) {
        return new sva(ynb0Var, (byte) 3);
    }

    public static uww0 b(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 24);
    }

    public static k4z0 c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 16);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static g561 d(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 23);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static ttd1 e(kly0 kly0Var, kly0 kly0Var2, g5t g5tVar, caq caqVar, caq caqVar2, kly0 kly0Var3, kly0 kly0Var4, caq caqVar3) {
        ttd1 ttd1Var = new ttd1();
        ttd1Var.a = kly0Var;
        ttd1Var.b = kly0Var2;
        ttd1Var.c = g5tVar;
        ttd1Var.d = caqVar;
        ttd1Var.e = caqVar2;
        ttd1Var.f = kly0Var3;
        ttd1Var.g = kly0Var4;
        ttd1Var.h = caqVar3;
        return ttd1Var;
    }

    public static iyd1 f(caq caqVar, jly0 jly0Var, jly0 jly0Var2) {
        iyd1 iyd1Var = new iyd1();
        iyd1Var.a = jly0Var;
        iyd1Var.b = jly0Var2;
        iyd1Var.c = caqVar;
        return iyd1Var;
    }

    public static ryd1 g(jly0 jly0Var, jly0 jly0Var2) {
        ryd1 ryd1Var = new ryd1();
        ryd1Var.a = jly0Var;
        ryd1Var.b = jly0Var2;
        return ryd1Var;
    }

    public static cle1 h(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5) {
        cle1 cle1Var = new cle1();
        cle1Var.a = jly0Var;
        cle1Var.b = jly0Var2;
        cle1Var.c = jly0Var3;
        cle1Var.d = caqVar;
        cle1Var.e = caqVar2;
        cle1Var.f = caqVar3;
        cle1Var.g = caqVar4;
        cle1Var.h = caqVar5;
        return cle1Var;
    }

    public static hle1 i(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, jly0 jly0Var4, caq caqVar2, caq caqVar3, jly0 jly0Var5) {
        hle1 hle1Var = new hle1();
        hle1Var.a = jly0Var;
        hle1Var.b = jly0Var2;
        hle1Var.c = jly0Var3;
        hle1Var.d = caqVar;
        hle1Var.e = jly0Var4;
        hle1Var.f = caqVar2;
        hle1Var.g = caqVar3;
        hle1Var.h = jly0Var5;
        return hle1Var;
    }

    public static nle1 j(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, caq caqVar2, jo80 jo80Var, g5t g5tVar, caq caqVar3, caq caqVar4, jly0 jly0Var4) {
        nle1 nle1Var = new nle1();
        nle1Var.a = jly0Var;
        nle1Var.b = jly0Var2;
        nle1Var.c = jly0Var3;
        nle1Var.d = caqVar;
        nle1Var.e = caqVar2;
        nle1Var.f = jo80Var;
        nle1Var.g = g5tVar;
        nle1Var.h = caqVar3;
        nle1Var.i = caqVar4;
        nle1Var.j = jly0Var4;
        return nle1Var;
    }

    public static zuf1 k(caq caqVar, caq caqVar2, caq caqVar3, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, kly0 kly0Var) {
        zuf1 zuf1Var = new zuf1();
        zuf1Var.a = jly0Var;
        zuf1Var.b = jly0Var2;
        zuf1Var.c = jly0Var3;
        zuf1Var.d = caqVar;
        zuf1Var.e = jly0Var4;
        zuf1Var.f = caqVar2;
        zuf1Var.g = kly0Var;
        zuf1Var.h = caqVar3;
        return zuf1Var;
    }

    public static k4z0 l(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 17);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static g561 m(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 24);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static g561 n(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 25);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static l2r o(yko ykoVar, String str) {
        return ykoVar.a(null, new vdm(str, (lnm) null, (byte) 4));
    }

    public static atq p(tbn tbnVar) {
        return new atq(new k2q(tbnVar), (byte) 1);
    }

    public static hlf1 q(dr41 dr41Var) {
        return new hlf1(new lbq(dr41Var));
    }

    public static uh61 r(xgc xgcVar) {
        return new uh61(xgcVar, (byte) 29);
    }

    public static ifb1 s(h0q h0qVar) {
        return new ifb1(h0qVar, (byte) 19);
    }

    public static void t() {
        c8o.m(Build.BRAND);
    }

    public static String u(Configuration configuration) {
        String strValueOf = String.valueOf(configuration.fontScale);
        c8o.m(strValueOf);
        return strValueOf;
    }

    public static String v(Configuration configuration) {
        return fhe0.d(configuration.getLocales()).a.a.toString();
    }

    public static void w() {
        c8o.m(Build.MODEL);
    }

    public static String x(Configuration configuration) {
        return configuration.orientation == 2 ? "landscape" : "portrait";
    }

    public static ced1 y(vql1 vql1Var) {
        return Build.VERSION.SDK_INT >= 30 ? new eed1(vql1Var) : new fed1();
    }

    public static zle1 z(ooe1 ooe1Var) {
        s45 s45Var = (zle1) cme1.a.getValue();
        s45 s45Var2 = s45Var;
        s45Var2.c = ooe1Var;
        fn31.T((c9n) s45Var2.d.getValue(), (o8n) null, 0, new kk(s45Var2, (lnm) null, (byte) 10), 3);
        return s45Var;
    }
}
