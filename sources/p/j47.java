package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j47 {
    public final o17 a;
    public final x47 b;

    public j47(o17 o17Var, x47 x47Var) {
        this.a = o17Var;
        this.b = x47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j47)) {
            return false;
        }
        j47 j47Var = (j47) obj;
        return u890.j(this.a, j47Var.a) && u890.j(this.b, j47Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        this.b.getClass();
        return iHashCode - 1076158992;
    }

    public /* synthetic */ j47(o17 o17Var) {
        this(o17Var, x47.a);
    }
}
