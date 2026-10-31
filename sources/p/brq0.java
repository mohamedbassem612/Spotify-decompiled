package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class brq0 {
    public final o2u0 a;
    public final o2u0 b;

    public brq0(o2u0 o2u0Var, o2u0 o2u0Var2) {
        this.a = o2u0Var;
        this.b = o2u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brq0)) {
            return false;
        }
        brq0 brq0Var = (brq0) obj;
        return this.a.equals(brq0Var.a) && u890.j(this.b, brq0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        o2u0 o2u0Var = this.b;
        return iHashCode + (o2u0Var == null ? 0 : o2u0Var.hashCode());
    }
}
