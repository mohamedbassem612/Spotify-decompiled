package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jhv0 extends xap1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public jhv0(String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final String C() {
        return this.f;
    }

    public final String D() {
        return this.d;
    }

    public final String E() {
        return this.e;
    }

    public final String F() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhv0)) {
            return false;
        }
        jhv0 jhv0Var = (jhv0) obj;
        return u890.j(this.c, jhv0Var.c) && u890.j(this.d, jhv0Var.d) && u890.j(this.e, jhv0Var.e) && u890.j(this.f, jhv0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ jhv0(String str, String str2, int i, String str3) {
        this(str, str2, (String) null, (i & 8) != 0 ? null : str3);
    }
}
