package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x4p0 {
    public final msm0 a;
    public final n6r0 b;

    public x4p0(msm0 msm0Var, n6r0 n6r0Var) {
        this.a = msm0Var;
        this.b = n6r0Var;
    }

    public final z4p0 a(iac0 iac0Var) {
        z4p0 z4p0Var = new z4p0(this.a, this.b);
        x8c0 lifecycle = iac0Var.getLifecycle();
        synchronized (z4p0Var) {
            try {
                x8c0 x8c0Var = z4p0Var.d;
                if (x8c0Var != null) {
                    x8c0Var.d(z4p0Var.c);
                }
                z4p0Var.d = lifecycle;
                if (lifecycle != null) {
                    lifecycle.a(z4p0Var.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4p0Var;
    }
}
