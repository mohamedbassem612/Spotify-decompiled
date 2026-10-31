package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hsh0 {
    public final int a;
    public final int b;

    public hsh0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsh0)) {
            return false;
        }
        hsh0 hsh0Var = (hsh0) obj;
        return this.a == hsh0Var.a && this.b == hsh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
