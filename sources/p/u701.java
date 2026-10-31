package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u701 implements t701, qua0 {
    public final /* synthetic */ kkd1 a;
    public final /* synthetic */ d390 b;

    public u701(q8n q8nVar, dxy dxyVar, d390 d390Var) {
        this.b = d390Var;
        this.a = dm5.F(pwc0.w, q8nVar, new fbz0(dxyVar, (byte) 24), atz0.t, new p2z0(dxyVar, (lnm) null, (byte) 9), 8);
    }

    public final dmh1 a() {
        return new fmh1(this.a);
    }

    public final void b(ses0 ses0Var) {
        zjd1 zjd1Var = this.a.a;
        int i = ses0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (ses0Var.g(i2)) {
                jh5 jh5VarH = ses0Var.h(i2);
                jh5VarH.getClass();
                if (u890.j(jh5VarH.a, zjd1Var)) {
                    k8g1 k8g1Var = (k8g1) this.b.b.c((ga01) jh5VarH.b);
                    ses0Var.n(i2, k8g1Var != null ? new j3r(k8g1Var) : i3r.a);
                }
            }
        }
    }

    public final pua0 c(iu30 iu30Var) {
        return this.a.c(iu30Var);
    }

    public final zjd1 d() {
        return this.a.a;
    }
}
