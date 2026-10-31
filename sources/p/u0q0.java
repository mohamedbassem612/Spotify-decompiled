package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u0q0 {
    public final y4m a;
    public final r840 b;
    public final r0q0 c;
    public final ast0 d;

    public u0q0(y4m y4mVar, r840 r840Var, r0q0 r0q0Var, ast0 ast0Var) {
        this.a = y4mVar;
        this.b = r840Var;
        this.c = r0q0Var;
        this.d = ast0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0q0)) {
            return false;
        }
        u0q0 u0q0Var = (u0q0) obj;
        return this.a.equals(u0q0Var.a) && this.b.equals(u0q0Var.b) && this.c.equals(u0q0Var.c) && this.d == u0q0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
