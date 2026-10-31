package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bjj1 implements cjj1 {
    public final long a;

    public bjj1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjj1) && this.a == ((bjj1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
