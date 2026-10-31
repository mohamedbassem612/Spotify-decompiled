package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ia10 {
    public final ioj0 a;
    public final boolean b;

    public ia10(ioj0 ioj0Var, boolean z) {
        this.a = ioj0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia10)) {
            return false;
        }
        ia10 ia10Var = (ia10) obj;
        return u890.j(this.a, ia10Var.a) && this.b == ia10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }
}
