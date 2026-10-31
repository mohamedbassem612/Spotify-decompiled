package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oll1 {
    public final agj0 a;
    public final fll1 b;
    public nll1 c = mll1.a;

    public oll1(agj0 agj0Var, fll1 fll1Var) {
        this.a = agj0Var;
        this.b = fll1Var;
    }

    public final void a() {
        f8h1 f8h1Var;
        synchronized (this) {
            try {
                nll1 nll1Var = this.c;
                if (nll1Var instanceof jll1) {
                    f8h1Var = ((jll1) nll1Var).a;
                    this.c = new lll1(((jll1) nll1Var).a.a);
                } else {
                    if (!nll1Var.equals(mll1.a) && !nll1Var.equals(kll1.a) && !(nll1Var instanceof lll1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f8h1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f8h1Var != null) {
            f8h1Var.a();
        }
    }
}
