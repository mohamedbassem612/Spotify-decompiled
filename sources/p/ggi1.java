package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ggi1 {
    public final int a;
    public final Integer b;

    public ggi1(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggi1)) {
            return false;
        }
        ggi1 ggi1Var = (ggi1) obj;
        return this.a == ggi1Var.a && u890.j(this.b, ggi1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
