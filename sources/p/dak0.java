package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dak0 {
    public final cak0 a;
    public final int b;
    public final zge1 c;
    public final uia d;

    public dak0(cak0 cak0Var, int i, zge1 zge1Var, uia uiaVar) {
        this.a = cak0Var;
        this.b = i;
        this.c = zge1Var;
        this.d = uiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dak0)) {
            return false;
        }
        dak0 dak0Var = (dak0) obj;
        return this.a.equals(dak0Var.a) && this.b == dak0Var.b && u890.j(this.c, dak0Var.c) && u890.j(this.d, dak0Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        zge1 zge1Var = this.c;
        int iHashCode = (iF + (zge1Var == null ? 0 : zge1Var.hashCode())) * 31;
        uia uiaVar = this.d;
        return iHashCode + (uiaVar != null ? uiaVar.hashCode() : 0);
    }
}
