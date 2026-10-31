package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class frf0 {
    public final yqf0 a;
    public final erf0 b;
    public final iu30 c;
    public final iu30 d;

    public frf0(yqf0 yqf0Var, erf0 erf0Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = yqf0Var;
        this.b = erf0Var;
        this.c = iu30Var;
        this.d = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frf0)) {
            return false;
        }
        frf0 frf0Var = (frf0) obj;
        return this.a.equals(frf0Var.a) && this.b.equals(frf0Var.b) && u890.j(this.c, frf0Var.c) && u890.j(this.d, frf0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ktd.g(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
