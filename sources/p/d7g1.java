package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d7g1 {
    public final xkk1 a;
    public final jo70 b;

    public d7g1(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = xkk1Var;
        this.b = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7g1)) {
            return false;
        }
        d7g1 d7g1Var = (d7g1) obj;
        return this.a.equals(d7g1Var.a) && u890.j(this.b, d7g1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        return iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode());
    }
}
