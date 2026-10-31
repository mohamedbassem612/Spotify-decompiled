package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class shf0 implements yhf0 {
    public final long a;

    public shf0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shf0) && this.a == ((shf0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
