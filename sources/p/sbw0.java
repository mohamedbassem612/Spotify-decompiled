package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sbw0 {
    public final String a;
    public final String b;
    public final String c;
    public final lsm0 d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final Long k;

    public /* synthetic */ sbw0(String str, String str2, lsm0 lsm0Var, long j, boolean z, boolean z2, boolean z3, Long l, int i) {
        this(str, str2, "", lsm0Var, j, false, (i & 64) != 0 ? false : z, (i & 128) != 0 ? true : z2, z3, null, (i & 1024) != 0 ? null : l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbw0)) {
            return false;
        }
        sbw0 sbw0Var = (sbw0) obj;
        return u890.j(this.a, sbw0Var.a) && u890.j(this.b, sbw0Var.b) && u890.j(this.c, sbw0Var.c) && u890.j(this.d, sbw0Var.d) && this.e == sbw0Var.e && this.f == sbw0Var.f && this.g == sbw0Var.g && this.h == sbw0Var.h && this.i == sbw0Var.i && u890.j(this.j, sbw0Var.j) && u890.j(this.k, sbw0Var.k);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.f((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, this.e, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.k;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public sbw0(String str, String str2, String str3, lsm0 lsm0Var, long j, boolean z, boolean z2, boolean z3, boolean z4, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lsm0Var;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str4;
        this.k = l;
    }
}
