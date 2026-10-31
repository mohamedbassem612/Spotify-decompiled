package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bsd1 {
    public final hfp1 a = new hfp1();

    public bsd1(y1t0 y1t0Var) {
        y1t0 y1t0Var2 = new y1t0(this, (byte) 28);
        ((hfp1) y1t0Var.b).d(dsd1.a, new yrg0(y1t0Var2, (byte) 25));
    }

    public final void a(Exception exc) {
        this.a.q(exc);
    }

    public final void b(Object obj) {
        this.a.r(obj);
    }

    public final boolean c(Exception exc) {
        hfp1 hfp1Var = this.a;
        hfp1Var.getClass();
        zod.t(exc, "Exception must not be null");
        synchronized (hfp1Var.a) {
            try {
                if (hfp1Var.c) {
                    return false;
                }
                hfp1Var.c = true;
                hfp1Var.f = exc;
                hfp1Var.b.d(hfp1Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.t(obj);
    }

    public bsd1() {
    }
}
