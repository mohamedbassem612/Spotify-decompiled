package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u4h1 implements Comparable {
    public final int a;

    public /* synthetic */ u4h1(int i) {
        this.a = i;
    }

    public static final /* synthetic */ u4h1 a(int i) {
        return new u4h1(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return u890.q(this.a ^ Integer.MIN_VALUE, ((u4h1) obj).a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u4h1) {
            return this.a == ((u4h1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(((long) this.a) & 4294967295L);
    }
}
