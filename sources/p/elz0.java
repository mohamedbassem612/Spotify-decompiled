package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class elz0 {
    public final int a;
    public final int b;
    public final String c;
    public final Long d;
    public final Long e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public elz0(int i, int i2, String str, Long l, Long l2, long j, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = l;
        this.e = l2;
        this.f = j;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elz0)) {
            return false;
        }
        elz0 elz0Var = (elz0) obj;
        return this.a == elz0Var.a && this.b == elz0Var.b && u890.j(this.c, elz0Var.c) && u890.j(this.d, elz0Var.d) && u890.j(this.e, elz0Var.e) && this.f == elz0Var.f && this.g == elz0Var.g && this.h == elz0Var.h;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return Boolean.hashCode(this.h) + xcg1.g(cy30.f((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, this.f, 31), 31, this.g);
    }
}
