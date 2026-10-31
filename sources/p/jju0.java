package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jju0 implements kju0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final zxc0 e;

    public jju0(String str, String str2, String str3, int i, zxc0 zxc0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = zxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jju0)) {
            return false;
        }
        jju0 jju0Var = (jju0) obj;
        return u890.j(this.a, jju0Var.a) && u890.j(this.b, jju0Var.b) && u890.j(this.c, jju0Var.c) && this.d == jju0Var.d && u890.j(this.e, jju0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        zxc0 zxc0Var = this.e;
        return iF + (zxc0Var != null ? zxc0Var.hashCode() : 0);
    }
}
