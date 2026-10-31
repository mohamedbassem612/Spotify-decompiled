package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j5k1 extends m5k1 {
    public final int a;
    public final o571 b;
    public final q6q0 c;
    public final p371 d;

    static {
        idd1 idd1Var = o571.c;
    }

    public j5k1(int i, o571 o571Var, q6q0 q6q0Var, p371 p371Var) {
        this.a = i;
        this.b = o571Var;
        this.c = q6q0Var;
        this.d = p371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5k1)) {
            return false;
        }
        j5k1 j5k1Var = (j5k1) obj;
        return this.a == j5k1Var.a && u890.j(this.b, j5k1Var.b) && u890.j(this.c, j5k1Var.c) && u890.j(this.d, j5k1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        q6q0 q6q0Var = this.c;
        return this.d.hashCode() + ((iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode())) * 31);
    }
}
