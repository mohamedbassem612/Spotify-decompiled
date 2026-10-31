package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k8r0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public k8r0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8r0)) {
            return false;
        }
        k8r0 k8r0Var = (k8r0) obj;
        return this.a == k8r0Var.a && this.b == k8r0Var.b && this.c == k8r0Var.c && this.d == k8r0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
