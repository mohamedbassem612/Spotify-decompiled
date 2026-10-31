package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e5a0 {
    public final tpt a;
    public final ga61 b;
    public final wb0 c;
    public final np21 d;

    public e5a0(tpt tptVar, ga61 ga61Var, wb0 wb0Var, np21 np21Var) {
        this.a = tptVar;
        this.b = ga61Var;
        this.c = wb0Var;
        this.d = np21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5a0)) {
            return false;
        }
        e5a0 e5a0Var = (e5a0) obj;
        return u890.j(this.a, e5a0Var.a) && u890.j(this.b, e5a0Var.b) && u890.j(this.c, e5a0Var.c) && u890.j(this.d, e5a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ga61 ga61Var = this.b;
        int iHashCode2 = (iHashCode + (ga61Var == null ? 0 : ga61Var.hashCode())) * 31;
        wb0 wb0Var = this.c;
        int iHashCode3 = (iHashCode2 + (wb0Var == null ? 0 : wb0Var.hashCode())) * 31;
        np21 np21Var = this.d;
        return iHashCode3 + (np21Var != null ? np21Var.hashCode() : 0);
    }
}
