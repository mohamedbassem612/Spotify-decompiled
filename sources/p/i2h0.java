package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i2h0 implements e4h0 {
    public final long a;
    public final l28 b;

    public i2h0(long j, l28 l28Var) {
        this.a = j;
        this.b = l28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2h0)) {
            return false;
        }
        i2h0 i2h0Var = (i2h0) obj;
        return this.a == i2h0Var.a && this.b.equals(i2h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
