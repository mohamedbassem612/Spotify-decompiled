package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bay0 {
    public final o571 a;
    public final q6q0 b;
    public final p371 c;

    static {
        idd1 idd1Var = o571.c;
    }

    public bay0(o571 o571Var, q6q0 q6q0Var, p371 p371Var) {
        this.a = o571Var;
        this.b = q6q0Var;
        this.c = p371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bay0)) {
            return false;
        }
        bay0 bay0Var = (bay0) obj;
        return u890.j(this.a, bay0Var.a) && u890.j(this.b, bay0Var.b) && u890.j(this.c, bay0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        q6q0 q6q0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode())) * 31);
    }
}
