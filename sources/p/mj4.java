package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class mj4 {
    public static final float[] a;

    static {
        float f;
        float fD;
        float f2;
        float f3;
        float f4;
        float f5;
        float fD2;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100.0f;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                fD = c13.d(f13, f9, 2.0f, f9);
                f2 = f11 - fD;
                f3 = fD * 3.0f * f2;
                f4 = fD * fD * fD;
                float fP = c13.p(fD, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f11;
                if (Math.abs(fP - f12) < 1.0E-5d) {
                    break;
                }
                if (fP > f12) {
                    f13 = fD;
                } else {
                    f9 = fD;
                }
                f11 = f5;
            }
            float f14 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + fD) * f3) + f4;
            float f15 = f5;
            while (true) {
                fD2 = c13.d(f15, f10, f, f10);
                f6 = f5 - fD2;
                f7 = fD2 * 3.0f * f6;
                f8 = fD2 * fD2 * fD2;
                float fP2 = c13.p(f6, f14, fD2, f7) + f8;
                if (Math.abs(fP2 - f12) >= 1.0E-5d) {
                    if (fP2 > f12) {
                        f15 = fD2;
                    } else {
                        f10 = fD2;
                    }
                    f14 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((fD2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static double a(float f, float f2) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) f2));
    }

    public static kj4 b(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fO = yoi1.o(f, 0.0f, 1.0f);
        int i = (int) (100.0f * fO);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float fE = l1d.e(fO, f4, f6, f5);
            f2 = f6;
            f3 = fE;
        }
        return new kj4(f3, f2);
    }
}
