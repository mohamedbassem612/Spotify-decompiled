package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gm51 implements hm51 {
    public final long a;

    public gm51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm51) && this.a == ((gm51) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
