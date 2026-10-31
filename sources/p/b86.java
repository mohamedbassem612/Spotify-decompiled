package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b86 implements m86 {
    public final boolean a;
    public final z740 b;

    public b86(z740 z740Var, boolean z) {
        this.a = z;
        this.b = z740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b86)) {
            return false;
        }
        b86 b86Var = (b86) obj;
        return this.a == b86Var.a && u890.j(this.b, b86Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        z740 z740Var = this.b;
        return iHashCode + (z740Var == null ? 0 : z740Var.hashCode());
    }
}
