package p;

import androidx.car.app.hardware.info.EnergyProfile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class lj4 {
    public static final float[] a = new float[EnergyProfile.EVCONNECTOR_TYPE_OTHER];
    public static final float[] b = new float[EnergyProfile.EVCONNECTOR_TYPE_OTHER];

    static {
        float f;
        float fD;
        float f2;
        float f3;
        float f4;
        float fD2;
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        int i = 0;
        float f9 = 0.0f;
        while (true) {
            float f10 = 1.0f;
            if (i >= 100) {
                b[100] = 1.0f;
                a[100] = 1.0f;
                return;
            }
            float f11 = i / 100.0f;
            float f12 = 1.0f;
            while (true) {
                f = 2.0f;
                fD = c13.d(f12, f8, 2.0f, f8);
                f2 = f10 - fD;
                f3 = fD * 3.0f * f2;
                f4 = fD * fD * fD;
                float fP = c13.p(fD, 0.35000002f, f2 * 0.175f, f3) + f4;
                f10 = f10;
                float f13 = f12;
                if (Math.abs(fP - f11) < 1.0E-5d) {
                    break;
                }
                if (fP > f11) {
                    f12 = fD;
                } else {
                    f8 = fD;
                    f12 = f13;
                }
            }
            float f14 = 0.5f;
            a[i] = (((f2 * 0.5f) + fD) * f3) + f4;
            float f15 = f10;
            while (true) {
                fD2 = c13.d(f15, f9, f, f9);
                f5 = f10 - fD2;
                f6 = fD2 * 3.0f * f5;
                f7 = fD2 * fD2 * fD2;
                float fP2 = c13.p(f5, f14, fD2, f6) + f7;
                if (Math.abs(fP2 - f11) >= 1.0E-5d) {
                    if (fP2 > f11) {
                        f15 = fD2;
                    } else {
                        f9 = fD2;
                    }
                    f14 = 0.5f;
                    f = 2.0f;
                }
            }
            b[i] = (((fD2 * 0.35000002f) + (f5 * 0.175f)) * f6) + f7;
            i++;
        }
    }

    public static long a(float f) {
        float fE;
        float f2;
        int i = (int) (100.0f * f);
        if (i < 100) {
            float f3 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f4 = fArr[i];
            f2 = (fArr[i2] - f4) / ((i2 / 100.0f) - f3);
            fE = l1d.e(f, f3, f2, f4);
        } else {
            fE = 1.0f;
            f2 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }
}
