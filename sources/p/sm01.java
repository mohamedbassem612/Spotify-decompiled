package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sm01 implements tm01 {
    public final long a;

    public sm01(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm01) && this.a == ((sm01) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
