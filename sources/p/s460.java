package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s460 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s460(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        String str5 = (i2 & 2) != 0 ? null : str2;
        String str6 = (i2 & 4) != 0 ? null : str3;
        String str7 = (i2 & 8) != 0 ? null : str4;
        this((i2 & 16) != 0 ? 1 : i, (i2 & 256) == 0 ? 2 : 1, str, str5, str6, str7, (i2 & 32) == 0, (i2 & 64) == 0, (i2 & 128) == 0, (i2 & 512) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s460)) {
            return false;
        }
        s460 s460Var = (s460) obj;
        return u890.j(this.a, s460Var.a) && u890.j(this.b, s460Var.b) && u890.j(this.c, s460Var.c) && u890.j(this.d, s460Var.d) && this.e == s460Var.e && this.f == s460Var.f && this.g == s460Var.g && this.h == s460Var.h && this.i == s460Var.i && this.j == s460Var.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.j) + kaa0.f(this.i, xcg1.g(xcg1.g(xcg1.g(ab80.k(this.e, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public s460(int i, int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i2;
        this.j = z4;
    }
}
