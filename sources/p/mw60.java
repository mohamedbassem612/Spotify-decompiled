package p;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class mw60 implements jly0 {
    public static ve11 A(xm41 xm41Var, hb4 hb4Var) {
        return new ve11(eth.t(xm41Var, new huz((Object) null, (byte) 10), a9o.X0), hb4Var.i());
    }

    public static Observable B(o241 o241Var) {
        return ((p241) o241Var).b("catalogue").distinctUntilChanged().map(een.i1);
    }

    public static String C(ajg ajgVar) {
        return ajgVar.a();
    }

    public static String D(String str) {
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.MODEL;
        StringBuilder sbS = l1d.s(i, "Spotify/", str, " Android/", " (");
        sbS.append(str2);
        sbS.append(")");
        return gm50.y(sbS.toString());
    }

    public static rjp a(dkd dkdVar) {
        return new rjp(dkdVar);
    }

    public static t700 b(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 7);
    }

    public static eh50 c(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 4);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static lw60 d(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, jo80 jo80Var, caq caqVar2, caq caqVar3, r7q r7qVar4, caq caqVar4, caq caqVar5, caq caqVar6) {
        lw60 lw60Var = new lw60();
        lw60Var.a = r7qVar;
        lw60Var.b = r7qVar2;
        lw60Var.c = r7qVar3;
        lw60Var.d = caqVar;
        lw60Var.e = jo80Var;
        lw60Var.f = caqVar2;
        lw60Var.g = caqVar3;
        lw60Var.h = r7qVar4;
        lw60Var.i = caqVar4;
        lw60Var.j = caqVar5;
        lw60Var.k = caqVar6;
        return lw60Var;
    }

    public static dx60 e(r7q r7qVar, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, g5t g5tVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3) {
        dx60 dx60Var = new dx60();
        dx60Var.a = kly0Var;
        dx60Var.b = g5tVar;
        dx60Var.c = caqVar;
        dx60Var.d = kly0Var2;
        dx60Var.e = caqVar2;
        dx60Var.f = caqVar3;
        dx60Var.g = kly0Var3;
        dx60Var.h = r7qVar;
        dx60Var.i = caqVar4;
        return dx60Var;
    }

    public static af70 f(kly0 kly0Var, jly0 jly0Var, kly0 kly0Var2, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, kly0 kly0Var3, jly0 jly0Var5, jly0 jly0Var6, jly0 jly0Var7, jly0 jly0Var8, jly0 jly0Var9) {
        af70 af70Var = new af70();
        af70Var.a = kly0Var;
        af70Var.b = jly0Var;
        af70Var.c = kly0Var2;
        af70Var.d = jly0Var2;
        af70Var.e = jly0Var3;
        af70Var.f = jly0Var4;
        af70Var.g = kly0Var3;
        af70Var.h = jly0Var5;
        af70Var.i = jly0Var6;
        af70Var.j = jly0Var7;
        af70Var.k = jly0Var8;
        af70Var.l = jly0Var9;
        return af70Var;
    }

    public static kt70 g(jo80 jo80Var, caq caqVar, jly0 jly0Var, caq caqVar2, kly0 kly0Var, caq caqVar3, caq caqVar4, jly0 jly0Var2, kly0 kly0Var2, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, kly0 kly0Var3, jly0 jly0Var3, caq caqVar9) {
        kt70 kt70Var = new kt70();
        kt70Var.a = jo80Var;
        kt70Var.b = caqVar;
        kt70Var.c = jly0Var;
        kt70Var.d = caqVar2;
        kt70Var.e = kly0Var;
        kt70Var.f = caqVar3;
        kt70Var.g = caqVar4;
        kt70Var.h = jly0Var2;
        kt70Var.i = kly0Var2;
        kt70Var.j = caqVar5;
        kt70Var.k = caqVar6;
        kt70Var.l = caqVar7;
        kt70Var.m = caqVar8;
        kt70Var.n = kly0Var3;
        kt70Var.o = jly0Var3;
        kt70Var.f22p = caqVar9;
        return kt70Var;
    }

    public static ex70 h(jo80 jo80Var, kly0 kly0Var, caq caqVar, caq caqVar2, kly0 kly0Var2, r7q r7qVar, caq caqVar3) {
        ex70 ex70Var = new ex70();
        ex70Var.a = jo80Var;
        ex70Var.b = kly0Var;
        ex70Var.c = caqVar;
        ex70Var.d = caqVar2;
        ex70Var.e = kly0Var2;
        ex70Var.f = r7qVar;
        ex70Var.g = caqVar3;
        return ex70Var;
    }

    public static eh50 i(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 5);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static eh50 j(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 6);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static eh50 k(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 7);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static String l(Context context) {
        return upn1.k(context);
    }

    public static kcg m() {
        return new kcg();
    }

    public static kcg n() {
        return new kcg(new pob((byte) 6, false));
    }

    public static Configuration o(Context context) {
        return context.getResources().getConfiguration();
    }

    public static f5n p(fuz fuzVar) {
        return new f5n(fuzVar);
    }

    public static u9c0 q(dg30 dg30Var) {
        return cto1.q(dg30Var);
    }

    public static fuz r(rjp rjpVar) {
        fuz fuzVar = (fuz) rjpVar.b.get();
        c8o.m(fuzVar);
        return fuzVar;
    }

    public static do70 s(RetrofitMaker retrofitMaker) {
        return new do70(retrofitMaker);
    }

    public static dp70 t(yz4 yz4Var) {
        return new dp70(yz4Var.a());
    }

    public static gw70 u(kly0 kly0Var, caq caqVar, zk4 zk4Var) {
        if (zk4Var.b() > 0) {
            Object obj = caqVar.get();
            obj.getClass();
            return (gw70) obj;
        }
        Object obj2 = kly0Var.get();
        obj2.getClass();
        return (gw70) obj2;
    }

    public static ww70 v(RetrofitMaker retrofitMaker) {
        k370 k370Var = new k370();
        k370Var.i("https");
        k370Var.e("image-metadata.spotify.com");
        return (ww70) retrofitMaker.createCustomHostService(ww70.class, k370Var.b());
    }

    public static l7m0 w(Context context, l670 l670Var, boolean z) {
        return new l7m0(new nay(l670Var.d, (byte) 29), new hx40(context, z));
    }

    public static amm0 x(fuz fuzVar, dmm0 dmm0Var) {
        return new amm0(fuzVar, dmm0Var);
    }

    public static dmm0 y() {
        return new dmm0();
    }

    public static cxc z(w5b1 w5b1Var) {
        cxc cxcVarC = w5b1Var.f.c();
        c8o.m(cxcVarC);
        return cxcVarC;
    }
}
