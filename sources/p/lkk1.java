package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lkk1 {
    public final int a;
    public final int b;

    public lkk1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkk1)) {
            return false;
        }
        lkk1 lkk1Var = (lkk1) obj;
        return this.a == lkk1Var.a && this.b == lkk1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
