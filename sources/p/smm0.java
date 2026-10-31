package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class smm0 {
    public final long a;

    public /* synthetic */ smm0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ smm0 a(long j) {
        return new smm0(j);
    }

    public static long b(long j, long j2) {
        return ((j & 2147483647L) << 1) | 1 | (((long) ((((short) Float.intBitsToFloat((int) (j2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (j2 >> 32))) << 16))) << 32);
    }

    public static final boolean c(long j) {
        return (j & 1) != 0;
    }

    public static final long d(long j) {
        int i = (int) (j >>> 32);
        return (((long) Float.floatToRawIntBits((short) (i & 65535))) & 4294967295L) | (Float.floatToRawIntBits((short) (i >>> 16)) << 32);
    }

    public static final long e(long j) {
        return (j >> 1) & 2147483647L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smm0) {
            return this.a == ((smm0) obj).a;
        }
        return false;
    }

    public final /* synthetic */ long f() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return gvg.f(this.a, "IndirectPointerEventData(packedValue=", ")");
    }
}
