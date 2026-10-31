package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rvi1 {
    public final long a;

    public rvi1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvi1) && this.a == ((rvi1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
