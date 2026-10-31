package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pu41 {
    public final long a;
    public final long b;
    public final long c;
    public final float d;

    public pu41(long j, long j2, long j3, float f) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
    }

    public static pu41 a(pu41 pu41Var, long j, long j2) {
        long j3 = pu41Var.b;
        float f = pu41Var.d;
        pu41Var.getClass();
        return new pu41(j, j3, j2, f);
    }

    public final long b() {
        return this.b;
    }

    public final float c(long j) {
        long j2 = this.b;
        if (j2 <= 0) {
            return 0.0f;
        }
        return yoi1.o((this.a + (this.d * (j - this.c))) / j2, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu41)) {
            return false;
        }
        pu41 pu41Var = (pu41) obj;
        return this.a == pu41Var.a && this.b == pu41Var.b && this.c == pu41Var.c && Float.compare(this.d, pu41Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
