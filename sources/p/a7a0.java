package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a7a0 {
    public final long a;
    public final long b;
    public final int c;
    public final boolean d;

    public a7a0(int i, long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7a0)) {
            return false;
        }
        a7a0 a7a0Var = (a7a0) obj;
        return this.a == a7a0Var.a && jfv.f(this.b, a7a0Var.b) && this.c == a7a0Var.c && this.d == a7a0Var.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        ytw0 ytw0Var = jfv.b;
        return Boolean.hashCode(this.d) + kaa0.f(this.c, cy30.f(iHashCode, this.b, 31), 31);
    }
}
