package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wch implements op80 {
    public final op80 a;
    public final op80 b;

    public wch(op80 op80Var, op80 op80Var2) {
        this.a = op80Var;
        this.b = op80Var2;
    }

    @Override // p.op80
    public final mp80 a(np80 np80Var) {
        while (true) {
            mp80 mp80VarA = this.b.a(np80Var);
            if (mp80VarA != null) {
                return mp80VarA;
            }
            op80 op80Var = this.a;
            if (!(op80Var instanceof wch)) {
                return op80Var.a(np80Var);
            }
            this = (wch) op80Var;
        }
    }

    public final boolean b(op80 op80Var) {
        op80 op80Var2;
        op80 op80Var3 = this.a;
        if (op80Var3 == op80Var || (op80Var2 = this.b) == op80Var) {
            return true;
        }
        if ((op80Var3 instanceof wch) && ((wch) op80Var3).b(op80Var)) {
            return true;
        }
        return (op80Var2 instanceof wch) && ((wch) op80Var2).b(op80Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wch)) {
            return false;
        }
        wch wchVar = (wch) obj;
        return u890.j(this.a, wchVar.a) && this.b.equals(wchVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
