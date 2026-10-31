package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z4h1 implements Comparable {
    public final long a;

    public /* synthetic */ z4h1(long j) {
        this.a = j;
    }

    public static final /* synthetic */ z4h1 a(long j) {
        return new z4h1(j);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static int c(long j) {
        return Long.hashCode(j);
    }

    public static String d(long j) {
        if (j >= 0) {
            eth.h(10);
            return Long.toString(j, 10);
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        eth.h(10);
        String string = Long.toString(j2, 10);
        eth.h(10);
        return string.concat(Long.toString(j3, 10));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return u890.r(this.a ^ Long.MIN_VALUE, ((z4h1) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z4h1) {
            return this.a == ((z4h1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
