package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n540 implements o540 {
    public final w281 a;
    public final xkk1 b;

    public n540(w281 w281Var, xkk1 xkk1Var) {
        this.a = w281Var;
        this.b = xkk1Var;
    }

    @Override // p.o540
    public final xkk1 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n540)) {
            return false;
        }
        n540 n540Var = (n540) obj;
        return this.a.equals(n540Var.a) && u890.j(this.b, n540Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
