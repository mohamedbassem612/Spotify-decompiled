package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class dqz0 {
    public static final cqz0 a = new cqz0();
    public static final e9 b = ozn1.a.h();

    public int a(int i) {
        return b.a(i);
    }

    public double b() {
        return tyo1.i(a(26), a(27));
    }

    public double c(double d) {
        return d(0.0d, d);
    }

    public double d(double d, double d2) {
        double dB;
        if (d2 <= d) {
            hhg1.f(j2h1.i(Double.valueOf(d), Double.valueOf(d2)));
            return 0.0d;
        }
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            dB = d + (b() * d3);
        } else {
            double dB2 = ((d2 / 2.0d) - (d / 2.0d)) * b();
            dB = d + dB2 + dB2;
        }
        return dB >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dB;
    }

    public float e() {
        return a(24) / 1.6777216E7f;
    }

    public int f() {
        return b.f();
    }

    public int g(int i) {
        return h(0, i);
    }

    public int h(int i, int i2) {
        int iF;
        int i3;
        int iA;
        if (i2 <= i) {
            hhg1.f(j2h1.i(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iF = f() >>> 1;
                    i3 = iF % i4;
                } while ((i4 - 1) + (iF - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iF2 = f();
            if (i <= iF2 && iF2 < i2) {
                return iF2;
            }
        }
    }

    public long i() {
        return (((long) f()) << 32) + ((long) f());
    }

    public long j(long j) {
        return k(0L, j);
    }

    public long k(long j, long j2) {
        long jI;
        long j3;
        long jA;
        int iF;
        if (j2 <= j) {
            hhg1.f(j2h1.i(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iF = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iF = f();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) f()) & 4294967295L);
                }
                jA = ((long) iF) & 4294967295L;
            } else {
                do {
                    jI = i() >>> 1;
                    j3 = jI % j4;
                } while ((j4 - 1) + (jI - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jI2 = i();
            if (j <= jI2 && jI2 < j2) {
                return jI2;
            }
        }
    }
}
