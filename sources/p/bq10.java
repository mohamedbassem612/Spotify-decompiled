package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bq10 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final aq10 e;
    public final String f;
    public final zp10 g;

    public bq10(String str, String str2, String str3, List list, aq10 aq10Var, String str4, zp10 zp10Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = aq10Var;
        this.f = str4;
        this.g = zp10Var;
    }

    public static bq10 a(bq10 bq10Var, aq10 aq10Var, String str, zp10 zp10Var) {
        return new bq10(bq10Var.a, bq10Var.b, bq10Var.c, bq10Var.d, aq10Var, str, zp10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq10)) {
            return false;
        }
        bq10 bq10Var = (bq10) obj;
        return u890.j(this.a, bq10Var.a) && u890.j(this.b, bq10Var.b) && u890.j(this.c, bq10Var.c) && u890.j(this.d, bq10Var.d) && this.e == bq10Var.e && u890.j(this.f, bq10Var.f) && u890.j(this.g, bq10Var.g);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        aq10 aq10Var = this.e;
        int iHashCode = (iB + (aq10Var == null ? 0 : aq10Var.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zp10 zp10Var = this.g;
        return iHashCode2 + (zp10Var != null ? zp10Var.hashCode() : 0);
    }

    public /* synthetic */ bq10(String str, String str2, int i, String str3) {
        this(str, str2, str3, z6x.a, null, null, null);
    }
}
