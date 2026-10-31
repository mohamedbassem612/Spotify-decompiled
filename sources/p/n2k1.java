package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n2k1 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public n2k1(String str, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2k1)) {
            return false;
        }
        n2k1 n2k1Var = (n2k1) obj;
        return this.a == n2k1Var.a && this.b == n2k1Var.b && this.c.equals(n2k1Var.c) && this.d == n2k1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
