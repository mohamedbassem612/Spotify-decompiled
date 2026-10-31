package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s5m1 {
    public final boolean a;
    public final boolean b;

    public s5m1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5m1)) {
            return false;
        }
        s5m1 s5m1Var = (s5m1) obj;
        return this.a == s5m1Var.a && this.b == s5m1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
