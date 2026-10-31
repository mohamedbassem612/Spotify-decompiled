package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g8a1 {
    public final boolean a;
    public final boolean b;

    public g8a1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8a1)) {
            return false;
        }
        g8a1 g8a1Var = (g8a1) obj;
        return this.a == g8a1Var.a && this.b == g8a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
