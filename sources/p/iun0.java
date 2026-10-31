package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iun0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final iun0 g;

    public iun0(String str, String str2, String str3, String str4, boolean z, String str5, iun0 iun0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = iun0Var;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iun0)) {
            return false;
        }
        iun0 iun0Var = (iun0) obj;
        return u890.j(this.a, iun0Var.a) && u890.j(this.b, iun0Var.b) && u890.j(this.c, iun0Var.c) && u890.j(this.d, iun0Var.d) && this.e == iun0Var.e && u890.j(this.f, iun0Var.f) && u890.j(this.g, iun0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        iun0 iun0Var = this.g;
        return iHashCode + (iun0Var != null ? iun0Var.hashCode() : 0);
    }
}
