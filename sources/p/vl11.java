package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vl11 implements xl11 {
    public final long a;

    public vl11(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl11) && this.a == ((vl11) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
