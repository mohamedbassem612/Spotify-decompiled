package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vaf0 extends xaf0 {
    public final vdu0 a;

    public vaf0(vdu0 vdu0Var) {
        this.a = vdu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vaf0) && this.a.equals(((vaf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
