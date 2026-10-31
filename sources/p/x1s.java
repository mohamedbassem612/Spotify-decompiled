package p;

import android.app.Activity;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x1s implements o5s {
    public final Activity a;
    public final z1s b;
    public final o1s c;
    public final q8h1 d;
    public final q8h1 e;
    public final g2z f;
    public final www0 g;
    public final ats h;
    public final c9n i;
    public final LinkedHashMap t = new LinkedHashMap();
    public final LinkedHashMap X = new LinkedHashMap();
    public final CompositeDisposable Y = new CompositeDisposable();

    public x1s(Activity activity, z1s z1sVar, o1s o1sVar, q8h1 q8h1Var, q8h1 q8h1Var2, g2z g2zVar, www0 www0Var, ats atsVar, c9n c9nVar) {
        tac0 tac0Var;
        this.a = activity;
        this.b = z1sVar;
        this.c = o1sVar;
        this.d = q8h1Var;
        this.e = q8h1Var2;
        this.f = g2zVar;
        this.g = www0Var;
        this.h = atsVar;
        this.i = c9nVar;
        gj5 gj5Var = activity instanceof gj5 ? (gj5) activity : null;
        if (gj5Var == null || (tac0Var = ((f0i) gj5Var).a) == null) {
            return;
        }
        tac0Var.a(this);
    }

    public final void a(hj70 hj70Var, boolean z) {
        LinkedHashMap linkedHashMap = this.t;
        List list = (List) linkedHashMap.get(hj70Var);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pw40) it.next()).a();
            }
        }
        linkedHashMap.remove(hj70Var);
        if (z) {
            this.a.finish();
        }
    }

    public final void b(hj70 hj70Var, pw40 pw40Var) {
        LinkedHashMap linkedHashMap = this.t;
        if (!linkedHashMap.containsKey(hj70Var)) {
            linkedHashMap.put(hj70Var, p7h.O(new pw40[]{pw40Var}));
            return;
        }
        List list = (List) linkedHashMap.get(hj70Var);
        if (list != null) {
            list.add(pw40Var);
        }
    }

    public final void onStop(iac0 iac0Var) {
        LinkedHashMap linkedHashMap = this.t;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((pw40) it2.next()).a();
            }
        }
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.X;
        Iterator it3 = linkedHashMap2.values().iterator();
        while (it3.hasNext()) {
            for (r1s r1sVar : (List) it3.next()) {
                u0a1 u0a1Var = r1sVar.b;
                if (!r1sVar.a.L && u0a1Var.q0()) {
                    u0a1Var.Y0();
                }
            }
        }
        linkedHashMap2.clear();
        this.Y.g();
    }
}
