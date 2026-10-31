package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lsb1 {
    public final ksb1 a;
    public final Integer b;

    public lsb1(ksb1 ksb1Var, Integer num) {
        this.a = ksb1Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsb1)) {
            return false;
        }
        lsb1 lsb1Var = (lsb1) obj;
        return u890.j(this.a, lsb1Var.a) && u890.j(this.b, lsb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
