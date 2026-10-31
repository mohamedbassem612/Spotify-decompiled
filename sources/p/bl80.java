package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bl80 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;

    public bl80(long j, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl80)) {
            return false;
        }
        bl80 bl80Var = (bl80) obj;
        if (!u890.j(this.a, bl80Var.a) || !u890.j(this.b, bl80Var.b) || !u890.j(this.c, bl80Var.c)) {
            return false;
        }
        long j = bl80Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && this.e == bl80Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        int i = u7h.l;
        return Boolean.hashCode(this.e) + cy30.f(iHashCode, this.d, 31);
    }
}
