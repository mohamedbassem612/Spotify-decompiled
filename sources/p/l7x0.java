package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l7x0 implements p7x0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public l7x0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7x0)) {
            return false;
        }
        l7x0 l7x0Var = (l7x0) obj;
        return this.a == l7x0Var.a && this.b == l7x0Var.b && this.c == l7x0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
