package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wy00 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public wy00(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy00)) {
            return false;
        }
        wy00 wy00Var = (wy00) obj;
        return this.a == wy00Var.a && this.b == wy00Var.b && this.c == wy00Var.c && this.d == wy00Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
