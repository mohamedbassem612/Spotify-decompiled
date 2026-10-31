package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ea10 {
    public final ioj0 a;

    public ea10(ioj0 ioj0Var) {
        this.a = ioj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea10) && u890.j(this.a, ((ea10) obj).a);
    }

    public final int hashCode() {
        ioj0 ioj0Var = this.a;
        if (ioj0Var == null) {
            return 0;
        }
        return ioj0Var.a.hashCode();
    }
}
