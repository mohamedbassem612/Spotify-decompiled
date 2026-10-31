package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class waj1 {
    public final vaj1 a;
    public final iac0 b;
    public final uoa c;
    public final fv0 d;

    public waj1(vaj1 vaj1Var, iac0 iac0Var, uoa uoaVar, fv0 fv0Var) {
        this.a = vaj1Var;
        this.b = iac0Var;
        this.c = uoaVar;
        this.d = fv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waj1)) {
            return false;
        }
        waj1 waj1Var = (waj1) obj;
        return this.a.equals(waj1Var.a) && this.b.equals(waj1Var.b) && u890.j(this.c, waj1Var.c) && u890.j(this.d, waj1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + ((paj1.a.hashCode() + xcg1.g(325012899, 31, true)) * 31)) * 31)) * 31;
        uoa uoaVar = this.c;
        int iHashCode2 = (iHashCode + (uoaVar == null ? 0 : uoaVar.hashCode())) * 31;
        fv0 fv0Var = this.d;
        return iHashCode2 + (fv0Var != null ? fv0Var.hashCode() : 0);
    }
}
