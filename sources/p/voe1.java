package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class voe1 implements Comparable {
    public final long a;

    public static long a(long j) {
        return kkn.y(sjm0.a(), j);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return jap1.o(this, (voe1) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof voe1) {
            return this.a == ((voe1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
