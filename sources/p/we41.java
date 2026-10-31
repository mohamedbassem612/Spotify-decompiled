package p;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class we41 extends gck1 implements eck1 {
    public final Application a;
    public final dck1 b;
    public final Bundle c;
    public final x8c0 d;
    public final oe41 e;

    public we41(Application application, qe41 qe41Var, Bundle bundle) {
        this.e = qe41Var.p();
        this.d = qe41Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        this.b = application != null ? e9p1.i(application) : new dck1(null);
    }

    @Override // p.eck1
    public final xbk1 a(tka0 tka0Var, wcn0 wcn0Var) {
        return c(((wdg) tka0Var).n(), wcn0Var);
    }

    @Override // p.eck1
    public final xbk1 b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        hhg1.n("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // p.eck1
    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        LinkedHashMap linkedHashMap = wcn0Var.a;
        String str = (String) linkedHashMap.get(hck1.b);
        if (str == null) {
            eg.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(a6o1.a) == null || linkedHashMap.get(a6o1.b) == null) {
            if (this.d != null) {
                return e(cls, str);
            }
            eg.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(dck1.d);
        boolean zIsAssignableFrom = m75.class.isAssignableFrom(cls);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? xe41.c(cls, xe41.b()) : xe41.c(cls, xe41.a());
        if (constructorC == null) {
            return this.b.c(cls, wcn0Var);
        }
        return (!zIsAssignableFrom || application == null) ? xe41.d(cls, constructorC, new Object[]{a6o1.j(wcn0Var)}) : xe41.d(cls, constructorC, new Object[]{application, a6o1.j(wcn0Var)});
    }

    @Override // p.gck1
    public final void d(xbk1 xbk1Var) {
        x8c0 x8c0Var = this.d;
        if (x8c0Var != null) {
            oe41 oe41Var = this.e;
            oe41Var.getClass();
            aqo1.o(xbk1Var, oe41Var, x8c0Var);
        }
    }

    public final xbk1 e(Class cls, String str) {
        x8c0 x8c0Var = this.d;
        if (x8c0Var == null) {
            hhg1.h("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = m75.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? xe41.c(cls, xe41.b()) : xe41.c(cls, xe41.a());
        if (constructorC == null) {
            if (application != null) {
                return this.b.b(cls);
            }
            g9p1.t();
            return yon1.m1(cls);
        }
        oe41 oe41Var = this.e;
        oe41Var.getClass();
        AutoCloseable autoCloseableQ = aqo1.q(oe41Var, x8c0Var, str, this.c);
        xbk1 xbk1VarD = (!zIsAssignableFrom || application == null) ? xe41.d(cls, constructorC, new Object[]{autoCloseableQ.c()}) : xe41.d(cls, constructorC, new Object[]{application, autoCloseableQ.c()});
        xbk1VarD.P("androidx.lifecycle.savedstate.vm.tag", autoCloseableQ);
        return xbk1VarD;
    }

    public we41() {
        this.b = new dck1(null);
    }
}
