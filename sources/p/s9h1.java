package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s9h1 implements dbr0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public s9h1(int i, boolean z, boolean z2, boolean z3) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9h1)) {
            return false;
        }
        s9h1 s9h1Var = (s9h1) obj;
        return this.a == s9h1Var.a && this.b == s9h1Var.b && this.c == s9h1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, true);
    }
}
