package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hb41 extends pb41 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Integer f;
    public final String g;

    public hb41(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = num;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb41)) {
            return false;
        }
        hb41 hb41Var = (hb41) obj;
        return u890.j(this.a, hb41Var.a) && u890.j(this.b, hb41Var.b) && u890.j(this.c, hb41Var.c) && u890.j(this.d, hb41Var.d) && u890.j(this.e, hb41Var.e) && u890.j(this.f, hb41Var.f) && u890.j(this.g, hb41Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
