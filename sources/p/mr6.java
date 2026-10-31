package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mr6 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final int g;
    public final long h;

    public mr6(int i, int i2, long j, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = z2;
        this.g = i2;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr6)) {
            return false;
        }
        mr6 mr6Var = (mr6) obj;
        return this.a.equals(mr6Var.a) && this.b.equals(mr6Var.b) && this.c.equals(mr6Var.c) && this.d == mr6Var.d && this.e == mr6Var.e && this.f == mr6Var.f && this.g == mr6Var.g && this.h == mr6Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + kaa0.f(this.g, xcg1.g(ab80.k(this.e, xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31);
    }
}
