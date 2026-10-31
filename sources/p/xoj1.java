package p;

import android.util.Range;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xoj1 {
    public long a;
    public long b;
    public double c;
    public Range d;

    public xoj1() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void a(long j, long j2) {
        double dDoubleValue;
        dm5.m(j != -9223372036854775807L);
        dm5.m(j2 != -9223372036854775807L);
        long j3 = this.a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.b;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
        }
        this.c = (((Double) this.d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }

    public final void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void c(float f) {
        dm5.m(f > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        b();
    }
}
