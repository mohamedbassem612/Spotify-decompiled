package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tpc0 implements cqc0 {
    public final aqc0 a;
    public final rnc0 b;

    public tpc0(aqc0 aqc0Var, rnc0 rnc0Var) {
        this.a = aqc0Var;
        this.b = rnc0Var;
    }

    @Override // p.cqc0
    public final aqc0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpc0)) {
            return false;
        }
        tpc0 tpc0Var = (tpc0) obj;
        return u890.j(this.a, tpc0Var.a) && u890.j(this.b, tpc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
