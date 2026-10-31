package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vs71 {
    public static final yky0 a = new yky0(da71.U0);

    public static final long a(elb0 elb0Var, elb0 elb0Var2, long j) {
        n511 n511VarM = elb0Var2.M(elb0Var, false);
        float f = n511VarM.a;
        float f2 = n511VarM.c - f;
        int i = ofg1.c;
        float fE = us71.e((int) (j >> 32), f2, f);
        float f3 = n511VarM.b;
        float fE2 = us71.e((int) (j & 4294967295L), n511VarM.d - f3, f3);
        return (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L);
    }

    public static final long b(long j, long j2, long j3, float f) {
        int i = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) + ((Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat(i)) * f) + ((int) (j3 >> 32));
        int i2 = (int) (j2 & 4294967295L);
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) + ((Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i2)) * f) + ((int) (j3 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
