package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class che1 {
    public final fdn0 a;
    public bhe1 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public che1() {
        fdn0 fdn0Var = pr80.a;
        this.a = new fdn0();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public static long a(bhe1 bhe1Var, long j, long j2, float[] fArr, long j3, long j4) {
        long j5 = bhe1Var.c;
        if (j5 > 0) {
            long j6 = bhe1Var.j;
            if (j6 > 0) {
                if (j3 - j6 < j5) {
                    return Math.min(j4, j6 + j5);
                }
                bhe1Var.i = j3;
                bhe1Var.j = -1L;
                bhe1Var.a(bhe1Var.g, bhe1Var.h, j, j2, fArr);
                return j4;
            }
        }
        return j4;
    }

    public final void b(bhe1 bhe1Var, long j, long j2, float[] fArr, long j3) {
        long j4 = bhe1Var.i;
        long j5 = bhe1Var.c;
        boolean z = j3 - j4 > ((long) bhe1Var.b) || j4 == Long.MIN_VALUE;
        boolean z2 = j5 == 0;
        bhe1Var.j = j3;
        if (z && z2) {
            bhe1Var.i = j3;
            bhe1Var.a(bhe1Var.g, bhe1Var.h, j, j2, fArr);
        }
        if (z2) {
            return;
        }
        long j6 = this.c;
        long j7 = j3 + j5;
        if (j6 <= 0 || j7 >= j6) {
            return;
        }
        this.c = j6;
    }

    public final boolean c(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (qr80.b(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!qr80.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
