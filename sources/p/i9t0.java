package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i9t0 {
    public final String a;
    public final z721 b;
    public final nn1 c;

    public i9t0(String str, z721 z721Var, nn1 nn1Var) {
        this.a = str;
        this.b = z721Var;
        this.c = nn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9t0)) {
            return false;
        }
        i9t0 i9t0Var = (i9t0) obj;
        return this.a.equals(i9t0Var.a) && u890.j(this.b, i9t0Var.b) && u890.j(this.c, i9t0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        z721 z721Var = this.b;
        int iHashCode2 = (iHashCode + (z721Var == null ? 0 : z721Var.hashCode())) * 31;
        nn1 nn1Var = this.c;
        return iHashCode2 + (nn1Var != null ? l1d.C(nn1Var.a) : 0);
    }
}
