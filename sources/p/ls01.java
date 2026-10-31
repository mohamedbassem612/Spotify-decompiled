package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls01 extends vs01 {
    public final m9m a;
    public final br01 b;

    public ls01(m9m m9mVar, br01 br01Var) {
        this.a = m9mVar;
        this.b = br01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls01)) {
            return false;
        }
        ls01 ls01Var = (ls01) obj;
        return this.a == ls01Var.a && this.b == ls01Var.b;
    }

    public final int hashCode() {
        m9m m9mVar = this.a;
        int iHashCode = (m9mVar == null ? 0 : m9mVar.hashCode()) * 31;
        br01 br01Var = this.b;
        return iHashCode + (br01Var != null ? br01Var.hashCode() : 0);
    }
}
