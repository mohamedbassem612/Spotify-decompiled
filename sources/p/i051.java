package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i051 extends q151 {
    public final xrt0 a;

    public i051(xrt0 xrt0Var) {
        this.a = xrt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i051) && this.a.equals(((i051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
