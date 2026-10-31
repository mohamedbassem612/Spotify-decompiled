package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dyg {
    public final jo70 a;
    public final k1r b;

    public dyg(jo70 jo70Var, k1r k1rVar) {
        this.a = jo70Var;
        this.b = k1rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyg)) {
            return false;
        }
        dyg dygVar = (dyg) obj;
        return u890.j(this.a, dygVar.a) && this.b.equals(dygVar.b);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        return this.b.hashCode() + ((jo70Var == null ? 0 : jo70Var.hashCode()) * 31);
    }
}
