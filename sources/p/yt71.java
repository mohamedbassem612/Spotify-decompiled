package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yt71 {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final long i;
    public final int j;
    public final long k;
    public final int l;

    public yt71(int i, long j, long j2, int i2, long j3, long j4, int i3, long j5, long j6, int i4, long j7, int i5) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.f = j4;
        this.g = i3;
        this.h = j5;
        this.i = j6;
        this.j = i4;
        this.k = j7;
        this.l = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt71)) {
            return false;
        }
        yt71 yt71Var = (yt71) obj;
        return this.a == yt71Var.a && this.b == yt71Var.b && this.c == yt71Var.c && this.d == yt71Var.d && this.e == yt71Var.e && this.f == yt71Var.f && this.g == yt71Var.g && this.h == yt71Var.h && this.i == yt71Var.i && this.j == yt71Var.j && this.k == yt71Var.k && this.l == yt71Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + cy30.f(kaa0.f(this.j, cy30.f(cy30.f(kaa0.f(this.g, cy30.f(cy30.f(kaa0.f(this.d, cy30.f(cy30.f(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31), this.e, 31), this.f, 31), 31), this.h, 31), this.i, 31), 31), this.k, 31);
    }
}
