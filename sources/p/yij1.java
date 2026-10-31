package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yij1 implements cjj1 {
    public final long a;

    public yij1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yij1) && this.a == ((yij1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
