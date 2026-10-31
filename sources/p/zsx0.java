package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zsx0 extends ktx0 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final Boolean h;

    public zsx0(String str, String str2, List list, String str3, List list2, List list3, String str4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = list2;
        this.f = list3;
        this.g = str4;
        this.h = bool;
    }

    public static zsx0 a(zsx0 zsx0Var, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = zsx0Var.a;
        }
        String str2 = str;
        String str3 = zsx0Var.b;
        if ((i & 4) != 0) {
            list = zsx0Var.c;
        }
        return new zsx0(str2, str3, list, zsx0Var.d, zsx0Var.e, zsx0Var.f, zsx0Var.g, zsx0Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsx0)) {
            return false;
        }
        zsx0 zsx0Var = (zsx0) obj;
        return this.a.equals(zsx0Var.a) && u890.j(this.b, zsx0Var.b) && u890.j(this.c, zsx0Var.c) && u890.j(this.d, zsx0Var.d) && this.e.equals(zsx0Var.e) && u890.j(this.f, zsx0Var.f) && u890.j(this.g, zsx0Var.g) && u890.j(this.h, zsx0Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int iB = f4i1.b(f4i1.b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.g;
        int iHashCode4 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.h;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }
}
