package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p7p0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public p7p0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7p0)) {
            return false;
        }
        p7p0 p7p0Var = (p7p0) obj;
        return this.a == p7p0Var.a && this.b == p7p0Var.b && this.c == p7p0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
