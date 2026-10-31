package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qo11 {
    public final long a;

    public qo11(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo11) && this.a == ((qo11) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
