package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wsi0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public wsi0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wsi0)) {
            return false;
        }
        wsi0 wsi0Var = (wsi0) obj;
        long j = wsi0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, wsi0Var.b) && z4h1.b(this.c, wsi0Var.c) && z4h1.b(this.d, wsi0Var.d) && z4h1.b(this.e, wsi0Var.e) && z4h1.b(this.f, wsi0Var.f);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.f) + cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
