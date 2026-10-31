package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ca10 {
    public final ioj0 a;
    public final hwt b;

    public ca10(ioj0 ioj0Var, hwt hwtVar) {
        this.a = ioj0Var;
        this.b = hwtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca10)) {
            return false;
        }
        ca10 ca10Var = (ca10) obj;
        return u890.j(this.a, ca10Var.a) && u890.j(this.b, ca10Var.b);
    }

    public final int hashCode() {
        ioj0 ioj0Var = this.a;
        int iHashCode = (ioj0Var == null ? 0 : ioj0Var.a.hashCode()) * 31;
        hwt hwtVar = this.b;
        return iHashCode + (hwtVar != null ? hwtVar.hashCode() : 0);
    }
}
