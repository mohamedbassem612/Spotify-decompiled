package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class us81 implements kt81 {
    public final xnu a;
    public final q1g1 b;

    public us81(xnu xnuVar, q1g1 q1g1Var) {
        this.a = xnuVar;
        this.b = q1g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us81)) {
            return false;
        }
        us81 us81Var = (us81) obj;
        return u890.j(this.a, us81Var.a) && u890.j(this.b, us81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
