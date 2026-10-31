package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class us30 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public us30(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us30)) {
            return false;
        }
        us30 us30Var = (us30) obj;
        return u890.j(this.a, us30Var.a) && this.b == us30Var.b && u890.j(this.c, us30Var.c) && u890.j(this.d, us30Var.d) && this.e == us30Var.e && u890.j(this.f, us30Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
