package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b9q0 {
    public final rnd0 a;
    public final Boolean b;

    public b9q0(rnd0 rnd0Var, Boolean bool) {
        this.a = rnd0Var;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9q0)) {
            return false;
        }
        b9q0 b9q0Var = (b9q0) obj;
        return u890.j(this.a, b9q0Var.a) && u890.j(this.b, b9q0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
