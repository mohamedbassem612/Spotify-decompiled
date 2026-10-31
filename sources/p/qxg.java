package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qxg {
    public final x4i1 a;

    public qxg(x4i1 x4i1Var) {
        this.a = x4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxg) && u890.j(this.a, ((qxg) obj).a);
    }

    public final int hashCode() {
        x4i1 x4i1Var = this.a;
        if (x4i1Var == null) {
            return 0;
        }
        return x4i1Var.hashCode();
    }
}
