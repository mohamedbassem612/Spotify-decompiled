package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ihx {
    public static final long a = z4p1.f(53, 53, 53, 255);
    public static final long b = z4p1.f(86, 86, 86, 255);
    public static final long c = z4p1.f(255, 255, 255, 255);
    public static final long d = z4p1.f(205, 205, 205, 255);
    public static final long e = z4p1.f(30, 215, 96, 255);
    public static final /* synthetic */ int f = 0;

    public static long a(int i, long j, int i2) {
        float fD;
        float f2;
        float f3;
        float fG = u7h.g(j);
        float f4 = u7h.f(j);
        float fD2 = u7h.d(j);
        float fMax = Math.max(fG, Math.max(f4, fD2));
        float fMin = fMax - Math.min(fG, Math.min(f4, fD2));
        if (fMin == 0.0f) {
            f2 = 0.0f;
        } else {
            if (fMax == fG) {
                fD = ((f4 - fD2) / fMin) + (f4 < fD2 ? 6 : 0);
            } else if (fMax == f4) {
                fD = c13.d(fD2, fG, fMin, 2.0f);
            } else {
                fD = fMax == fD2 ? c13.d(fG, f4, fMin, 4.0f) : 0.0f;
            }
            f2 = fD / 6.0f;
        }
        float fMin2 = Math.min(Math.max(f2, 0.0f), 1.0f);
        float fG2 = u7h.g(j);
        float f5 = u7h.f(j);
        float fD3 = u7h.d(j);
        float fMax2 = Math.max(fG2, Math.max(f5, fD3));
        float fMin3 = Math.min(fG2, Math.min(f5, fD3));
        float f6 = fMax2 - fMin3;
        if (f6 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = ((double) b(j)) > 0.5d ? f6 / ((2.0f - fMax2) - fMin3) : f6 / (fMax2 + fMin3);
        }
        float fMin4 = Math.min(Math.max(f3, 0.0f), 1.0f);
        float fMin5 = Math.min(Math.max((i * 0.05f * i2) + b(j), 0.0f), 1.0f);
        if (fMin4 == 0.0f) {
            return z4p1.h(fMin5, fMin5, fMin5, u7h.c(j), 16);
        }
        float f7 = ((double) fMin5) < 0.5d ? (fMin4 + 1.0f) * fMin5 : (fMin5 + fMin4) - (fMin4 * fMin5);
        float f8 = (2.0f * fMin5) - f7;
        return z4p1.h(Math.min(g(f8, f7, fMin2 + 0.3333f), 1.0f), Math.min(g(f8, f7, fMin2), 1.0f), Math.min(g(f8, f7, fMin2 - 0.3333f), 1.0f), u7h.c(j), 16);
    }

    public static float b(long j) {
        return (Math.min(u7h.g(j), Math.min(u7h.f(j), u7h.d(j))) + Math.max(u7h.g(j), Math.max(u7h.f(j), u7h.d(j)))) / 2.0f;
    }

    public static float c(long j, long j2) {
        float fH = h(j) + 0.05f;
        float fH2 = h(j2) + 0.05f;
        return fH > fH2 ? fH / fH2 : fH2 / fH;
    }

    public static afx d(long j, long j2, long j3, long j4, long j5) {
        long j6 = j != 16 ? j : a;
        long j7 = j2 != 16 ? j2 : b;
        long j8 = j3 != 16 ? j3 : c;
        long j9 = j4 != 16 ? j4 : d;
        long j10 = j5 != 16 ? j5 : e;
        spw spwVarF = f(j6, j8);
        long j11 = j8;
        long j12 = j8;
        long j13 = j8;
        long j14 = j8;
        return new afx(new icx(spwVarF, f(j7, j8), j6, spwVarF.c(), spwVarF.b()), new yxx(j8, j9, j10, j11, j12, j13, j14), new ohx(j8, j9, j10, j11, j12, j13, j14), new wgx(j8, j9));
    }

    public static afx e(int i, long j, long j2, long j3) {
        long jP;
        long jP2;
        if ((i & 2) != 0) {
            int i2 = u7h.l;
            jP = nfb.p();
        } else {
            jP = j2;
        }
        if ((i & 4) != 0) {
            int i3 = u7h.l;
            jP2 = nfb.p();
        } else {
            jP2 = j3;
        }
        int i4 = u7h.l;
        return d(j, jP, jP2, nfb.p(), nfb.p());
    }

    public static spw f(long j, long j2) {
        int i = b(j2) >= b(j) ? -1 : 1;
        return bpo1.e(a(0, j, i), a(1, j, i), a(2, j, i));
    }

    public static float g(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 1.0f;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        if (f4 < 0.1667d) {
            return ((f3 - f2) * 6.0f * f4) + f2;
        }
        if (f4 < 0.5f) {
            return f3;
        }
        if (f4 >= 0.6667f) {
            return f2;
        }
        return ((0.6667f - f4) * (f3 - f2) * 6.0f) + f2;
    }

    public static float h(long j) {
        float fI = i(u7h.g(j) / 255.0f);
        float fI2 = i(u7h.f(j) / 255.0f) * 0.7152f;
        return (i(u7h.d(j) / 255.0f) * 0.0722f) + fI2 + (fI * 0.2126f);
    }

    public static final float i(float f2) {
        return f2 <= 0.03928f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }
}
