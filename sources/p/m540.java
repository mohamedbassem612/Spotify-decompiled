package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m540 implements o540 {
    public final c98 a;
    public final xkk1 b;

    public m540(c98 c98Var, xkk1 xkk1Var) {
        this.a = c98Var;
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
        if (!(obj instanceof m540)) {
            return false;
        }
        m540 m540Var = (m540) obj;
        return this.a.equals(m540Var.a) && u890.j(this.b, m540Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
