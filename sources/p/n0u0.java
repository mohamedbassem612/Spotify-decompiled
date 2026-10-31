package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n0u0 {
    public final boolean a;
    public final boolean b;

    public n0u0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0u0)) {
            return false;
        }
        n0u0 n0u0Var = (n0u0) obj;
        return this.a == n0u0Var.a && this.b == n0u0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
