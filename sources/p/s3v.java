package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s3v {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String c(long j) {
        return j != 9205357640488583168L ? f4i1.f(p3v.d(b(j)), " x ", p3v.d(a(j))) : "DpSize.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s3v) {
            return this.a == ((s3v) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
