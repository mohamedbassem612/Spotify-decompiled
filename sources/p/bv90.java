package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bv90 implements dv90 {
    public final long a;

    public bv90(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv90) && this.a == ((bv90) obj).a;
    }

    @Override // p.dv90
    public final long getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
