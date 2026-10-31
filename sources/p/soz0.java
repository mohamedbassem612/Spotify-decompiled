package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class soz0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public soz0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof soz0)) {
            return false;
        }
        soz0 soz0Var = (soz0) obj;
        long j = soz0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, soz0Var.b) && z4h1.b(this.c, soz0Var.c) && z4h1.b(this.d, soz0Var.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public /* synthetic */ soz0(long j, long j2, long j3, long j4, int i) {
        this(j, j2, j3, j4);
    }
}
