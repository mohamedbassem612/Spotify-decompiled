package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yod {
    public final List a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public yod(List list, List list2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yod)) {
            return false;
        }
        yod yodVar = (yod) obj;
        return u890.j(this.a, yodVar.a) && u890.j(this.b, yodVar.b) && u890.j(this.c, yodVar.c) && u890.j(this.d, yodVar.d) && u890.j(this.e, yodVar.e) && u890.j(this.f, yodVar.f) && u890.j(this.g, yodVar.g) && u890.j(this.h, yodVar.h);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
