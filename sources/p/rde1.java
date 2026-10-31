package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rde1 {
    public final long a;

    public rde1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rde1) && this.a == ((rde1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
