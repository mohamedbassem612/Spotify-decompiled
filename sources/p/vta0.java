package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vta0 {
    public final iys0 a;

    public vta0(iys0 iys0Var) {
        this.a = iys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vta0) && u890.j(this.a, ((vta0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
