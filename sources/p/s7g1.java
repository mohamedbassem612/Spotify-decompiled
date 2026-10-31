package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s7g1 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final Integer e;
    public final String f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Long k;
    public final Long l;
    public final gia m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f107p;

    public s7g1(long j, long j2, long j3, String str, Integer num, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, gia giaVar, boolean z, boolean z2, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = num;
        this.f = str2;
        this.g = l;
        this.h = l2;
        this.i = l3;
        this.j = l4;
        this.k = l5;
        this.l = l6;
        this.m = giaVar;
        this.n = z;
        this.o = z2;
        this.f107p = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7g1)) {
            return false;
        }
        s7g1 s7g1Var = (s7g1) obj;
        return this.a == s7g1Var.a && this.b == s7g1Var.b && this.c == s7g1Var.c && u890.j(this.d, s7g1Var.d) && u890.j(this.e, s7g1Var.e) && u890.j(this.f, s7g1Var.f) && u890.j(this.g, s7g1Var.g) && u890.j(this.h, s7g1Var.h) && u890.j(this.i, s7g1Var.i) && u890.j(this.j, s7g1Var.j) && u890.j(this.k, s7g1Var.k) && u890.j(this.l, s7g1Var.l) && this.m == s7g1Var.m && this.n == s7g1Var.n && this.o == s7g1Var.o && this.f107p == s7g1Var.f107p;
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.g;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.j;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.k;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.l;
        return l1d.C(this.f107p) + xcg1.g(xcg1.g((this.m.hashCode() + ((iHashCode8 + (l6 != null ? l6.hashCode() : 0)) * 31)) * 31, 31, this.n), 31, this.o);
    }
}
