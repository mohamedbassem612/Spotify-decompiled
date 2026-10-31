package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ejk1 {
    public static final ejk1 e = new ejk1(0, 0, 0, 0.0f);
    public final long a;
    public final float b;
    public final long c;
    public final long d;

    public ejk1(long j, long j2, long j3, float f) {
        this.a = j;
        this.b = f;
        this.c = j2;
        this.d = j3;
    }

    public static ejk1 a(ejk1 ejk1Var, long j, float f, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j = ejk1Var.a;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            f = ejk1Var.b;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = ejk1Var.c;
        }
        long j5 = j2;
        if ((i & 8) != 0) {
            j3 = ejk1Var.d;
        }
        ejk1Var.getClass();
        return new ejk1(j4, j5, j3, f2);
    }

    public static ejk1 c(ejk1 ejk1Var, uvg1 uvg1Var) {
        ejk1 ejk1Var2;
        long j = uvg1Var.c;
        if (j <= 0) {
            ejk1Var2 = ejk1Var;
            ejk1Var2.getClass();
        } else {
            if (ejk1Var.b > 0.0f) {
                float f = (uvg1Var.a + uvg1Var.b) / 2.0f;
                float f2 = (j / 0.3f) / 2.0f;
                return a(ejk1Var, 0L, 0.0f, (long) (f - f2), (long) (f + f2), 3);
            }
            ejk1Var2 = ejk1Var;
        }
        return ejk1Var2;
    }

    public final float b() {
        long j = this.d;
        long j2 = this.c;
        if (j - j2 <= 0) {
            return 0.0f;
        }
        return this.b / (j - j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejk1)) {
            return false;
        }
        ejk1 ejk1Var = (ejk1) obj;
        return this.a == ejk1Var.a && Float.compare(this.b, ejk1Var.b) == 0 && this.c == ejk1Var.c && this.d == ejk1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(x0d.f(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }
}
