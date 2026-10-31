package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uq51 {
    public final long a;
    public final long b;
    public final ve01 c;

    public uq51(long j, long j2, ve01 ve01Var) {
        this.a = j;
        this.b = j2;
        this.c = ve01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uq51) {
            uq51 uq51Var = (uq51) obj;
            return tve1.b(this.a, uq51Var.a) && tve1.b(this.b, uq51Var.b) && this.c == uq51Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
