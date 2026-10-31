package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u7h {
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final /* synthetic */ int l = 0;
    public final long a;

    static {
        new nfb((byte) 2, false);
        b = z4p1.g(4278190080L);
        c = z4p1.g(4282664004L);
        d = z4p1.g(4287137928L);
        e = z4p1.g(4291611852L);
        f = z4p1.g(4294967295L);
        g = z4p1.g(4294901760L);
        z4p1.g(4278255360L);
        h = z4p1.g(4278190335L);
        z4p1.g(4294967040L);
        z4p1.g(4278255615L);
        i = z4p1.g(4294902015L);
        j = z4p1.e(0);
        k = z4p1.d(0.0f, 0.0f, 0.0f, 0.0f, kah.u);
    }

    public /* synthetic */ u7h(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, hah hahVar) {
        return h5p1.v(e(j2), hahVar).a(j2);
    }

    public static long b(long j2, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = c(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = g(j2);
        }
        if ((i2 & 4) != 0) {
            f4 = f(j2);
        }
        if ((i2 & 8) != 0) {
            f5 = d(j2);
        }
        return z4p1.d(f3, f4, f5, f2, e(j2));
    }

    public static final float c(long j2) {
        float fE;
        float f2;
        if ((63 & j2) == 0) {
            fE = (float) u890.E((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fE = (float) u890.E((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fE / f2;
    }

    public static final float d(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) u890.E((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - tq20.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final hah e(long j2) {
        float[] fArr = kah.a;
        return kah.y[(int) (j2 & 63)];
    }

    public static final float f(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) u890.E((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - tq20.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) u890.E((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - tq20.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String h(long j2) {
        float fG = g(j2);
        float f2 = f(j2);
        float fD = d(j2);
        float fC = c(j2);
        String str = e(j2).a;
        StringBuilder sbM = gvg.m("Color(", fG, ", ", f2, ", ");
        gvg.t(sbM, fD, ", ", fC, ", ");
        return l1d.n(str, ")", sbM);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u7h) {
            return this.a == ((u7h) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return z4h1.c(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
