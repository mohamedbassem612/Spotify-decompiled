package p;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qxg1 {
    public static qxg1 e;
    public final /* synthetic */ byte a;
    public boolean b;
    public long c;
    public long d;

    public void a(double d, double d2, long j) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.b = true;
            this.c = -1L;
            this.d = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.b = false;
                this.c = -1L;
                this.d = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.c = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.d = jRound;
            if (jRound >= j || this.c <= j) {
                this.b = true;
            } else {
                this.b = false;
            }
        }
    }

    public String toString() {
        TimeUnit timeUnit;
        String str;
        switch (this.a) {
            case 1:
                long jNanoTime = this.b ? (System.nanoTime() - this.d) + this.c : this.c;
                long j = jNanoTime / 86400000000000L;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (j > 0) {
                    timeUnit = TimeUnit.DAYS;
                } else if (jNanoTime / 3600000000000L > 0) {
                    timeUnit = TimeUnit.HOURS;
                } else if (jNanoTime / 60000000000L > 0) {
                    timeUnit = TimeUnit.MINUTES;
                } else if (jNanoTime / 1000000000 > 0) {
                    timeUnit = TimeUnit.SECONDS;
                } else if (jNanoTime / 1000000 > 0) {
                    timeUnit = TimeUnit.MILLISECONDS;
                } else {
                    timeUnit = jNanoTime / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
                }
                String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jNanoTime / timeUnit2.convert(1L, timeUnit)));
                switch (l1p1.a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        hhg1.c();
                        return null;
                }
                return l1d.q(new StringBuilder(str.length() + str2.length() + 1), str2, " ", str);
            default:
                return super.toString();
        }
    }
}
