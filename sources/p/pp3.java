package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pp3 extends hr3 {
    public final cob1 a;
    public final ou80 b;

    public pp3(cob1 cob1Var, ou80 ou80Var) {
        this.a = cob1Var;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp3)) {
            return false;
        }
        pp3 pp3Var = (pp3) obj;
        return this.a == pp3Var.a && u890.j(this.b, pp3Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ou80 ou80Var = this.b;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
