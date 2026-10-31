package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wnl1 extends xnl1 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;

    public wnl1(String str, int i, String str2, int i2, boolean z, int i3, int i4, long j) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = i4;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnl1)) {
            return false;
        }
        wnl1 wnl1Var = (wnl1) obj;
        return u890.j(this.a, wnl1Var.a) && this.b == wnl1Var.b && u890.j(this.c, wnl1Var.c) && this.d == wnl1Var.d && this.e == wnl1Var.e && this.f == wnl1Var.f && this.g == wnl1Var.g && this.h == wnl1Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ab80.k(this.g, ab80.k(this.f, xcg1.g(ab80.k(this.d, cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31), 31);
    }
}
