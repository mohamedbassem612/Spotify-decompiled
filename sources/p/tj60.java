package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tj60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Boolean g;
    public final String h;
    public final Boolean i;
    public final Boolean j;
    public final List k;
    public final long l;
    public final Boolean m;
    public final Boolean n;

    public /* synthetic */ tj60(String str, String str2, String str3, String str4, String str5, int i, Boolean bool, String str6, Boolean bool2, Boolean bool3, List list, long j, Boolean bool4, Boolean bool5, int i2) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? null : str5, i, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : list, j, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : bool5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj60)) {
            return false;
        }
        tj60 tj60Var = (tj60) obj;
        return u890.j(this.a, tj60Var.a) && u890.j(this.b, tj60Var.b) && u890.j(this.c, tj60Var.c) && u890.j(this.d, tj60Var.d) && u890.j(this.e, tj60Var.e) && this.f == tj60Var.f && u890.j(this.g, tj60Var.g) && u890.j(this.h, tj60Var.h) && u890.j(this.i, tj60Var.i) && u890.j(this.j, tj60Var.j) && u890.j(this.k, tj60Var.k) && this.l == tj60Var.l && u890.j(this.m, tj60Var.m) && u890.j(this.n, tj60Var.n);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iK = ab80.k(this.f, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Boolean bool = this.g;
        int iHashCode3 = (iK + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.k;
        int iF = cy30.f((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31, this.l, 31);
        Boolean bool4 = this.m;
        int iHashCode7 = (iF + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.n;
        return iHashCode7 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public tj60(String str, String str2, String str3, String str4, String str5, int i, Boolean bool, String str6, Boolean bool2, Boolean bool3, List list, long j, Boolean bool4, Boolean bool5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = bool;
        this.h = str6;
        this.i = bool2;
        this.j = bool3;
        this.k = list;
        this.l = j;
        this.m = bool4;
        this.n = bool5;
    }
}
