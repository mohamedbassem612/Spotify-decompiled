package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fm51 implements hm51 {
    public final long a;

    public fm51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm51) && this.a == ((fm51) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
