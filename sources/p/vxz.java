package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vxz extends d1o1 {
    public final sqj1 e;

    public vxz(sqj1 sqj1Var) {
        this.e = sqj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxz) && this.e.equals(((vxz) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
