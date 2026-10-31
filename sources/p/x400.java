package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x400 extends v600 {
    public final String a;
    public final o571 b;
    public final q6q0 c;

    static {
        idd1 idd1Var = o571.c;
    }

    public x400(String str, o571 o571Var, q6q0 q6q0Var) {
        this.a = str;
        this.b = o571Var;
        this.c = q6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x400)) {
            return false;
        }
        x400 x400Var = (x400) obj;
        return u890.j(this.a, x400Var.a) && u890.j(this.b, x400Var.b) && u890.j(this.c, x400Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        q6q0 q6q0Var = this.c;
        return iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode());
    }
}
