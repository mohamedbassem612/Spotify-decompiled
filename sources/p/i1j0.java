package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i1j0 implements j1j0 {
    public final long a;

    public i1j0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1j0) && this.a == ((i1j0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
