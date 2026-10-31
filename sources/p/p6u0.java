package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p6u0 {
    public final boolean a;
    public final boolean b;

    public p6u0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6u0)) {
            return false;
        }
        p6u0 p6u0Var = (p6u0) obj;
        return this.a == p6u0Var.a && this.b == p6u0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
