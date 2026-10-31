package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dnk1 {
    public final hnk1 a;
    public final boolean b;
    public final boolean c;

    public dnk1(hnk1 hnk1Var, boolean z, boolean z2) {
        this.a = hnk1Var;
        this.b = z;
        this.c = z2;
    }

    public static dnk1 a(dnk1 dnk1Var, boolean z, boolean z2, int i) {
        hnk1 hnk1Var = (i & 1) != 0 ? dnk1Var.a : gnk1.a;
        if ((i & 2) != 0) {
            z = dnk1Var.b;
        }
        if ((i & 4) != 0) {
            z2 = dnk1Var.c;
        }
        return new dnk1(hnk1Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnk1)) {
            return false;
        }
        dnk1 dnk1Var = (dnk1) obj;
        return u890.j(this.a, dnk1Var.a) && this.b == dnk1Var.b && this.c == dnk1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
