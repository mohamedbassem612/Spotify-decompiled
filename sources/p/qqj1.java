package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qqj1 {
    public final boolean a;
    public final boolean b;

    public qqj1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqj1)) {
            return false;
        }
        qqj1 qqj1Var = (qqj1) obj;
        return this.a == qqj1Var.a && this.b == qqj1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
