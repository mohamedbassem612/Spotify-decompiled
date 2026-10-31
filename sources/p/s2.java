package p;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class s2 implements jly0 {
    public static gwo a(mk mkVar) {
        return new gwo(mkVar);
    }

    public static sq b(izp izpVar) {
        return new jzp(izpVar.b, (byte) 0);
    }

    public static r2 c(jly0 jly0Var, caq caqVar, caq caqVar2, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4) {
        r2 r2Var = new r2();
        r2Var.a = jly0Var;
        r2Var.b = caqVar;
        r2Var.c = caqVar2;
        r2Var.d = jly0Var2;
        r2Var.e = jly0Var3;
        r2Var.f = jly0Var4;
        return r2Var;
    }

    public static v2 d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 0);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static ud e(RetrofitMaker retrofitMaker) {
        return (ud) retrofitMaker.createWebgateService(ud.class, "android-playlist-creation-playlist4serviceimpl");
    }

    public static ndr f(gwo gwoVar) {
        return new ndr((t2j0) gwoVar.a.n.get());
    }

    public static vdr g(gwo gwoVar) {
        return (vdr) gwoVar.e.get();
    }

    public static jq h(uq uqVar) {
        jq jqVarAccountSwitcher = uqVar.accountSwitcher();
        c8o.m(jqVarAccountSwitcher);
        return jqVarAccountSwitcher;
    }

    public static kr60 i(sq sqVar) {
        return new kr60(sqVar, (byte) 2);
    }

    public static uq j(kr60 kr60Var) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.spotify.accountswitching.switcher.dynamic.DynamicFeatureProviderImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("com.spotify.accountswitching.switcherimpl.AccountSwitcherProviderImpl");
            }
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        if (cls == null) {
            return new ffo0();
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        return declaredConstructors.length == 0 ? new ffo0() : (uq) ((Constructor) f46.j0(cls.getDeclaredConstructors())).newInstance((sq) kr60Var.b);
    }

    public static Set k(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, ynb0 ynb0Var10, ynb0 ynb0Var11) {
        return f46.S0(new ec0[]{new ec0(ynb0Var, (byte) 2), new ec0(ynb0Var2, (byte) 2), new ec0(ynb0Var3, (byte) 2), new ec0(ynb0Var4, (byte) 2), new ec0(ynb0Var5, (byte) 2), new ec0(ynb0Var6, (byte) 2), new ec0(ynb0Var7, (byte) 2), new ec0(ynb0Var8, (byte) 2), new ec0(ynb0Var9, (byte) 2), new ec0(ynb0Var10, (byte) 2), new ec0(ynb0Var11, (byte) 2)});
    }

    public static tq l(x34 x34Var) {
        return new tq(x34Var, (byte) 0);
    }

    public static vdr m(gwo gwoVar) {
        vdr vdrVar = (vdr) gwoVar.e.get();
        c8o.m(vdrVar);
        return vdrVar;
    }

    public static LayoutInflater n(Activity activity) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        c8o.m(layoutInflater);
        return layoutInflater;
    }

    public static Set o(gwo gwoVar) {
        Set setSingleton = Collections.singleton((u1o0) gwoVar.h.get());
        c8o.m(setSingleton);
        return setSingleton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashSet p(gu7 gu7Var, y4l y4lVar) {
        return new LinkedHashSet(p7h.M(new u3b1[]{gu7Var, y4lVar}));
    }

    public static Resources q(Activity activity) {
        return activity.getResources();
    }

    public static wfa1 r(eiq eiqVar, xfb0 xfb0Var, t8r0 t8r0Var, gw70 gw70Var, i8h1 i8h1Var, n1o0 n1o0Var, Scheduler scheduler, v35 v35Var) {
        k9r k9rVarA = eiqVar.a(Uri.parse("jp.co.sony.songpal.mdr://launch_settings"), h3.W0);
        return new wfa1(k9rVarA, xfb0Var, t8r0Var, gw70Var, new pcr(new kcr(k9rVarA, xfb0Var, i8h1Var, n1o0Var, scheduler)), v35Var);
    }

    public static wuw s(u741 u741Var) {
        return new wuw(Collections.singletonList(u741Var));
    }

    public static l8c0 t(gj5 gj5Var) {
        return (l8c0) gj5Var;
    }
}
