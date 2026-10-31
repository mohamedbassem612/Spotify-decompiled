package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w2x0 extends z2x0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public w2x0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2x0)) {
            return false;
        }
        w2x0 w2x0Var = (w2x0) obj;
        return this.a == w2x0Var.a && this.b == w2x0Var.b && this.c == w2x0Var.c && this.d == w2x0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
