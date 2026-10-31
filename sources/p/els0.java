package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class els0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public els0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof els0)) {
            return false;
        }
        els0 els0Var = (els0) obj;
        return this.a == els0Var.a && this.b == els0Var.b && this.c == els0Var.c && this.d == els0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
