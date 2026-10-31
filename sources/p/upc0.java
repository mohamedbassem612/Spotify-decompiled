package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class upc0 implements cqc0 {
    public final aqc0 a;
    public final rnc0 b;

    public upc0(aqc0 aqc0Var, rnc0 rnc0Var) {
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
        if (!(obj instanceof upc0)) {
            return false;
        }
        upc0 upc0Var = (upc0) obj;
        return u890.j(this.a, upc0Var.a) && u890.j(this.b, upc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
