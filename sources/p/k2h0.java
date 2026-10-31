package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k2h0 implements e4h0 {
    public final boolean a;
    public final boolean b;

    public k2h0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2h0)) {
            return false;
        }
        k2h0 k2h0Var = (k2h0) obj;
        return this.a == k2h0Var.a && this.b == k2h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
