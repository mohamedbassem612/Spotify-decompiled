package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y0y0 {
    public final boolean a;
    public final boolean b;

    public y0y0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0y0)) {
            return false;
        }
        y0y0 y0y0Var = (y0y0) obj;
        return this.a == y0y0Var.a && this.b == y0y0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
