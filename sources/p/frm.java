package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class frm {
    public static final kiv a = new kiv(lmm.f, (byte) 1);
    public static final kiv b = new kiv(lmm.e, (byte) 1);

    public static final long a(long j, long j2, long j3, float f) {
        long jC = c(f, j2, (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC & 4294967295L));
        return (((long) Float.floatToRawIntBits(yoi1.o(Float.intBitsToFloat((int) (j >> 32)), -fIntBitsToFloat, fIntBitsToFloat))) << 32) | (((long) Float.floatToRawIntBits(yoi1.o(Float.intBitsToFloat((int) (j & 4294967295L)), -fIntBitsToFloat2, fIntBitsToFloat2))) & 4294967295L);
    }

    public static final Object b(Function0 function0, Function0 function1, lnm lnmVar, iu30 iu30Var, vu30 vu30Var, nav0 nav0Var) {
        j8d1 j8d1Var = (j8d1) nav0Var;
        j8d1Var.getClass();
        Object objD = s9p1.D(nav0Var, new erm(function1, oap1.B(j8d1Var).b1.g(), vu30Var, iu30Var, function0, null), lnmVar);
        return objD == d9n.a ? objD : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    public static final long c(float f, long j, long j2) {
        long jFloatToRawIntBits;
        if (j == 9205357640488583168L) {
            jFloatToRawIntBits = j2;
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) > 0.0f) {
                int i2 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i2) <= 0.0f) {
                    jFloatToRawIntBits = j2;
                } else {
                    int i3 = (int) (j >> 32);
                    int i4 = (int) (j & 4294967295L);
                    float fMin = Math.min(Float.intBitsToFloat(i) / Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) / Float.intBitsToFloat(i4));
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i4) * fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) * fMin)) << 32);
                }
            } else {
                jFloatToRawIntBits = j2;
            }
        }
        float fIntBitsToFloat = ((Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * f) / 2.0f) - (Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f);
        if (fIntBitsToFloat < 0.0f) {
            fIntBitsToFloat = 0.0f;
        }
        float fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * f) / 2.0f) - (Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f);
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 >= 0.0f ? fIntBitsToFloat2 : 0.0f)) & 4294967295L);
    }
}
