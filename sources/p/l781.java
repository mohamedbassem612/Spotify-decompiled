package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l781 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final c821 h;
    public final ugo0 i;
    public final ok51 j;
    public final int k;
    public final iu30 l;
    public final boolean m;
    public final boolean n;
    public final r6h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f45p;
    public final String q;
    public final p860 r;

    public l781(String str, String str2, boolean z, boolean z2, c821 c821Var, ugo0 ugo0Var, ok51 ok51Var, int i, boolean z3, boolean z4, r6h1 r6h1Var, boolean z5, String str3, p860 p860Var, int i2) {
        String str4 = (i2 & 1) != 0 ? null : str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        boolean z6 = (i2 & 4) == 0;
        boolean z7 = (i2 & 256) != 0 ? true : z;
        boolean z8 = (i2 & 512) != 0 ? false : z2;
        boolean z9 = (i2 & 1024) != 0;
        c821 c821Var2 = (i2 & 2048) != 0 ? b821.a : c821Var;
        ugo0 ugo0Var2 = (i2 & 4096) != 0 ? null : ugo0Var;
        ok51 ok51Var2 = (i2 & 8192) != 0 ? null : ok51Var;
        int i3 = (i2 & 16384) != 0 ? 1 : i;
        rz71 rz71Var = rz71.S0;
        boolean z10 = (i2 & 65536) != 0 ? true : z3;
        boolean z11 = (i2 & 131072) != 0 ? false : z4;
        r6h1 r6h1Var2 = (i2 & 262144) != 0 ? r6h1.c : r6h1Var;
        boolean z12 = (i2 & 524288) != 0 ? false : z5;
        String str6 = (i2 & 1048576) != 0 ? null : str3;
        p860 p860Var2 = (i2 & 2097152) != 0 ? null : p860Var;
        this.a = str4;
        this.b = str5;
        this.c = z6;
        this.d = true;
        this.e = z7;
        this.f = z8;
        this.g = z9;
        this.h = c821Var2;
        this.i = ugo0Var2;
        this.j = ok51Var2;
        this.k = i3;
        this.l = rz71Var;
        this.m = z10;
        this.n = z11;
        this.o = r6h1Var2;
        this.f45p = z12;
        this.q = str6;
        this.r = p860Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l781)) {
            return false;
        }
        l781 l781Var = (l781) obj;
        return u890.j(this.a, l781Var.a) && u890.j(this.b, l781Var.b) && this.c == l781Var.c && this.d == l781Var.d && this.e == l781Var.e && this.f == l781Var.f && this.g == l781Var.g && u890.j(this.h, l781Var.h) && u890.j(this.i, l781Var.i) && u890.j(this.j, l781Var.j) && this.k == l781Var.k && u890.j(this.l, l781Var.l) && this.m == l781Var.m && this.n == l781Var.n && u890.j(this.o, l781Var.o) && this.f45p == l781Var.f45p && u890.j(this.q, l781Var.q) && u890.j(this.r, l781Var.r);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, false), 31, false), 31, false), 31, false), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
        ugo0 ugo0Var = this.i;
        int iHashCode2 = (iHashCode + (ugo0Var == null ? 0 : ugo0Var.hashCode())) * 31;
        ok51 ok51Var = this.j;
        int iG = xcg1.g((this.o.hashCode() + xcg1.g(xcg1.g(ktd.g(this.l, ab80.k(this.k, (iHashCode2 + (ok51Var == null ? 0 : ok51Var.hashCode())) * 31, 31), 31), 31, this.m), 31, this.n)) * 31, 31, this.f45p);
        String str2 = this.q;
        int iHashCode3 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        p860 p860Var = this.r;
        return iHashCode3 + (p860Var != null ? p860Var.hashCode() : 0);
    }
}
