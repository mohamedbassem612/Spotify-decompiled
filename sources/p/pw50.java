package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pw50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final a10 f;

    public pw50(String str, String str2, String str3, String str4, String str5, a10 a10Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = a10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw50)) {
            return false;
        }
        pw50 pw50Var = (pw50) obj;
        return this.a.equals(pw50Var.a) && this.b.equals(pw50Var.b) && this.c.equals(pw50Var.c) && this.d.equals(pw50Var.d) && this.e.equals(pw50Var.e) && this.f.equals(pw50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
