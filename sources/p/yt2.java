package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class yt2 {
    public static final long a = z4p1.g(4280211296L);
    public static final long b = z4p1.g(4280211388L);
    public static final long c = z4p1.g(4282223336L);
    public static final long d = z4p1.g(4280211296L);
    public static final long e = z4p1.g(4280211388L);
    public static final long f = z4p1.g(4280194519L);
    public static final smc0 g;

    static {
        smc0 smc0VarN = k4p1.n();
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if ((i2 != 0 && i2 != 3) || (i != 0 && i != 3)) {
                    smc0VarN.add(new xt2(i2, i, !(1 <= i2 && i2 < 3 && 1 <= i && i < 3)));
                }
                i2++;
            }
            i++;
        }
        g = k4p1.k(smc0VarN);
    }

    public static float a(xt2 xt2Var) {
        long jB = b(xt2Var);
        return ((float) Math.hypot(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)))) / 14.400001f;
    }

    public static long b(xt2 xt2Var) {
        return (((long) Float.floatToRawIntBits((xt2Var.a - 1.5f) * 6.0f)) << 32) | (((long) Float.floatToRawIntBits((xt2Var.b - 1.5f) * 6.0f)) & 4294967295L);
    }
}
