package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r140 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;

    public r140(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r140)) {
            return false;
        }
        r140 r140Var = (r140) obj;
        return u890.j(this.a, r140Var.a) && u890.j(this.b, r140Var.b) && u890.j(this.c, r140Var.c) && this.d == r140Var.d && u890.j(this.e, r140Var.e) && this.f == r140Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
