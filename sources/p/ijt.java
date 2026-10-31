package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ijt implements dkt {
    public final String X;
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final long i;
    public final String t;

    public ijt(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = j2;
        this.t = str3;
        this.X = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijt)) {
            return false;
        }
        ijt ijtVar = (ijt) obj;
        return u890.j(this.a, ijtVar.a) && this.b == ijtVar.b && u890.j(this.c, ijtVar.c) && this.d == ijtVar.d && this.e == ijtVar.e && this.f == ijtVar.f && this.g == ijtVar.g && this.h == ijtVar.h && this.i == ijtVar.i && u890.j(this.t, ijtVar.t) && u890.j(this.X, ijtVar.X);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iF2 = cy30.f(cy30.f(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), this.h, 31), this.i, 31);
        String str2 = this.t;
        int iHashCode = (iF2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.X;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
