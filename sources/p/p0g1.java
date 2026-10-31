package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p0g1 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public p0g1(Long l, String str, String str2, String str3, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0g1)) {
            return false;
        }
        p0g1 p0g1Var = (p0g1) obj;
        return this.a == p0g1Var.a && u890.j(this.b, p0g1Var.b) && u890.j(this.c, p0g1Var.c) && u890.j(this.d, p0g1Var.d) && u890.j(this.e, p0g1Var.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }
}
