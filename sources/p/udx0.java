package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class udx0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final c4n0 d;
    public final boolean e;

    public udx0(String str, String str2, boolean z, c4n0 c4n0Var, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = c4n0Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof udx0) {
            udx0 udx0Var = (udx0) obj;
            if (u890.j(this.a, udx0Var.a) && u890.j(this.b, udx0Var.b) && this.c == udx0Var.c && this.d == udx0Var.d && this.e == udx0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
