package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class as80 implements j6m {
    public static final as80 b = new as80(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ as80(byte b2) {
        this.a = b2;
    }

    public final long a(long j, long j2) {
        switch (this.a) {
            case 0:
                float fFloor = (float) Math.floor(Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L))));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor)) << 32) | (((long) Float.floatToRawIntBits(fFloor)) & 4294967295L);
                int i = lg41.a;
                return jFloatToRawIntBits;
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i2 = lg41.a;
                return jFloatToRawIntBits2;
            case 2:
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
                int i3 = lg41.a;
                return jFloatToRawIntBits3;
            case 3:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i4 = lg41.a;
                return jFloatToRawIntBits4;
            case 4:
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i5 = lg41.a;
                return jFloatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i6 = lg41.a;
                    return jFloatToRawIntBits6;
                }
                float fM = wqn1.m(j, j2);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(fM)) & 4294967295L);
                int i7 = lg41.a;
                return jFloatToRawIntBits7;
        }
    }
}
