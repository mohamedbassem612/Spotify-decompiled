package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ff31 {
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;
    public final int e;
    public final long f;
    public final Boolean g;
    public final String h;

    public ff31(String str, String str2, c380 c380Var, String str3, int i, long j, Boolean bool, String str4) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
        this.e = i;
        this.f = j;
        this.g = bool;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff31)) {
            return false;
        }
        ff31 ff31Var = (ff31) obj;
        return u890.j(this.a, ff31Var.a) && u890.j(this.b, ff31Var.b) && u890.j(this.c, ff31Var.c) && u890.j(this.d, ff31Var.d) && this.e == ff31Var.e && this.f == ff31Var.f && u890.j(this.g, ff31Var.g) && u890.j(this.h, ff31Var.h);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iF2 = cy30.f(ab80.k(this.e, (iF + (str == null ? 0 : str.hashCode())) * 31, 31), this.f, 31);
        Boolean bool = this.g;
        return Boolean.hashCode(false) + cy30.d((iF2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.h);
    }
}
