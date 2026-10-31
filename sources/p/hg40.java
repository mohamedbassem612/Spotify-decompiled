package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hg40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final mvh1 g;
    public final boolean h;
    public final Set i;
    public final String j;
    public final nmu0 k;

    public hg40(String str, String str2, String str3, String str4, String str5, String str6, mvh1 mvh1Var, boolean z, Set set, String str7, nmu0 nmu0Var, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        mvh1Var = (i & 64) != 0 ? jvh1.a : mvh1Var;
        z = (i & 128) != 0 ? false : z;
        set = (i & 256) != 0 ? null : set;
        str7 = (i & 512) != 0 ? null : str7;
        nmu0Var = (i & 1024) != 0 ? null : nmu0Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = mvh1Var;
        this.h = z;
        this.i = set;
        this.j = str7;
        this.k = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg40)) {
            return false;
        }
        hg40 hg40Var = (hg40) obj;
        return u890.j(this.a, hg40Var.a) && u890.j(this.b, hg40Var.b) && u890.j(this.c, hg40Var.c) && u890.j(this.d, hg40Var.d) && u890.j(this.e, hg40Var.e) && u890.j(this.f, hg40Var.f) && this.g.equals(hg40Var.g) && this.h == hg40Var.h && u890.j(this.i, hg40Var.i) && u890.j(this.j, hg40Var.j) && this.k == hg40Var.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iG = xcg1.g((this.g.hashCode() + ((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31, 31, this.h);
        Set set = this.i;
        int iHashCode6 = (iG + (set == null ? 0 : set.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        nmu0 nmu0Var = this.k;
        return iHashCode7 + (nmu0Var != null ? nmu0Var.hashCode() : 0);
    }
}
