package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ep8 {
    public final dp8 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ep8(dp8 dp8Var, boolean z, boolean z2, boolean z3) {
        this.a = dp8Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep8)) {
            return false;
        }
        ep8 ep8Var = (ep8) obj;
        return this.a.equals(ep8Var.a) && this.b == ep8Var.b && this.c == ep8Var.c && this.d == ep8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
