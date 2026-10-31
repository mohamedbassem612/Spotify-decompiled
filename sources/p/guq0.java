package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class guq0 {
    public final String a;
    public final int b;
    public final zax c;
    public final z5k1 d;
    public final tlg e;

    public guq0(String str, int i, zax zaxVar, z5k1 z5k1Var, tlg tlgVar, int i2) {
        i = (i2 & 2) != 0 ? 1 : i;
        z5k1Var = (i2 & 8) != 0 ? null : z5k1Var;
        tlgVar = (i2 & 16) != 0 ? null : tlgVar;
        this.a = str;
        this.b = i;
        this.c = zaxVar;
        this.d = z5k1Var;
        this.e = tlgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guq0)) {
            return false;
        }
        guq0 guq0Var = (guq0) obj;
        return this.a.equals(guq0Var.a) && this.b == guq0Var.b && this.c.equals(guq0Var.c) && u890.j(this.d, guq0Var.d) && u890.j(this.e, guq0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31;
        z5k1 z5k1Var = this.d;
        int iHashCode2 = (iHashCode + (z5k1Var == null ? 0 : z5k1Var.hashCode())) * 31;
        tlg tlgVar = this.e;
        return iHashCode2 + (tlgVar != null ? tlgVar.hashCode() : 0);
    }
}
