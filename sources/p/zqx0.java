package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zqx0 extends frx0 {
    public final long a;

    public zqx0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqx0) && this.a == ((zqx0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
