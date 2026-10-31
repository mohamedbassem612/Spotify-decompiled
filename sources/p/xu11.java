package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xu11 implements qad1 {
    public final yt11 a;
    public final jmb1 b;
    public final iu30 c;

    public xu11(yt11 yt11Var, jmb1 jmb1Var, iu30 iu30Var) {
        this.a = yt11Var;
        this.b = jmb1Var;
        this.c = iu30Var;
    }

    @Override // p.qad1
    public final m9d1 a() {
        vu11 vu11VarB;
        yt11 yt11Var = this.a;
        s9d1 s9d1VarB = yt11Var != null ? yt11Var.b() : null;
        q9d1 q9d1Var = s9d1VarB instanceof q9d1 ? (q9d1) s9d1VarB : null;
        if (q9d1Var == null || (vu11VarB = q9d1Var.b()) == null) {
            return null;
        }
        if (!this.b.k) {
            vu11VarB = null;
        }
        if (vu11VarB != null) {
            return new m9d1(vu11VarB.a(), vu11VarB.c(), new wu11(this, (byte) 0));
        }
        return null;
    }

    @Override // p.qad1
    public final m9d1 b() {
        vu11 vu11VarA;
        yt11 yt11Var = this.a;
        s9d1 s9d1VarB = yt11Var != null ? yt11Var.b() : null;
        q9d1 q9d1Var = s9d1VarB instanceof q9d1 ? (q9d1) s9d1VarB : null;
        if (q9d1Var == null || (vu11VarA = q9d1Var.a()) == null) {
            return null;
        }
        if (!this.b.l) {
            vu11VarA = null;
        }
        if (vu11VarA != null) {
            return new m9d1(vu11VarA.a(), vu11VarA.c(), new wu11(this, (byte) 1));
        }
        return null;
    }
}
