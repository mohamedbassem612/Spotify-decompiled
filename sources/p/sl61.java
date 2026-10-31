package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sl61 implements lov {
    public final int a;
    public final int b;

    public sl61(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // p.lov
    public final void a(k4w k4wVar) {
        int iP = yoi1.p(this.a, 0, k4wVar.k());
        int iP2 = yoi1.p(this.b, 0, k4wVar.k());
        if (iP < iP2) {
            k4wVar.v(iP, iP2);
        } else {
            k4wVar.v(iP2, iP);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl61)) {
            return false;
        }
        sl61 sl61Var = (sl61) obj;
        return this.a == sl61Var.a && this.b == sl61Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return l1d.j(this.a, this.b, "SetSelectionCommand(start=", ", end=", ")");
    }
}
