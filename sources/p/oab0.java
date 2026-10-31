package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oab0 {
    public final iix0 a;
    public final l631 b;
    public final k1r c;

    public oab0(iix0 iix0Var, l631 l631Var, k1r k1rVar) {
        this.a = iix0Var;
        this.b = l631Var;
        this.c = k1rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab0)) {
            return false;
        }
        oab0 oab0Var = (oab0) obj;
        return this.a.equals(oab0Var.a) && u890.j(this.b, oab0Var.b) && this.c.equals(oab0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        l631 l631Var = this.b;
        return this.c.hashCode() + ((iHashCode + (l631Var == null ? 0 : l631Var.a.hashCode())) * 31);
    }
}
