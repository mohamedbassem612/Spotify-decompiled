package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a3j1 {
    public final a7q0 a;
    public final uxn b;

    public a3j1(a7q0 a7q0Var, uxn uxnVar) {
        this.a = a7q0Var;
        this.b = uxnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3j1)) {
            return false;
        }
        a3j1 a3j1Var = (a3j1) obj;
        return u890.j(this.a, a3j1Var.a) && u890.j(this.b, a3j1Var.b);
    }

    public final int hashCode() {
        a7q0 a7q0Var = this.a;
        int iHashCode = (a7q0Var == null ? 0 : a7q0Var.hashCode()) * 31;
        uxn uxnVar = this.b;
        return iHashCode + (uxnVar != null ? uxnVar.a.hashCode() : 0);
    }
}
