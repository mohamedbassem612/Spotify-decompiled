package p;

import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hdg0 {
    public final String a;
    public final ibg0 b;
    public final String c;
    public final String d;
    public final Integer e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Date i;
    public final boolean j;
    public final i9t0 k;
    public final e850 l;
    public final int m;
    public final l6t n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r7g0 f10p;
    public final s7g0 q;
    public final List r;
    public final boolean s;

    public hdg0(String str, ibg0 ibg0Var, String str2, String str3, Integer num, int i, boolean z, boolean z2, Date date, boolean z3, i9t0 i9t0Var, e850 e850Var, int i2, l6t l6tVar, int i3, r7g0 r7g0Var, s7g0 s7g0Var, List list, boolean z4) {
        this.a = str;
        this.b = ibg0Var;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = date;
        this.j = z3;
        this.k = i9t0Var;
        this.l = e850Var;
        this.m = i2;
        this.n = l6tVar;
        this.o = i3;
        this.f10p = r7g0Var;
        this.q = s7g0Var;
        this.r = list;
        this.s = z4;
    }

    public static hdg0 a(hdg0 hdg0Var, r7g0 r7g0Var, s7g0 s7g0Var, int i) {
        String str = hdg0Var.a;
        ibg0 ibg0Var = hdg0Var.b;
        String str2 = hdg0Var.c;
        String str3 = hdg0Var.d;
        Integer num = hdg0Var.e;
        int i2 = hdg0Var.f;
        boolean z = hdg0Var.g;
        boolean z2 = hdg0Var.h;
        Date date = hdg0Var.i;
        boolean z3 = hdg0Var.j;
        i9t0 i9t0Var = hdg0Var.k;
        e850 e850Var = (i & 2048) != 0 ? hdg0Var.l : null;
        int i3 = hdg0Var.m;
        e850 e850Var2 = e850Var;
        l6t l6tVar = hdg0Var.n;
        int i4 = hdg0Var.o;
        r7g0 r7g0Var2 = (i & 32768) != 0 ? hdg0Var.f10p : r7g0Var;
        s7g0 s7g0Var2 = (i & 65536) != 0 ? hdg0Var.q : s7g0Var;
        List list = hdg0Var.r;
        boolean z4 = hdg0Var.s;
        hdg0Var.getClass();
        return new hdg0(str, ibg0Var, str2, str3, num, i2, z, z2, date, z3, i9t0Var, e850Var2, i3, l6tVar, i4, r7g0Var2, s7g0Var2, list, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdg0)) {
            return false;
        }
        hdg0 hdg0Var = (hdg0) obj;
        return this.a.equals(hdg0Var.a) && this.b == hdg0Var.b && this.c.equals(hdg0Var.c) && u890.j(this.d, hdg0Var.d) && u890.j(this.e, hdg0Var.e) && this.f == hdg0Var.f && this.g == hdg0Var.g && this.h == hdg0Var.h && u890.j(this.i, hdg0Var.i) && this.j == hdg0Var.j && u890.j(this.k, hdg0Var.k) && u890.j(this.l, hdg0Var.l) && this.m == hdg0Var.m && u890.j(this.n, hdg0Var.n) && this.o == hdg0Var.o && u890.j(this.f10p, hdg0Var.f10p) && u890.j(this.q, hdg0Var.q) && this.r.equals(hdg0Var.r) && this.s == hdg0Var.s;
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int iG = xcg1.g(xcg1.g(ab80.k(this.f, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.g), 31, this.h);
        Date date = this.i;
        int iG2 = xcg1.g((iG + (date == null ? 0 : date.hashCode())) * 31, 31, this.j);
        i9t0 i9t0Var = this.k;
        int iHashCode2 = (iG2 + (i9t0Var == null ? 0 : i9t0Var.hashCode())) * 31;
        e850 e850Var = this.l;
        int iF = kaa0.f(this.m, (iHashCode2 + (e850Var == null ? 0 : Integer.hashCode(e850Var.a))) * 31, 31);
        l6t l6tVar = this.n;
        int iC = (iF + (l6tVar == null ? 0 : l1d.C(l6tVar.a))) * 31;
        int i = this.o;
        int iC2 = (iC + (i == 0 ? 0 : l1d.C(i))) * 31;
        r7g0 r7g0Var = this.f10p;
        int iHashCode3 = (iC2 + (r7g0Var == null ? 0 : r7g0Var.hashCode())) * 31;
        s7g0 s7g0Var = this.q;
        return Boolean.hashCode(this.s) + f4i1.b((iHashCode3 + (s7g0Var != null ? s7g0Var.hashCode() : 0)) * 31, 31, this.r);
    }
}
