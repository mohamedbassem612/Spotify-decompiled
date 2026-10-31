package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tfr0 {
    public final Integer a;
    public final y6h1 b;

    public /* synthetic */ tfr0(Integer num, y6h1 y6h1Var, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : y6h1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfr0)) {
            return false;
        }
        tfr0 tfr0Var = (tfr0) obj;
        return u890.j(this.a, tfr0Var.a) && u890.j(this.b, tfr0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        y6h1 y6h1Var = this.b;
        return iHashCode + (y6h1Var != null ? y6h1Var.hashCode() : 0);
    }

    public tfr0(Integer num, y6h1 y6h1Var) {
        this.a = num;
        this.b = y6h1Var;
    }
}
