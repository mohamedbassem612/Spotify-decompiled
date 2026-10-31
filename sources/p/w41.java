package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w41 extends c51 {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final String i;

    public w41(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, long j, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w41)) {
            return false;
        }
        w41 w41Var = (w41) obj;
        return u890.j(this.a, w41Var.a) && this.b == w41Var.b && u890.j(this.c, w41Var.c) && this.d == w41Var.d && this.e == w41Var.e && this.f == w41Var.f && this.g == w41Var.g && this.h == w41Var.h && u890.j(this.i, w41Var.i);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iF2 = cy30.f(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), this.h, 31);
        String str2 = this.i;
        return iF2 + (str2 != null ? str2.hashCode() : 0);
    }
}
