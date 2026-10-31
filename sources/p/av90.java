package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class av90 implements dv90 {
    public final long a;

    public av90(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av90) && this.a == ((av90) obj).a;
    }

    @Override // p.dv90
    public final long getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
