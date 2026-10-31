package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s2v0 implements t2v0 {
    public final long a;

    public s2v0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2v0) && this.a == ((s2v0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
