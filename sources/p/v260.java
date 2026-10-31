package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v260 {
    public final tob1 a;
    public final tob1 b;

    public v260(ven0 ven0Var, tob1 tob1Var) {
        this.a = ven0Var;
        this.b = tob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v260)) {
            return false;
        }
        v260 v260Var = (v260) obj;
        return this.a.equals(v260Var.a) && u890.j(this.b, v260Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
