package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v2h0 implements e4h0 {
    public final String a;
    public final o7h0 b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final ijg1 g;
    public final List h;
    public final int i;
    public final long j;

    public v2h0(String str, o7h0 o7h0Var, String str2, String str3, String str4, Long l, ijg1 ijg1Var, List list, int i, long j) {
        this.a = str;
        this.b = o7h0Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = l;
        this.g = ijg1Var;
        this.h = list;
        this.i = i;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2h0)) {
            return false;
        }
        v2h0 v2h0Var = (v2h0) obj;
        return u890.j(this.a, v2h0Var.a) && u890.j(this.b, v2h0Var.b) && u890.j(this.c, v2h0Var.c) && u890.j(this.d, v2h0Var.d) && u890.j(this.e, v2h0Var.e) && u890.j(this.f, v2h0Var.f) && this.g == v2h0Var.g && this.h.equals(v2h0Var.h) && this.i == v2h0Var.i && this.j == v2h0Var.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        o7h0 o7h0Var = this.b;
        int iHashCode2 = (iHashCode + (o7h0Var == null ? 0 : o7h0Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        ijg1 ijg1Var = this.g;
        int iB = f4i1.b((iHashCode6 + (ijg1Var == null ? 0 : ijg1Var.hashCode())) * 31, 31, this.h);
        int i = this.i;
        return Long.hashCode(this.j) + ((iB + (i != 0 ? l1d.C(i) : 0)) * 31);
    }
}
