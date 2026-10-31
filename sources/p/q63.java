package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q63 implements r63 {
    public final long a;

    public q63(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q63) && this.a == ((q63) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
