package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g5g0 extends t4n1 {
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public g5g0(String str, boolean z, String str2, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5g0)) {
            return false;
        }
        g5g0 g5g0Var = (g5g0) obj;
        return u890.j(this.b, g5g0Var.b) && u890.j(this.c, g5g0Var.c) && this.d == g5g0Var.d && this.e == g5g0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(cy30.d(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }
}
