package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xa41 extends ha71 {
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;

    public xa41(String str, String str2, String str3, Boolean bool) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa41)) {
            return false;
        }
        xa41 xa41Var = (xa41) obj;
        return u890.j(this.c, xa41Var.c) && u890.j(this.d, xa41Var.d) && u890.j(this.e, xa41Var.e) && u890.j(this.f, xa41Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
