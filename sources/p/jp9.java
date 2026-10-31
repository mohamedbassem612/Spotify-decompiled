package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jp9 implements lp9 {
    public final long a;
    public final Long b;
    public final int c;
    public final long d;
    public final float e;

    public jp9(long j, Long l, int i, long j2, float f) {
        this.a = j;
        this.b = l;
        this.c = i;
        this.d = j2;
        this.e = f;
    }

    public final long a(long j) {
        long j2 = this.a + ((long) (this.e * (j - this.d)));
        Long l = this.b;
        return yoi1.r(j2, 0L, l != null ? l.longValue() : Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp9)) {
            return false;
        }
        jp9 jp9Var = (jp9) obj;
        return this.a == jp9Var.a && u890.j(this.b, jp9Var.b) && this.c == jp9Var.c && this.d == jp9Var.d && Float.compare(this.e, jp9Var.e) == 0;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        return Float.hashCode(this.e) + cy30.f(ab80.k(this.c, (iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31), this.d, 31);
    }
}
