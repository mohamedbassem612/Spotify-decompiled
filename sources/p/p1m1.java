package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p1m1 implements r1m1 {
    public final long a;

    public p1m1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1m1) && this.a == ((p1m1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
