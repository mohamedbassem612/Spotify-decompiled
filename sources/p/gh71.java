package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gh71 extends u1p1 {
    public final bb71 c;
    public final p371 d;
    public final o571 e;
    public final String f;
    public final q6q0 g;

    static {
        idd1 idd1Var = o571.c;
    }

    public gh71(bb71 bb71Var, p371 p371Var, o571 o571Var, String str, q6q0 q6q0Var) {
        this.c = bb71Var;
        this.d = p371Var;
        this.e = o571Var;
        this.f = str;
        this.g = q6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh71)) {
            return false;
        }
        gh71 gh71Var = (gh71) obj;
        return this.c.equals(gh71Var.c) && u890.j(this.d, gh71Var.d) && u890.j(this.e, gh71Var.e) && u890.j(this.f, gh71Var.f) && u890.j(this.g, gh71Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31, this.f);
        q6q0 q6q0Var = this.g;
        return iD + (q6q0Var == null ? 0 : q6q0Var.hashCode());
    }
}
