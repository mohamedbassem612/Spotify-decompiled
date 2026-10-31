package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r3v {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        return j != 9205357640488583168L ? cy30.p("(", p3v.d(a(j)), ", ", p3v.d(b(j)), ")") : "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r3v) {
            return this.a == ((r3v) obj).a;
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
