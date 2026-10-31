package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class hah {
    public final String a;
    public final long b;
    public final int c;

    public hah(long j, int i, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            hhg1.n("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            hhg1.n("The id must be between -1 and 63");
            throw null;
        }
    }

    public float a(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    public float b(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    public boolean c() {
        return false;
    }

    public long d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        float[] fArr = dm5.f;
        return (((long) Float.floatToRawIntBits(f6 * fArr[0])) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f7 * fArr[1])));
    }

    public float e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * dm5.f[2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hah hahVar = (hah) obj;
        if (this.c == hahVar.c && this.a.equals(hahVar.a)) {
            return jch0.x(this.b, hahVar.b);
        }
        return false;
    }

    public long f(float f, float f2, float f3, float f4, hah hahVar) {
        float[] fArr = dm5.f;
        float f5 = f / fArr[0];
        float f6 = f2 / fArr[1];
        float f7 = f3 / fArr[2];
        float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
        float f8 = (116.0f * fCbrt2) - 16.0f;
        float f9 = (fCbrt - fCbrt2) * 500.0f;
        float f10 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 100.0f) {
            f8 = 100.0f;
        }
        if (f9 < -128.0f) {
            f9 = -128.0f;
        }
        if (f9 > 128.0f) {
            f9 = 128.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        return z4p1.d(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, hahVar);
    }

    public int hashCode() {
        return cy30.f(this.a.hashCode() * 31, this.b, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + jch0.g0(this.b) + ")";
    }
}
