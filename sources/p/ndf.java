package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ndf implements bef {
    public final ou80 a;
    public final int b;

    public ndf(ou80 ou80Var, int i) {
        this.a = ou80Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndf)) {
            return false;
        }
        ndf ndfVar = (ndf) obj;
        return u890.j(this.a, ndfVar.a) && this.b == ndfVar.b;
    }

    public final int hashCode() {
        ou80 ou80Var = this.a;
        int iHashCode = (ou80Var == null ? 0 : ou80Var.a.hashCode()) * 31;
        int i = this.b;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
