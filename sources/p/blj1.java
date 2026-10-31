package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class blj1 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;

    public blj1(long j, long j2, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blj1)) {
            return false;
        }
        blj1 blj1Var = (blj1) obj;
        return this.a.equals(blj1Var.a) && this.b == blj1Var.b && this.c == blj1Var.c && this.d == blj1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(ab80.k(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
}
