package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ihj1 extends khj1 {
    public final int a;
    public final o571 b;
    public final q6q0 c;
    public final p371 d;

    static {
        idd1 idd1Var = o571.c;
    }

    public ihj1(int i, o571 o571Var, q6q0 q6q0Var, p371 p371Var) {
        this.a = i;
        this.b = o571Var;
        this.c = q6q0Var;
        this.d = p371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihj1)) {
            return false;
        }
        ihj1 ihj1Var = (ihj1) obj;
        return this.a == ihj1Var.a && u890.j(this.b, ihj1Var.b) && u890.j(this.c, ihj1Var.c) && u890.j(this.d, ihj1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        q6q0 q6q0Var = this.c;
        return this.d.hashCode() + ((iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode())) * 31);
    }
}
