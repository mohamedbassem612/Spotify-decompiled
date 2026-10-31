package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vjo0 {
    public final int a;
    public final int b;

    public vjo0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjo0)) {
            return false;
        }
        vjo0 vjo0Var = (vjo0) obj;
        return this.a == vjo0Var.a && this.b == vjo0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
