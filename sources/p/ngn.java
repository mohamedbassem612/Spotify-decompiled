package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ngn implements ugn {
    public final long a;

    public ngn(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngn) && this.a == ((ngn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
