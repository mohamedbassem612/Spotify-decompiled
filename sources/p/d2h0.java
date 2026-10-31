package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d2h0 implements e4h0 {
    public final o7h0 a;
    public final String b;
    public final String c;
    public final Long d;
    public final ijg1 e;
    public final List f;
    public final int g;
    public final long h;

    public d2h0(o7h0 o7h0Var, String str, String str2, Long l, ijg1 ijg1Var, List list, int i, long j) {
        this.a = o7h0Var;
        this.b = str;
        this.c = str2;
        this.d = l;
        this.e = ijg1Var;
        this.f = list;
        this.g = i;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2h0)) {
            return false;
        }
        d2h0 d2h0Var = (d2h0) obj;
        return this.a.equals(d2h0Var.a) && u890.j(this.b, d2h0Var.b) && u890.j(this.c, d2h0Var.c) && u890.j(this.d, d2h0Var.d) && this.e == d2h0Var.e && this.f.equals(d2h0Var.f) && this.g == d2h0Var.g && this.h == d2h0Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        ijg1 ijg1Var = this.e;
        int iB = f4i1.b((iHashCode4 + (ijg1Var == null ? 0 : ijg1Var.hashCode())) * 31, 31, this.f);
        int i = this.g;
        return Long.hashCode(this.h) + ((iB + (i != 0 ? l1d.C(i) : 0)) * 31);
    }
}
