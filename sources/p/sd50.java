package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sd50 extends yon1 {
    public final int d;

    public sd50(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd50) && this.d == ((sd50) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }
}
