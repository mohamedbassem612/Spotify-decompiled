package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j3t0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public j3t0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3t0)) {
            return false;
        }
        j3t0 j3t0Var = (j3t0) obj;
        return this.a == j3t0Var.a && this.b == j3t0Var.b && this.c == j3t0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
