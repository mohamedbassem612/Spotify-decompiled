package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vp21 extends ebp1 {
    public final long c;

    public vp21(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp21) && this.c == ((vp21) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }
}
