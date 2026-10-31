package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class di10 {
    public final String a;
    public final String b;
    public final String c;
    public final ugo0 d;
    public final p860 e;
    public final boolean f;

    public di10(String str, String str2, String str3, ugo0 ugo0Var, p860 p860Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ugo0Var;
        this.e = p860Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di10)) {
            return false;
        }
        di10 di10Var = (di10) obj;
        return u890.j(this.a, di10Var.a) && u890.j(this.b, di10Var.b) && u890.j(this.c, di10Var.c) && u890.j(this.d, di10Var.d) && u890.j(this.e, di10Var.e) && this.f == di10Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        p860 p860Var = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode3 + (p860Var != null ? p860Var.hashCode() : 0)) * 31);
    }
}
