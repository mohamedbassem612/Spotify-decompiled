package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ft11 {
    public final ioj0 a;
    public final boolean b;

    public ft11(ioj0 ioj0Var, boolean z) {
        this.a = ioj0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft11)) {
            return false;
        }
        ft11 ft11Var = (ft11) obj;
        return u890.j(this.a, ft11Var.a) && this.b == ft11Var.b;
    }

    public final int hashCode() {
        ioj0 ioj0Var = this.a;
        return Boolean.hashCode(this.b) + ((ioj0Var == null ? 0 : ioj0Var.a.hashCode()) * 31);
    }
}
