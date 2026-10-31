package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z0e1 {
    public final int a;
    public final int b;

    public z0e1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0e1)) {
            return false;
        }
        z0e1 z0e1Var = (z0e1) obj;
        return this.a == z0e1Var.a && this.b == z0e1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
