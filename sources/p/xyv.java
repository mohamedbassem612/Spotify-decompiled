package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xyv extends crn1 {
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final String g;
    public final Boolean h;

    public xyv(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = str5;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyv)) {
            return false;
        }
        xyv xyvVar = (xyv) obj;
        return u890.j(this.b, xyvVar.b) && u890.j(this.c, xyvVar.c) && u890.j(this.d, xyvVar.d) && u890.j(this.e, xyvVar.e) && u890.j(this.f, xyvVar.f) && u890.j(this.g, xyvVar.g) && u890.j(this.h, xyvVar.h);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.h;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }
}
