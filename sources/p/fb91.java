package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fb91 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public fb91(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.b : this.d;
        }
        return z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fb91)) {
            return false;
        }
        fb91 fb91Var = (fb91) obj;
        long j = fb91Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, fb91Var.b) && z4h1.b(this.c, fb91Var.c) && z4h1.b(this.d, fb91Var.d) && z4h1.b(this.e, fb91Var.e) && z4h1.b(this.f, fb91Var.f) && z4h1.b(this.g, fb91Var.g) && z4h1.b(this.h, fb91Var.h) && z4h1.b(this.i, fb91Var.i) && z4h1.b(this.j, fb91Var.j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.j) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }
}
