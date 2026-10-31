package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dd11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public dd11(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd11)) {
            return false;
        }
        dd11 dd11Var = (dd11) obj;
        if (!u890.j(this.a, dd11Var.a) || !u890.j(this.b, dd11Var.b) || !u890.j(this.c, dd11Var.c) || !u890.j(this.d, dd11Var.d) || !u890.j(this.e, dd11Var.e) || !this.f.equals(dd11Var.f)) {
            return false;
        }
        t0z t0zVar = sc11.b;
        return t0zVar.equals(t0zVar);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return sc11.b.hashCode() + cy30.d(cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }
}
