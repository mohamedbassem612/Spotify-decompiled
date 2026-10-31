package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iu80 extends rc2 {
    public final int d;
    public final int e;

    public iu80(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu80)) {
            return false;
        }
        iu80 iu80Var = (iu80) obj;
        return this.d == iu80Var.d && this.e == iu80Var.e;
    }

    public final int hashCode() {
        return l1d.C(1) + ab80.k(this.e, Integer.hashCode(this.d) * 31, 31);
    }
}
