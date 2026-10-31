package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class po11 {
    public final long a;

    public po11(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po11) && this.a == ((po11) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
