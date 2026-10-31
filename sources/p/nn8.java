package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nn8 implements on8 {
    public final long a;

    public nn8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn8) && this.a == ((nn8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
