package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iys0 {
    public final hux a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;

    public iys0(hux huxVar, long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i) {
        huxVar = (i & 1) != 0 ? null : huxVar;
        int i2 = (i & 2) != 0 ? 1 : 2;
        j = (i & 4) != 0 ? u7h.k : j;
        String str4 = (i & 32) != 0 ? null : "spotify:playlist:37i9dQZF1EYkqdzj48dyYq";
        String str5 = (i & 64) != 0 ? null : str2;
        boolean z4 = (i & 128) != 0 ? false : z;
        boolean z5 = (i & 256) == 0 ? z2 : true;
        boolean z6 = (i & 512) == 0 ? z3 : false;
        String str6 = (i & 1024) == 0 ? str3 : null;
        this.a = huxVar;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = str4;
        this.g = str5;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iys0)) {
            return false;
        }
        iys0 iys0Var = (iys0) obj;
        if (!u890.j(this.a, iys0Var.a) || this.b != iys0Var.b) {
            return false;
        }
        long j = iys0Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && z4h1.b(this.d, iys0Var.d) && u890.j(this.e, iys0Var.e) && u890.j(this.f, iys0Var.f) && u890.j(this.g, iys0Var.g) && this.h == iys0Var.h && this.i == iys0Var.i && this.j == iys0Var.j && u890.j(this.k, iys0Var.k);
    }

    public final int hashCode() {
        hux huxVar = this.a;
        int iK = ab80.k(this.b, (huxVar == null ? 0 : huxVar.hashCode()) * 31, 31);
        int i = u7h.l;
        int iD = cy30.d(cy30.f(cy30.f(iK, this.c, 31), this.d, 31), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str3 = this.k;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }
}
