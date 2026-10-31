package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gew0 implements kew0 {
    public final long a;

    public gew0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gew0) && this.a == ((gew0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
