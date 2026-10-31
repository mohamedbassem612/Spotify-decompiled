package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p9z0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final ejo1 f;
    public final boolean g;

    public p9z0(String str, String str2, String str3, boolean z, boolean z2, ejo1 ejo1Var, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = ejo1Var;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9z0)) {
            return false;
        }
        p9z0 p9z0Var = (p9z0) obj;
        return u890.j(this.a, p9z0Var.a) && u890.j(this.b, p9z0Var.b) && u890.j(this.c, p9z0Var.c) && this.d == p9z0Var.d && this.e == p9z0Var.e && u890.j(this.f, p9z0Var.f) && this.g == p9z0Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31);
    }
}
