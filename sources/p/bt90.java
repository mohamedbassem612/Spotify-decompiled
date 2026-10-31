package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bt90 implements ct90 {
    public final boolean a;
    public final boolean b;

    public bt90(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt90)) {
            return false;
        }
        bt90 bt90Var = (bt90) obj;
        return this.a == bt90Var.a && this.b == bt90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
