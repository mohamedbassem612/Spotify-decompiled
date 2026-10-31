package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hr20 implements uq20 {
    public final int a;
    public final dlv b;
    public final long c;
    public final long d;

    public hr20(int i, int i2, dlv dlvVar) {
        this.a = i;
        this.b = dlvVar;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // p.uq20
    public final float b(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(f, f2, f3, j4) - e(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }

    @Override // p.uq20
    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // p.uq20
    public final float e(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fA = this.b.a(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fA) + ((1.0f - fA) * f);
    }

    public hr20(int i, int i2) {
        this(i, i2, mlv.a);
    }
}
