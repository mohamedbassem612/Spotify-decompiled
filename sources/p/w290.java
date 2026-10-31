package p;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.spotify.adonappopen.repository.storage.AdOnAppOpenDatabase;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class w290 implements jly0 {
    public static z0q A(a0q a0qVar) {
        return new z0q(a0qVar.a);
    }

    public static jl91 B(ml91 ml91Var) {
        return ml91Var.a;
    }

    public static ml91 C(z0q z0qVar) {
        il91 il91Var = (il91) ((jly0) new f0a(z0qVar).Q0).get();
        return new ml91(il91Var, (rqq) ((jly0) new ip31(z0qVar, il91Var).i).get());
    }

    public static f390 D(lvc lvcVar, pvc pvcVar, gg11 gg11Var, gg11 gg11Var2, gg11 gg11Var3) {
        return new f390(lvcVar, pvcVar, gg11Var3, gg11Var, gg11Var2);
    }

    public static eh50 a(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 9);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static c890 b(r7q r7qVar, gbp gbpVar, r7q r7qVar2, gbp gbpVar2, gbp gbpVar3, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, caq caqVar, gbp gbpVar4, r7q r7qVar6, kly0 kly0Var, caq caqVar2, kly0 kly0Var2, caq caqVar3, caq caqVar4) {
        c890 c890Var = new c890();
        c890Var.a = r7qVar;
        c890Var.b = gbpVar;
        c890Var.c = r7qVar2;
        c890Var.d = gbpVar2;
        c890Var.e = gbpVar3;
        c890Var.f = r7qVar3;
        c890Var.g = r7qVar4;
        c890Var.h = r7qVar5;
        c890Var.i = caqVar;
        c890Var.j = gbpVar4;
        c890Var.k = r7qVar6;
        c890Var.l = kly0Var;
        c890Var.m = caqVar2;
        c890Var.n = kly0Var2;
        c890Var.o = caqVar3;
        c890Var.f4p = caqVar4;
        return c890Var;
    }

    public static rs0 c(AdOnAppOpenDatabase adOnAppOpenDatabase) {
        rs0 rs0VarU = adOnAppOpenDatabase.u();
        c8o.m(rs0VarU);
        return rs0VarU;
    }

    public static AdOnAppOpenDatabase d(Context context) {
        bn31 bn31VarT = u890.t(context.getApplicationContext(), AdOnAppOpenDatabase.class, "ad_on_app_open_database");
        bn31VarT.n = false;
        bn31VarT.o = true;
        bn31VarT.p = true;
        return bn31VarT.c();
    }

    public static ys0 e(RetrofitMaker retrofitMaker) {
        return (ys0) retrofitMaker.createWebgateService(ys0.class, "android-ad-on-app-open-repository");
    }

    public static ne f(Context context, hm61 hm61Var, i5w0 i5w0Var) {
        return new ne(context.getApplicationContext(), hm61Var, (sz11) i5w0Var.a);
    }

    public static yna g(zjp zjpVar) {
        yna ynaVar = (yna) zjpVar.y.get();
        c8o.m(ynaVar);
        return ynaVar;
    }

    public static x290 h(m8b m8bVar) {
        return new x290(m8bVar);
    }

    public static pvc i() {
        return new pvc((byte) 0);
    }

    public static mrg1 j(Activity activity, byl bylVar, iyc0 iyc0Var, xrm1 xrm1Var, vlo vloVar, uu00 uu00Var, cfr cfrVar, sdz sdzVar, kt8 kt8Var, ix7 ix7Var, hce1 hce1Var, q8n q8nVar, c9n c9nVar) {
        vku vkuVar = new vku();
        wku wkuVar = new wku(vkuVar);
        tac0 tac0Var = ((f0i) ((gj5) activity)).a;
        if (u890.j(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            tac0Var.a(wkuVar);
        } else {
            activity.runOnUiThread(new nx30(tac0Var, wkuVar, (byte) 26));
        }
        return new mrg1(new dqm1(bylVar, sdzVar, cfrVar, iyc0Var, xrm1Var, vloVar, uu00Var, kt8Var, ix7Var, q8nVar, vkuVar), hce1Var, c9nVar);
    }

    public static int k(aj4 aj4Var) {
        int iOrdinal = aj4Var.f().ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 4;
        }
        eg.o();
        return 0;
    }

    public static w390 l(t8n t8nVar) {
        return new w390(t8nVar);
    }

    public static a m(qpj1 qpj1Var, cik1 cik1Var, ohm1 ohm1Var, g9l1 g9l1Var, bih1 bih1Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        h9m1 h9m1Var = new h9m1(cik1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c9m1.class), runSequentially.a(h9m1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u8m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i9m1(qpj1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b9m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new p9m1(ohm1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a9m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r9m1(ohm1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z8m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j9m1(g9l1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y8m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k9m1(g9l1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x8m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l9m1(g9l1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t8m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m9m1(qpj1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v8m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n9m1(bih1Var)));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public static sdz n(g7h g7hVar, x3v0 x3v0Var, f3h f3hVar) {
        return new sdz(g7hVar, x3v0Var, f3hVar.a());
    }

    public static y390 o(t8n t8nVar) {
        return new y390(t8nVar);
    }

    public static rf40 p(u9b u9bVar, p681 p681Var) {
        return new rf40(u9bVar, p681Var);
    }

    public static l7c q() {
        return new l7c((byte) 13);
    }

    public static fco0 r() {
        return new fco0();
    }

    public static tw20 s(nbc nbcVar) {
        return new tw20(nbcVar, (byte) 24);
    }

    public static yqu0 t(iz10 iz10Var, aj4 aj4Var) {
        return new yqu0(iz10Var, new gz10(aj4Var.b(), aj4Var.d(), aj4Var.c(), aj4Var.e()), (byte) 23);
    }

    public static o581 u(jqq jqqVar) {
        return new o581((p681) jqqVar.f.get(), jqqVar.c, jqqVar.d);
    }

    public static e690 v(u9b u9bVar, r7q r7qVar) {
        return new e690(u9bVar, r7qVar);
    }

    public static jqq w(gh40 gh40Var, eg40 eg40Var, lzn0 lzn0Var, u9c0 u9c0Var) {
        return new jqq(gh40Var, eg40Var, lzn0Var, u9c0Var);
    }

    public static u9c0 x(dg30 dg30Var) {
        return cto1.q(dg30Var);
    }

    public static p681 y(jqq jqqVar) {
        p681 p681Var = (p681) jqqVar.f.get();
        c8o.m(p681Var);
        return p681Var;
    }

    public static rqq z(ml91 ml91Var) {
        rqq rqqVar = ml91Var.b;
        c8o.m(rqqVar);
        return rqqVar;
    }
}
