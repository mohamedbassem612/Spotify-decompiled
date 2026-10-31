package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vzo0 extends pno1 {
    public final boolean d;

    public vzo0(boolean z) {
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzo0) && this.d == ((vzo0) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }
}
