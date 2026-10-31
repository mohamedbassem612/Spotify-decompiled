package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xmm1 extends hah {
    public xmm1() {
        super(12884901889L, 14, "Generic XYZ");
    }

    public final float a(int i) {
        return 2.0f;
    }

    public final float b(int i) {
        return -2.0f;
    }

    public final long d(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f)) & 4294967295L);
    }

    public final float e(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    public final long f(float f, float f2, float f3, float f4, hah hahVar) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return z4p1.d(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, hahVar);
    }
}
