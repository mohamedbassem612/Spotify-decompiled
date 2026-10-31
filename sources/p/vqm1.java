package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vqm1 extends arm1 {
    public final tv80 a;

    public vqm1(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqm1) && u890.j(this.a, ((vqm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
