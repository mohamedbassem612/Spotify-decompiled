package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dt01 {
    public final m9m a;
    public final br01 b;
    public final c380 c;

    public dt01(m9m m9mVar, br01 br01Var, c380 c380Var) {
        this.a = m9mVar;
        this.b = br01Var;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt01)) {
            return false;
        }
        dt01 dt01Var = (dt01) obj;
        return this.a == dt01Var.a && this.b == dt01Var.b && u890.j(this.c, dt01Var.c);
    }

    public final int hashCode() {
        m9m m9mVar = this.a;
        int iHashCode = (m9mVar == null ? 0 : m9mVar.hashCode()) * 31;
        br01 br01Var = this.b;
        return this.c.hashCode() + ((iHashCode + (br01Var != null ? br01Var.hashCode() : 0)) * 31);
    }
}
