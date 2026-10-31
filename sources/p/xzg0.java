package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xzg0 implements k0h0 {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final ijg1 g;
    public final List h;
    public final String i;
    public final int j;

    public xzg0(String str, String str2, String str3, Long l, String str4, String str5, ijg1 ijg1Var, List list, String str6, int i, int i2) {
        str3 = (i2 & 4) != 0 ? null : str3;
        l = (i2 & 8) != 0 ? null : l;
        str5 = (i2 & 32) != 0 ? null : str5;
        ijg1Var = (i2 & 64) != 0 ? null : ijg1Var;
        list = (i2 & 128) != 0 ? z6x.a : list;
        i = (i2 & 512) != 0 ? 0 : i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = str4;
        this.f = str5;
        this.g = ijg1Var;
        this.h = list;
        this.i = str6;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzg0)) {
            return false;
        }
        xzg0 xzg0Var = (xzg0) obj;
        return u890.j(this.a, xzg0Var.a) && u890.j(this.b, xzg0Var.b) && u890.j(this.c, xzg0Var.c) && u890.j(this.d, xzg0Var.d) && u890.j(this.e, xzg0Var.e) && u890.j(this.f, xzg0Var.f) && this.g == xzg0Var.g && this.h.equals(xzg0Var.h) && u890.j(this.i, xzg0Var.i) && this.j == xzg0Var.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ijg1 ijg1Var = this.g;
        int iB = f4i1.b((iHashCode6 + (ijg1Var == null ? 0 : ijg1Var.hashCode())) * 31, 31, this.h);
        String str5 = this.i;
        int iHashCode7 = (iB + (str5 == null ? 0 : str5.hashCode())) * 31;
        int i = this.j;
        return iHashCode7 + (i != 0 ? l1d.C(i) : 0);
    }
}
