package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yr80 {
    public final long a;

    public static boolean a(long j, Object obj) {
        return (obj instanceof yr80) && j == ((yr80) obj).a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static String c(long j) {
        return ab80.m((int) (j >> 32), (int) (j & 4294967295L), " x ");
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
