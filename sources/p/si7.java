package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class si7 {
    public final Object a;
    public final gi7 b;
    public final rf01 c;

    public si7(Object obj, gi7 gi7Var, rf01 rf01Var) {
        this.a = obj;
        this.b = gi7Var;
        this.c = rf01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si7)) {
            return false;
        }
        si7 si7Var = (si7) obj;
        gi7 gi7Var = si7Var.b;
        gi7 gi7Var2 = this.b;
        return u890.j(gi7Var2, gi7Var) && gi7Var2.a(this.a, si7Var.a) && u890.j(this.c, si7Var.c);
    }

    public final int hashCode() {
        gi7 gi7Var = this.b;
        return this.c.hashCode() + ((gi7Var.b(this.a) + (gi7Var.hashCode() * 31)) * 31);
    }
}
