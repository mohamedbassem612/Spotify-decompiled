package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ul20 implements wl20 {
    public final long a;

    public ul20(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul20) && this.a == ((ul20) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
