package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class acg1 implements bcg1 {
    public final int a;
    public final int b;

    public acg1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acg1)) {
            return false;
        }
        acg1 acg1Var = (acg1) obj;
        return this.a == acg1Var.a && this.b == acg1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
