package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qaj1 {
    public final String a;
    public final boolean b;
    public final paj1 c;
    public final oaj1 d;
    public final iac0 e;
    public final uoa f;
    public final fv0 g;

    public qaj1(String str, boolean z, paj1 paj1Var, oaj1 oaj1Var, iac0 iac0Var, uoa uoaVar, fv0 fv0Var) {
        this.a = str;
        this.b = z;
        this.c = paj1Var;
        this.d = oaj1Var;
        this.e = iac0Var;
        this.f = uoaVar;
        this.g = fv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaj1)) {
            return false;
        }
        qaj1 qaj1Var = (qaj1) obj;
        return u890.j(this.a, qaj1Var.a) && this.b == qaj1Var.b && this.c == qaj1Var.c && u890.j(this.d, qaj1Var.d) && u890.j(this.e, qaj1Var.e) && u890.j(this.f, qaj1Var.f) && u890.j(this.g, qaj1Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
        uoa uoaVar = this.f;
        int iHashCode2 = (iHashCode + (uoaVar == null ? 0 : uoaVar.hashCode())) * 31;
        fv0 fv0Var = this.g;
        return iHashCode2 + (fv0Var != null ? fv0Var.hashCode() : 0);
    }

    public /* synthetic */ qaj1(String str, oaj1 oaj1Var, iac0 iac0Var) {
        this(str, true, paj1.b, oaj1Var, iac0Var, null, null);
    }
}
