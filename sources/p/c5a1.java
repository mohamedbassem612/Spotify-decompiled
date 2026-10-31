package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c5a1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final l4a0 d;

    public c5a1(boolean z, boolean z2, boolean z3, l4a0 l4a0Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = l4a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5a1)) {
            return false;
        }
        c5a1 c5a1Var = (c5a1) obj;
        return this.a == c5a1Var.a && this.b == c5a1Var.b && this.c == c5a1Var.c && this.d == c5a1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
