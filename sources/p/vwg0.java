package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vwg0 extends z0o1 {
    public final lx0 c;

    public vwg0(lx0 lx0Var) {
        this.c = lx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwg0) && this.c.equals(((vwg0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
