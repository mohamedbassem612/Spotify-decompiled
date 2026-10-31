package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sm21 implements tm21 {
    public final c9 a;
    public final c9 b;
    public final boolean c;
    public final xm21 d;

    public sm21(c9 c9Var, c9 c9Var2, boolean z, xm21 xm21Var) {
        this.a = c9Var;
        this.b = c9Var2;
        this.c = z;
        this.d = xm21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm21)) {
            return false;
        }
        sm21 sm21Var = (sm21) obj;
        return u890.j(this.a, sm21Var.a) && u890.j(this.b, sm21Var.b) && this.c == sm21Var.c && this.d == sm21Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        c9 c9Var = this.b;
        return this.d.hashCode() + xcg1.g((iHashCode + (c9Var == null ? 0 : c9Var.hashCode())) * 31, 31, this.c);
    }
}
