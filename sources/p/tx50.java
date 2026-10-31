package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tx50 implements ux50 {
    public final long a;

    public tx50(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx50) && this.a == ((tx50) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
