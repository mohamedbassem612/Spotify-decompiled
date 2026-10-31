package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g8f1 {
    public final boolean a;
    public final boolean b;

    public g8f1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8f1)) {
            return false;
        }
        g8f1 g8f1Var = (g8f1) obj;
        return this.a == g8f1Var.a && this.b == g8f1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
