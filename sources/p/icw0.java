package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class icw0 implements pcw0 {
    public final long a;

    public icw0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icw0) && this.a == ((icw0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
