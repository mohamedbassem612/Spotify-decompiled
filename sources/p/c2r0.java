package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface c2r0 {
    static b2r0 c(c2r0 c2r0Var, qe41 qe41Var, n6r0 n6r0Var, qir0 qir0Var, g6h1 g6h1Var, int i) {
        if ((i & 32) != 0) {
            g6h1.Companion.getClass();
            g6h1Var = g6h1.e;
        }
        return c2r0Var.h(qe41Var, n6r0Var, qir0Var, null, false, g6h1Var);
    }

    qhe0 a(n6r0 n6r0Var, qir0 qir0Var, nar0 nar0Var, xj61 xj61Var, boolean z, g6h1 g6h1Var, boolean z2, u8h1 u8h1Var);

    default qhe0 b(n6r0 n6r0Var, qir0 qir0Var) {
        g6h1.Companion.getClass();
        return a(n6r0Var, qir0Var, null, null, false, g6h1.e, false, e8h1.b().i());
    }

    default wnh1 d(p6r0 p6r0Var, qir0 qir0Var) {
        g6h1.Companion.getClass();
        return g(p6r0Var, qir0Var, g6h1.e);
    }

    default b2r0 e(qe41 qe41Var, n6r0 n6r0Var, qir0 qir0Var) {
        return c(this, qe41Var, n6r0Var, qir0Var, null, 32);
    }

    default b2r0 f(qe41 qe41Var, p6r0 p6r0Var, qir0 qir0Var, nar0 nar0Var, g6h1 g6h1Var) {
        return h(qe41Var, p6r0Var, qir0Var, nar0Var, true, g6h1Var);
    }

    wnh1 g(p6r0 p6r0Var, qir0 qir0Var, g6h1 g6h1Var);

    b2r0 h(qe41 qe41Var, n6r0 n6r0Var, qir0 qir0Var, nar0 nar0Var, boolean z, g6h1 g6h1Var);
}
