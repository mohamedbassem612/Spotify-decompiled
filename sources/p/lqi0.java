package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lqi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final r281 f;

    public lqi0(String str, String str2, String str3, String str4, int i, r281 r281Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = r281Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqi0)) {
            return false;
        }
        lqi0 lqi0Var = (lqi0) obj;
        return u890.j(this.a, lqi0Var.a) && u890.j(this.b, lqi0Var.b) && u890.j(this.c, lqi0Var.c) && u890.j(this.d, lqi0Var.d) && this.e == lqi0Var.e && u890.j(this.f, lqi0Var.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        r281 r281Var = this.f;
        return iF + (r281Var == null ? 0 : r281Var.hashCode());
    }

    public /* synthetic */ lqi0(String str) {
        this("", str, "", "", 0, null);
    }
}
