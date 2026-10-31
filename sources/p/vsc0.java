package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vsc0 extends gxo1 {
    public final wzc0 b;

    public vsc0(wzc0 wzc0Var) {
        this.b = wzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsc0) && u890.j(this.b, ((vsc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
