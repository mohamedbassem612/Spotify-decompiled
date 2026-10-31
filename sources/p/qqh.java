package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qqh implements lov {
    public final af5 a;
    public final int b;

    public qqh(String str, int i) {
        this(new af5(str), i);
    }

    @Override // p.lov
    public final void a(k4w k4wVar) {
        boolean zN = k4wVar.n();
        af5 af5Var = this.a;
        if (zN) {
            k4wVar.s(k4wVar.i(), k4wVar.h(), af5Var.b);
        } else {
            k4wVar.s(k4wVar.m(), k4wVar.l(), af5Var.b);
        }
        int iJ = k4wVar.j();
        int i = this.b;
        k4wVar.u(yoi1.p(i > 0 ? (iJ + i) - 1 : (iJ + i) - af5Var.b.length(), 0, k4wVar.k()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqh)) {
            return false;
        }
        qqh qqhVar = (qqh) obj;
        return u890.j(this.a.b, qqhVar.a.b) && this.b == qqhVar.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.b + "', newCursorPosition=" + this.b + ")";
    }

    public qqh(af5 af5Var, int i) {
        this.a = af5Var;
        this.b = i;
    }
}
