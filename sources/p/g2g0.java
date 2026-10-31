package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g2g0 implements b2g0 {
    public final boolean a;
    public final boolean b;

    public g2g0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2g0)) {
            return false;
        }
        g2g0 g2g0Var = (g2g0) obj;
        return this.a == g2g0Var.a && this.b == g2g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
