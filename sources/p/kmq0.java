package p;

import android.app.Activity;
import android.os.Build;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class kmq0 implements jly0 {
    public static x0r0 A(mmo mmoVar) {
        return new x0r0(mmoVar);
    }

    public static h5z B(Activity activity) {
        return new h5z(activity, (byte) 3);
    }

    public static ucd C(gma1 gma1Var) {
        return new ucd(gma1Var.a(), (byte) 5);
    }

    public static yir0 D() {
        return new yir0();
    }

    public static j0q a(b1q b1qVar) {
        return new j0q(b1qVar.b);
    }

    public static jkp0 b(j0q j0qVar) {
        return new jkp0(j0qVar, (byte) 7);
    }

    public static t700 c(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 24);
    }

    public static l9g0 d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 18);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static xtr0 e(r7q r7qVar, caq caqVar, r7q r7qVar2, kly0 kly0Var, caq caqVar2) {
        xtr0 xtr0Var = new xtr0();
        xtr0Var.a = r7qVar;
        xtr0Var.b = caqVar;
        xtr0Var.c = r7qVar2;
        xtr0Var.d = kly0Var;
        xtr0Var.e = caqVar2;
        return xtr0Var;
    }

    public static bur0 f(r7q r7qVar, caq caqVar, r7q r7qVar2, r7q r7qVar3, gbp gbpVar, kly0 kly0Var, gbp gbpVar2, jo80 jo80Var) {
        bur0 bur0Var = new bur0();
        bur0Var.a = r7qVar;
        bur0Var.b = caqVar;
        bur0Var.c = r7qVar2;
        bur0Var.d = r7qVar3;
        bur0Var.e = gbpVar;
        bur0Var.f = kly0Var;
        bur0Var.g = gbpVar2;
        bur0Var.h = jo80Var;
        return bur0Var;
    }

    public static r0s0 g(qfl1 qfl1Var, Activity activity, k9p1 k9p1Var) {
        return new r0s0((Object) qfl1Var, (Object) activity, (Object) k9p1Var, (byte) 1);
    }

    public static rbs0 h(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, kly0 kly0Var8, kly0 kly0Var9, kly0 kly0Var10) {
        rbs0 rbs0Var = new rbs0();
        rbs0Var.a = kly0Var;
        rbs0Var.b = kly0Var2;
        rbs0Var.c = kly0Var3;
        rbs0Var.d = kly0Var4;
        rbs0Var.e = kly0Var5;
        rbs0Var.f = kly0Var6;
        rbs0Var.g = kly0Var7;
        rbs0Var.h = kly0Var8;
        rbs0Var.i = kly0Var9;
        rbs0Var.j = kly0Var10;
        return rbs0Var;
    }

    public static l9g0 i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 19);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static l3s0 j(jkp0 jkp0Var) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.spotify.liveroom.listeningpartymessagesource.dynamic.DynamicFeatureProviderImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("com.spotify.liveroom.listeningpartymessagesourceimpl.AblyDynamicProviderImpl");
            }
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        l3s0 l3s0VarPartyMessageSource = (cls != null ? (n3s0) ((Constructor) f46.j0(cls.getDeclaredConstructors())).newInstance((j0q) jkp0Var.b) : new ifo0()).partyMessageSource();
        c8o.m(l3s0VarPartyMessageSource);
        return l3s0VarPartyMessageSource;
    }

    public static uxf0 k(w0r0 w0r0Var) {
        return new uxf0(w0r0Var);
    }

    public static jeh l(swm0 swm0Var, wf2 wf2Var) {
        Set setSingleton = Collections.singleton(wf2Var);
        yc00 yc00Var = (yc00) swm0Var.b;
        b6p b6pVar = new b6p(yc00Var, setSingleton);
        kly0 kly0Var = yc00Var.h;
        vn41 vn41Var = (vn41) kly0Var.get();
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        ro30 ro30Var = new ro30(scheduler, vn41Var, (byte) 20);
        vn41 vn41Var2 = (vn41) kly0Var.get();
        RxAndroidPlugins.b(scheduler);
        ro30 ro30Var2 = new ro30(scheduler, vn41Var2, (byte) 20);
        vg30 vg30Var = (vg30) ((jly0) b6pVar.c).get();
        kly0 kly0Var2 = yc00Var.c;
        ajq0 ajq0Var = new ajq0(ro30Var, new mg30(ro30Var2, vg30Var, (bkl) kly0Var2.get(), (a2k) yc00Var.d.get()), (bkl) kly0Var2.get(), new n0r0());
        Iterator it = setSingleton.iterator();
        while (it.hasNext()) {
            ((it80) it.next()).a(ajq0Var);
        }
        tmc0 tmc0Var = new tmc0(Collections.unmodifiableList(new ArrayList(((r95) ajq0Var.e).a)), false);
        jeh jehVar = ((b4n0) yc00Var.g.get()).a() ? new jeh(tmc0Var, new tnm(brt.x(), brt.y())) : new jeh(tmc0Var, new dc31((byte) 4));
        jehVar.b.a(new xgc((byte) 18));
        jehVar.c = new eve0();
        return jehVar;
    }

    public static lyg m(Activity activity) {
        return Build.VERSION.SDK_INT >= 29 ? new y690(new q2o0(activity, (byte) 3)) : x690.d;
    }

    public static rkg n(gc31 gc31Var) {
        return (rkg) gc31Var.b(rkg.class);
    }

    public static gnq0 o() {
        return new gnq0();
    }

    public static n6r0 p(o6r0 o6r0Var) {
        n6r0 n6r0VarE = o6r0Var.e();
        c8o.m(n6r0VarE);
        return n6r0VarE;
    }

    public static iw4 q(zle1 zle1Var) {
        return new iw4(zle1Var);
    }

    public static mly0 r(j380 j380Var) {
        return ern1.y(j380Var);
    }

    public static mir0 s(lir0 lir0Var) {
        mir0 mir0VarC = lir0Var.c();
        c8o.m(mir0VarC);
        return mir0VarC;
    }

    public static enr0 t(p090 p090Var, RetrofitMaker retrofitMaker) {
        return (enr0) retrofitMaker.createWebgateService(enr0.class, "android-premiumaccountmanagement-endpoints", new fnr0(p090Var, (byte) 0));
    }

    public static enr0 u(p090 p090Var, RetrofitMaker retrofitMaker) {
        return (enr0) retrofitMaker.createEarlyAccessWebgateService(enr0.class, "android-premiumaccountmanagement-endpoints", new fnr0(p090Var, (byte) 1));
    }

    public static z2s0 v(RetrofitMaker retrofitMaker) {
        return (z2s0) retrofitMaker.createWebgateService(z2s0.class, "android-partner-apps-domain");
    }

    public static muz w(q7r0 q7r0Var, t8u0 t8u0Var) {
        return t8u0Var.a(q7r0Var.d.c.getLifecycle()).d();
    }

    public static cyp x(q7r0 q7r0Var, t8u0 t8u0Var) {
        return t8u0Var.a(q7r0Var.d.c.getLifecycle());
    }

    public static qpp0 y(lfb lfbVar) {
        return new qpp0(lfbVar, (byte) 4);
    }

    public static pjq0 z(d0q d0qVar) {
        return new pjq0(d0qVar, (byte) 2);
    }
}
