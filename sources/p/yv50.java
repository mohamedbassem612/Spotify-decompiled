package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yv50 {
    public final a7q0 a;
    public final uxn b;
    public final pn30 c;
    public final boolean d;

    public yv50(a7q0 a7q0Var, uxn uxnVar, pn30 pn30Var, boolean z) {
        this.a = a7q0Var;
        this.b = uxnVar;
        this.c = pn30Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv50)) {
            return false;
        }
        yv50 yv50Var = (yv50) obj;
        return u890.j(this.a, yv50Var.a) && u890.j(this.b, yv50Var.b) && u890.j(this.c, yv50Var.c) && this.d == yv50Var.d;
    }

    public final int hashCode() {
        a7q0 a7q0Var = this.a;
        int iHashCode = (a7q0Var == null ? 0 : a7q0Var.hashCode()) * 31;
        uxn uxnVar = this.b;
        int iHashCode2 = (iHashCode + (uxnVar == null ? 0 : uxnVar.a.hashCode())) * 31;
        pn30 pn30Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (pn30Var != null ? pn30Var.hashCode() : 0)) * 31);
    }
}
