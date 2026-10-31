package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fvn0 {
    public final lnn0 a;
    public final dg30 b;
    public final b4n0 c;
    public final IdentityHashMap d = new IdentityHashMap();
    public final IdentityHashMap e = new IdentityHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public fvn0(lnn0 lnn0Var, dg30 dg30Var, b4n0 b4n0Var) {
        this.a = lnn0Var;
        this.b = dg30Var;
        this.c = b4n0Var;
    }

    public final void a(zf30 zf30Var, int i, boolean z) {
        knn0 knn0VarA;
        if (this.c.d()) {
            View view = zf30Var.j1;
            onr0 onr0Var = onr0.a;
            if (view == null || (knn0VarA = jon1.o(view)) == null) {
                knn0VarA = this.a.a(onr0Var, i, null);
            }
            if (!(zf30Var instanceof gq80)) {
                b(zf30Var, knn0VarA, onr0Var);
                return;
            }
            knn0 knn0Var = (knn0) this.f.remove(onr0Var);
            IdentityHashMap identityHashMap = this.e;
            IdentityHashMap identityHashMap2 = this.d;
            if (knn0Var != null) {
                faa0 faa0Var = (faa0) identityHashMap2.remove(knn0Var);
                if (faa0Var != null) {
                    faa0Var.d(null);
                }
                identityHashMap.remove(knn0Var);
            }
            faa0 faa0Var2 = (faa0) identityHashMap2.remove(knn0VarA);
            if (faa0Var2 != null) {
                faa0Var2.d(null);
            }
            identityHashMap.remove(knn0VarA);
            if (z) {
                ((gq80) zf30Var).j();
            }
        }
    }

    public final void b(zf30 zf30Var, knn0 knn0Var, onr0 onr0Var) {
        mir0 mir0VarC;
        lik1 viewUri;
        lik1 lik1Var;
        knn0 knn0Var2;
        IdentityHashMap identityHashMap = this.e;
        IdentityHashMap identityHashMap2 = this.d;
        if (onr0Var != null && (knn0Var2 = (knn0) this.f.put(onr0Var, knn0Var)) != null && knn0Var2 != knn0Var) {
            faa0 faa0Var = (faa0) identityHashMap2.remove(knn0Var2);
            if (faa0Var != null) {
                faa0Var.d(null);
            }
            identityHashMap.remove(knn0Var2);
        }
        faa0 faa0Var2 = (faa0) identityHashMap2.remove(knn0Var);
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
        if (zf30Var instanceof gq80) {
            identityHashMap.remove(knn0Var);
            return;
        }
        lik1 lik1Var2 = (lik1) identityHashMap.remove(knn0Var);
        if (lik1Var2 != null) {
            knn0Var.a(new y9r0(lik1Var2));
        }
        try {
            lir0 lir0Var = zf30Var instanceof lir0 ? (lir0) zf30Var : null;
            mir0VarC = lir0Var != null ? lir0Var.c() : null;
        } catch (Exception e) {
            Logger.k("NavigationEventBridge: failed to get PageViewObservable", new Object[]{e});
            mir0VarC = null;
        }
        bbr0 bbr0Var = zf30Var instanceof bbr0 ? (bbr0) zf30Var : null;
        try {
            jik1 jik1Var = zf30Var instanceof jik1 ? (jik1) zf30Var : null;
            viewUri = jik1Var != null ? jik1Var.getViewUri() : null;
        } catch (Exception e2) {
            Logger.k("NavigationEventBridge: failed to get fallback viewUri", new Object[]{e2});
        }
        t1n0 t1n0Var = zf30Var instanceof t1n0 ? (t1n0) zf30Var : null;
        Object objA1 = t1n0Var != null ? t1n0Var.a1() : rqt0.u(new xr0(d5p1.h(zf30Var.s1.j), (byte) 24));
        dg30 dg30Var = this.b;
        if (bbr0Var == null) {
            lik1 lik1Var3 = viewUri;
            identityHashMap.put(knn0Var, lik1Var3);
            knn0Var.a(new x9r0(lik1Var3, null, mir0VarC, null, 8));
            identityHashMap2.put(knn0Var, c921.y(cto1.q(dg30Var), (o8n) null, 0, new k53(objA1, knn0Var, (lnm) null, (byte) 20), 3));
            return;
        }
        war0 war0VarB0 = bbr0Var.b0(bn70.class);
        en70 en70VarL = j0p1.l(war0VarB0);
        bn70 bn70Var = (bn70) war0VarB0.a();
        if (bn70Var == null || (lik1Var = bn70Var.b) == null) {
            lik1Var = viewUri;
        }
        identityHashMap.put(knn0Var, lik1Var);
        knn0Var.a(new x9r0(lik1Var, bn70Var != null ? bn70Var.a : null, mir0VarC, null, 8));
        identityHashMap2.put(knn0Var, c921.y(cto1.q(dg30Var), (o8n) null, 0, new pwm0(en70VarL, viewUri, this, knn0Var, war0VarB0, objA1, (lnm) null, (byte) 1), 3));
    }

    public final void c(onr0 onr0Var, int i) {
        knn0 knn0VarA = this.a.a(onr0Var, i, null);
        faa0 faa0Var = (faa0) this.d.remove(knn0VarA);
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.e.remove(knn0VarA);
        onr0Var.name();
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.get(onr0Var) == knn0VarA) {
            linkedHashMap.remove(onr0Var);
        }
        knn0VarA.b.invoke();
    }

    public final pnr0 d(zf30 zf30Var) {
        qnr0 qnr0VarA;
        if (this.c.d()) {
            try {
                bbr0 bbr0Var = zf30Var instanceof bbr0 ? (bbr0) zf30Var : null;
                if (bbr0Var != null && (qnr0VarA = bbr0Var.b0(qnr0.class).a()) != null) {
                    return qnr0VarA.a();
                }
            } catch (Exception e) {
                Logger.k("NavigationEventBridge: failed to resolve declared pane mode", new Object[]{e});
                return null;
            }
        }
        return null;
    }

    public final onr0 e(knn0 knn0Var) {
        for (onr0 onr0Var : onr0.values()) {
            for (int i : l1d.H(6)) {
                if (this.a.a(onr0Var, i, null) == knn0Var) {
                    return onr0Var;
                }
            }
        }
        return null;
    }

    public final void f(pnr0 pnr0Var) {
        if (this.c.d()) {
            onr0 onr0Var = onr0.a;
            if (pnr0Var != null) {
                int i = pnr0Var.b;
                onr0 onr0Var2 = pnr0Var.a;
                if (onr0Var2 != onr0Var || i != 5) {
                    c(onr0Var2, i);
                }
            }
            c(onr0Var, 5);
        }
    }
}
