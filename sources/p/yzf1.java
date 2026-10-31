package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yzf1 {
    public final int a;
    public final int b;

    public yzf1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzf1)) {
            return false;
        }
        yzf1 yzf1Var = (yzf1) obj;
        return this.a == yzf1Var.a && this.b == yzf1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
