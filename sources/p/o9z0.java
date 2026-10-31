package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o9z0 extends ejo1 {
    public final int d;

    public o9z0(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9z0) && this.d == ((o9z0) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }
}
