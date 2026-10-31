package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kcw extends j0o1 {
    public final rnf0 c;
    public final String d;
    public final o571 e;
    public final q6q0 f;

    static {
        idd1 idd1Var = o571.c;
    }

    public kcw(rnf0 rnf0Var, String str, o571 o571Var, q6q0 q6q0Var) {
        this.c = rnf0Var;
        this.d = str;
        this.e = o571Var;
        this.f = q6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcw)) {
            return false;
        }
        kcw kcwVar = (kcw) obj;
        return this.c.equals(kcwVar.c) && u890.j(this.d, kcwVar.d) && u890.j(this.e, kcwVar.e) && u890.j(this.f, kcwVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d)) * 31;
        q6q0 q6q0Var = this.f;
        return iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode());
    }
}
