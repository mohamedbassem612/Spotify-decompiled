package p;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hnn0 implements iac0, sck1, ot50, qe41 {
    public final idd1 X;
    public w8c0 Y;
    public final we41 Z;
    public final Context a;
    public vnn0 b;
    public final Bundle c;
    public w8c0 d;
    public final pnn0 e;
    public final String f;
    public final Bundle g;
    public final tac0 h = new tac0(this, true);
    public final nt21 i = obg1.o(this);
    public boolean t;

    public hnn0(Context context, vnn0 vnn0Var, Bundle bundle, w8c0 w8c0Var, pnn0 pnn0Var, String str, Bundle bundle2) {
        this.a = context;
        this.b = vnn0Var;
        this.c = bundle;
        this.d = w8c0Var;
        this.e = pnn0Var;
        this.f = str;
        this.g = bundle2;
        idd1 idd1Var = new idd1(new gnn0(this, (byte) 0));
        this.X = new idd1(new gnn0(this, (byte) 1));
        this.Y = w8c0.b;
        this.Z = (we41) idd1Var.getValue();
    }

    @Override // p.ot50
    public final eck1 N() {
        return this.Z;
    }

    @Override // p.ot50
    public final wcn0 O() {
        wcn0 wcn0Var = new wcn0(0);
        Context context = this.a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            wcn0Var.a(dck1.d, application);
        }
        wcn0Var.a(a6o1.a, this);
        wcn0Var.a(a6o1.b, this);
        Bundle bundleA = a();
        if (bundleA != null) {
            wcn0Var.a(a6o1.c, bundleA);
        }
        return wcn0Var;
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(w8c0 w8c0Var) {
        this.Y = w8c0Var;
        c();
    }

    public final void c() {
        if (!this.t) {
            nt21 nt21Var = this.i;
            nt21Var.m();
            this.t = true;
            if (this.e != null) {
                a6o1.k(this);
            }
            nt21Var.n(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.Y.ordinal();
        tac0 tac0Var = this.h;
        if (iOrdinal < iOrdinal2) {
            tac0Var.i(this.d);
        } else {
            tac0Var.i(this.Y);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof hnn0)) {
            hnn0 hnn0Var = (hnn0) obj;
            Bundle bundle = hnn0Var.c;
            if (!this.f.equals(hnn0Var.f) || !u890.j(this.b, hnn0Var.b) || !u890.j(this.h, hnn0Var.h) || this.i.j() != hnn0Var.i.j()) {
                return false;
            }
            Bundle bundle2 = this.c;
            if (u890.j(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!u890.j(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.h;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.i.j().hashCode() + ((this.h.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // p.sck1
    public final rck1 o() {
        if (!this.t) {
            eg.m("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.h.i == w8c0.a) {
            eg.m("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        pnn0 pnn0Var = this.e;
        if (pnn0Var != null) {
            return pnn0Var.T(this.f);
        }
        eg.m("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        return null;
    }

    @Override // p.qe41
    public final oe41 p() {
        return this.i.j();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(hnn0.class.getSimpleName());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
