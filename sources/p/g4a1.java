package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g4a1 implements h4a1 {
    public final boolean a;
    public final boolean b;

    public g4a1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4a1)) {
            return false;
        }
        g4a1 g4a1Var = (g4a1) obj;
        return this.a == g4a1Var.a && this.b == g4a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
