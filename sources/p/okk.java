package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class okk extends vlk {
    public final long a;

    public okk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okk) && this.a == ((okk) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
