package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zgj1 {
    public final o571 a;
    public final q6q0 b;
    public final p371 c;

    static {
        idd1 idd1Var = o571.c;
    }

    public zgj1(o571 o571Var, q6q0 q6q0Var, p371 p371Var) {
        this.a = o571Var;
        this.b = q6q0Var;
        this.c = p371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgj1)) {
            return false;
        }
        zgj1 zgj1Var = (zgj1) obj;
        return u890.j(this.a, zgj1Var.a) && u890.j(this.b, zgj1Var.b) && u890.j(this.c, zgj1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        q6q0 q6q0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode())) * 31);
    }
}
