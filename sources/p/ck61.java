package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ck61 implements lov {
    public final int a;
    public final int b;

    public ck61(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // p.lov
    public final void a(k4w k4wVar) {
        if (k4wVar.n()) {
            k4wVar.d();
        }
        int iP = yoi1.p(this.a, 0, k4wVar.k());
        int iP2 = yoi1.p(this.b, 0, k4wVar.k());
        if (iP != iP2) {
            if (iP < iP2) {
                k4wVar.t(iP, iP2);
            } else {
                k4wVar.t(iP2, iP);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck61)) {
            return false;
        }
        ck61 ck61Var = (ck61) obj;
        return this.a == ck61Var.a && this.b == ck61Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return l1d.j(this.a, this.b, "SetComposingRegionCommand(start=", ", end=", ")");
    }
}
