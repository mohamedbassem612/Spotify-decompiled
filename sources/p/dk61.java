package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dk61 implements lov {
    public final af5 a;
    public final int b;

    public dk61(String str, int i) {
        this.a = new af5(str);
        this.b = i;
    }

    @Override // p.lov
    public final void a(k4w k4wVar) {
        boolean zN = k4wVar.n();
        String str = this.a.b;
        if (zN) {
            int i = k4wVar.i();
            k4wVar.s(k4wVar.i(), k4wVar.h(), str);
            if (str.length() > 0) {
                k4wVar.t(i, str.length() + i);
            }
        } else {
            int iM = k4wVar.m();
            k4wVar.s(k4wVar.m(), k4wVar.l(), str);
            if (str.length() > 0) {
                k4wVar.t(iM, str.length() + iM);
            }
        }
        int iJ = k4wVar.j();
        int i2 = this.b;
        k4wVar.u(yoi1.p(i2 > 0 ? (iJ + i2) - 1 : (iJ + i2) - str.length(), 0, k4wVar.k()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk61)) {
            return false;
        }
        dk61 dk61Var = (dk61) obj;
        return u890.j(this.a.b, dk61Var.a.b) && this.b == dk61Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.b + "', newCursorPosition=" + this.b + ")";
    }
}
