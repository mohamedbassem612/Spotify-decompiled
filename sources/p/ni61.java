package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ni61 {
    public final y2g0 a;
    public final Object b = new Object();
    public mi61 c;

    public ni61(y2g0 y2g0Var) {
        this.a = y2g0Var;
    }

    public final void a(mi61 mi61Var, Exception exc, String str) {
        synchronized (this.b) {
            try {
                mi61 mi61Var2 = this.c;
                if ((mi61Var2 != null ? mi61Var2.a : null) == mi61Var.a) {
                    mi61Var.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (exc == null) {
            n57.s(str);
        } else {
            n57.t(str, exc);
        }
        try {
            yh0 yh0Var = mi61Var.b;
            yh0Var.a.z();
            yh0Var.d();
        } catch (Exception e) {
            n57.t("Session UI recovery failed", e);
        }
    }

    public final m021 b(yh0 yh0Var) {
        Object obj = new Object();
        synchronized (this.b) {
            this.c = new mi61(obj, yh0Var);
        }
        return new m021(this, obj, (byte) 29);
    }
}
