package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x0p0 extends b1p0 {
    public final boolean a;
    public final boolean b;

    public x0p0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0p0)) {
            return false;
        }
        x0p0 x0p0Var = (x0p0) obj;
        return this.a == x0p0Var.a && this.b == x0p0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
