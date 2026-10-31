package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vhe {
    public final tv80 a;

    public vhe(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhe) && this.a.equals(((vhe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
