package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wqy {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final p860 i;
    public final ugo0 j;
    public final c821 k;
    public final String l;
    public final ok51 m;
    public final boolean n;

    public wqy(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, p860 p860Var, ugo0 ugo0Var, c821 c821Var, String str2, ok51 ok51Var, boolean z8, int i) {
        str = (i & 1) != 0 ? null : str;
        boolean z9 = (i & 64) != 0 ? false : z6;
        boolean z10 = (i & 128) != 0 ? false : z7;
        p860 p860Var2 = (i & 256) != 0 ? null : p860Var;
        ugo0 ugo0Var2 = (i & 512) != 0 ? null : ugo0Var;
        c821 c821Var2 = (i & 1024) != 0 ? b821.a : c821Var;
        String str3 = (i & 2048) != 0 ? null : str2;
        ok51 ok51Var2 = (i & 4096) == 0 ? ok51Var : null;
        boolean z11 = (i & 8192) == 0 ? z8 : false;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z9;
        this.h = z10;
        this.i = p860Var2;
        this.j = ugo0Var2;
        this.k = c821Var2;
        this.l = str3;
        this.m = ok51Var2;
        this.n = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqy)) {
            return false;
        }
        wqy wqyVar = (wqy) obj;
        return u890.j(this.a, wqyVar.a) && this.b == wqyVar.b && this.c == wqyVar.c && this.d == wqyVar.d && this.e == wqyVar.e && this.f == wqyVar.f && this.g == wqyVar.g && this.h == wqyVar.h && u890.j(this.i, wqyVar.i) && u890.j(this.j, wqyVar.j) && u890.j(this.k, wqyVar.k) && u890.j(this.l, wqyVar.l) && u890.j(this.m, wqyVar.m) && this.n == wqyVar.n;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        p860 p860Var = this.i;
        int iHashCode = (iG + (p860Var == null ? 0 : p860Var.hashCode())) * 31;
        ugo0 ugo0Var = this.j;
        int iHashCode2 = (this.k.hashCode() + ((iHashCode + (ugo0Var == null ? 0 : ugo0Var.hashCode())) * 31)) * 31;
        String str2 = this.l;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ok51 ok51Var = this.m;
        return Boolean.hashCode(this.n) + ((iHashCode3 + (ok51Var != null ? ok51Var.hashCode() : 0)) * 31);
    }
}
