package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gr41 {
    public final int a;
    public final int b;

    public gr41(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr41)) {
            return false;
        }
        gr41 gr41Var = (gr41) obj;
        return this.a == gr41Var.a && this.b == gr41Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
