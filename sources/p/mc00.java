package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mc00 implements f961 {
    public final xb00 a;
    public final t2j0 b;

    public mc00(xb00 xb00Var, t2j0 t2j0Var) {
        this.a = xb00Var;
        this.b = t2j0Var;
        lc00 lc00Var = (lc00) xb00Var;
        synchronized (lc00Var) {
            try {
                if (lc00Var.O) {
                    lc00Var.e().a();
                } else {
                    boolean z = true;
                    lc00Var.O = true;
                    lc00Var.b().b();
                    ((kg60) lc00Var.q.getValue()).b();
                    ((fc00) lc00Var.C.getValue()).f();
                    if (lc00Var.c().h <= 0) {
                        z = false;
                    }
                    if (z) {
                        ((xc00) ((vc00) lc00Var.v.getValue())).b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void shutdown() {
        lc00 lc00Var = (lc00) this.a;
        synchronized (lc00Var) {
            if (lc00Var.O) {
                lc00Var.e().a();
                if (lc00Var.v.isInitialized()) {
                    xc00 xc00Var = (xc00) ((vc00) lc00Var.v.getValue());
                    if (!xc00Var.g.isDisposed()) {
                        xc00Var.g.dispose();
                    }
                }
                tks0 tks0VarB = lc00Var.b();
                synchronized (tks0VarB) {
                    if (!tks0VarB.e.isDisposed()) {
                        tks0VarB.e.dispose();
                    }
                }
                ((fc00) lc00Var.C.getValue()).g();
                ((kg60) lc00Var.q.getValue()).c();
                lc00Var.O = false;
            } else {
                lc00Var.e().a();
            }
        }
    }

    public final Object getApi() {
        return this;
    }
}
