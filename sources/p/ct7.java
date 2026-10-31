package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ct7 extends eso1 {
    public final o571 b;
    public final q6q0 c;

    static {
        idd1 idd1Var = o571.c;
    }

    public ct7(o571 o571Var, q6q0 q6q0Var) {
        this.b = o571Var;
        this.c = q6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct7)) {
            return false;
        }
        ct7 ct7Var = (ct7) obj;
        return u890.j(this.b, ct7Var.b) && u890.j(this.c, ct7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        q6q0 q6q0Var = this.c;
        return iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode());
    }
}
