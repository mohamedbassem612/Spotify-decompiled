package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zbg1 implements bcg1 {
    public final int a;
    public final int b;

    public zbg1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbg1)) {
            return false;
        }
        zbg1 zbg1Var = (zbg1) obj;
        return this.a == zbg1Var.a && this.b == zbg1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
