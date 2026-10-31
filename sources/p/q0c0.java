package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q0c0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public q0c0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0c0)) {
            return false;
        }
        q0c0 q0c0Var = (q0c0) obj;
        return this.a == q0c0Var.a && this.b == q0c0Var.b && this.c == q0c0Var.c && this.d == q0c0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
