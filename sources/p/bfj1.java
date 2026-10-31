package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bfj1 {
    public final int a;
    public final int b;

    public bfj1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfj1)) {
            return false;
        }
        bfj1 bfj1Var = (bfj1) obj;
        return this.a == bfj1Var.a && this.b == bfj1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
