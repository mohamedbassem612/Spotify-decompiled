package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class skq0 extends klq0 {
    public static final skq0 c = new skq0(0, 1, 1);

    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        h311 h311Var = (h311) a9aVar.m(0);
        Set set = (Set) h72Var.b;
        if (set == null) {
            return;
        }
        oas0 oas0Var = new oas0(set);
        nen0 nen0Var = (nen0) h72Var.t;
        if (nen0Var == null) {
            long[] jArr = hj41.a;
            nen0Var = new nen0();
            h72Var.t = nen0Var;
        }
        nen0Var.m(h311Var, oas0Var);
        ((bfn0) h72Var.f).b(new b440(oas0Var, -1));
    }
}
