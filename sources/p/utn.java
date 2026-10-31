package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class utn implements aun {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;

    public utn(String str, String str2, Integer num, String str3, boolean z, boolean z2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utn)) {
            return false;
        }
        utn utnVar = (utn) obj;
        return u890.j(this.a, utnVar.a) && u890.j(this.b, utnVar.b) && u890.j(this.c, utnVar.c) && u890.j(this.d, utnVar.d) && this.e == utnVar.e && this.f == utnVar.f && u890.j(this.g, utnVar.g) && u890.j(this.h, utnVar.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int iG = xcg1.g(xcg1.g((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e), 31, this.f);
        String str4 = this.g;
        int iHashCode4 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
