package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s49 extends c59 {
    public final le20 a;
    public final bnv0 b;

    public s49(le20 le20Var, bnv0 bnv0Var) {
        this.a = le20Var;
        this.b = bnv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s49)) {
            return false;
        }
        s49 s49Var = (s49) obj;
        return this.a.equals(s49Var.a) && this.b.equals(s49Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
