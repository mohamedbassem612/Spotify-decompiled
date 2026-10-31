package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dzm0 {
    public final azm0 a;
    public final cxc b;

    public dzm0(azm0 azm0Var, cxc cxcVar) {
        this.a = azm0Var;
        this.b = cxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzm0)) {
            return false;
        }
        dzm0 dzm0Var = (dzm0) obj;
        return this.a == dzm0Var.a && u890.j(this.b, dzm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cxc cxcVar = this.b;
        return iHashCode + (cxcVar == null ? 0 : cxcVar.hashCode());
    }
}
