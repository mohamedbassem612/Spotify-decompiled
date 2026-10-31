package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zbz {
    public final jo70 a;
    public final hll b;
    public final d7u0 c;
    public final wkk1 d;

    public zbz(jo70 jo70Var, hll hllVar, d7u0 d7u0Var, wkk1 wkk1Var) {
        this.a = jo70Var;
        this.b = hllVar;
        this.c = d7u0Var;
        this.d = wkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbz)) {
            return false;
        }
        zbz zbzVar = (zbz) obj;
        return this.a.equals(zbzVar.a) && this.b.equals(zbzVar.b) && u890.j(this.c, zbzVar.c) && u890.j(this.d, zbzVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        d7u0 d7u0Var = this.c;
        return this.d.hashCode() + ((iHashCode + (d7u0Var == null ? 0 : d7u0Var.hashCode())) * 31);
    }
}
