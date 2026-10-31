package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gh5 {
    public final hh5 a;
    public final boolean b;
    public final boolean c;

    public gh5(hh5 hh5Var, boolean z, boolean z2) {
        this.a = hh5Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh5)) {
            return false;
        }
        gh5 gh5Var = (gh5) obj;
        return u890.j(this.a, gh5Var.a) && this.b == gh5Var.b && this.c == gh5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
