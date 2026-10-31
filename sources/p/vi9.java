package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vi9 implements bj9 {
    public final long a;

    public vi9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vi9) && this.a == ((vi9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
