package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dfn implements ugn {
    public final long a;

    public dfn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfn) && this.a == ((dfn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
