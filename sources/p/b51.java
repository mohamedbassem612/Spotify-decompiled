package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b51 extends c51 {
    public final eo81 a;
    public final nsn0 b;

    public b51(eo81 eo81Var, lsn0 lsn0Var) {
        this.a = eo81Var;
        this.b = lsn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b51)) {
            return false;
        }
        b51 b51Var = (b51) obj;
        return u890.j(this.a, b51Var.a) && u890.j(this.b, b51Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nsn0 nsn0Var = this.b;
        return iHashCode + (nsn0Var == null ? 0 : nsn0Var.hashCode());
    }
}
