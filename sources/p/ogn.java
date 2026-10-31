package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ogn implements ugn {
    public final long a;

    public ogn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogn) && this.a == ((ogn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
