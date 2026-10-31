package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class spd1 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final Long j;
    public final Long k;
    public final Long l;
    public final Double m;
    public final Long n;
    public final boolean o;

    public spd1(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, Long l, Long l2, Long l3, Double d, Long l4, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = l;
        this.k = l2;
        this.l = l3;
        this.m = d;
        this.n = l4;
        this.o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spd1)) {
            return false;
        }
        spd1 spd1Var = (spd1) obj;
        return this.a.equals(spd1Var.a) && this.b == spd1Var.b && this.c == spd1Var.c && this.d.equals(spd1Var.d) && this.e.equals(spd1Var.e) && u890.j(this.f, spd1Var.f) && u890.j(this.g, spd1Var.g) && u890.j(this.h, spd1Var.h) && this.i == spd1Var.i && u890.j(this.j, spd1Var.j) && u890.j(this.k, spd1Var.k) && u890.j(this.l, spd1Var.l) && u890.j(this.m, spd1Var.m) && u890.j(this.n, spd1Var.n) && this.o == spd1Var.o;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(ab80.k(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iG = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        Long l = this.j;
        int iHashCode2 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.k;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.l;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.m;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Long l4 = this.n;
        return Boolean.hashCode(this.o) + ((iHashCode5 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }
}
