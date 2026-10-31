package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bo70 implements qua0 {
    public static final bo70 a = new bo70();

    public final void b(ses0 ses0Var) {
        jd0 jd0Var = jd0.v;
        int i = ses0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (ses0Var.g(i2)) {
                jh5 jh5VarH = ses0Var.h(i2);
                jh5VarH.getClass();
                if (u890.j(jh5VarH.a, jd0Var)) {
                    ses0Var.n(i2, new j3r((go70) jh5VarH.b));
                }
            }
        }
    }

    public final pua0 c(iu30 iu30Var) {
        ao70 ao70Var = new ao70();
        ao70Var.a = w7x.a;
        return ao70Var;
    }

    public final zjd1 d() {
        return jd0.v;
    }
}
