package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionsRow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fih {
    public final xhh a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final String j;
    public final int k;
    public final ReactionsRow l;
    public final boolean m;
    public final uwe1 n;

    public fih(xhh xhhVar, String str, int i, String str2, boolean z, String str3, boolean z2, boolean z3, long j, String str4, int i2, ReactionsRow reactionsRow, boolean z4, uwe1 uwe1Var) {
        this.a = xhhVar;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = z3;
        this.i = j;
        this.j = str4;
        this.k = i2;
        this.l = reactionsRow;
        this.m = z4;
        this.n = uwe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fih)) {
            return false;
        }
        fih fihVar = (fih) obj;
        return u890.j(this.a, fihVar.a) && u890.j(this.b, fihVar.b) && this.c == fihVar.c && u890.j(this.d, fihVar.d) && this.e == fihVar.e && u890.j(this.f, fihVar.f) && this.g == fihVar.g && this.h == fihVar.h && this.i == fihVar.i && u890.j(this.j, fihVar.j) && this.k == fihVar.k && u890.j(this.l, fihVar.l) && this.m == fihVar.m && u890.j(this.n, fihVar.n);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iF = kaa0.f(this.k, cy30.d(cy30.f(xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), this.i, 31), 31, this.j), 31);
        ReactionsRow reactionsRow = this.l;
        return this.n.hashCode() + xcg1.g((iF + (reactionsRow != null ? reactionsRow.hashCode() : 0)) * 31, 31, this.m);
    }

    public /* synthetic */ fih(xhh xhhVar, String str, String str2, String str3, boolean z, boolean z2, long j, String str4, int i, ReactionsRow reactionsRow, boolean z3, uwe1 uwe1Var) {
        this(xhhVar, str, 0, str2, false, str3, z, z2, j, str4, i, reactionsRow, z3, uwe1Var);
    }
}
