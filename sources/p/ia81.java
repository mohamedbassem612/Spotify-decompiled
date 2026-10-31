package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ia81 {
    public final jo70 a;
    public final hll b;
    public final wkk1 c;

    public ia81(jo70 jo70Var, hll hllVar, wkk1 wkk1Var) {
        this.a = jo70Var;
        this.b = hllVar;
        this.c = wkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia81)) {
            return false;
        }
        ia81 ia81Var = (ia81) obj;
        return u890.j(this.a, ia81Var.a) && u890.j(this.b, ia81Var.b) && u890.j(this.c, ia81Var.c);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        hll hllVar = this.b;
        int iHashCode2 = (iHashCode + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        wkk1 wkk1Var = this.c;
        return iHashCode2 + (wkk1Var != null ? wkk1Var.hashCode() : 0);
    }
}
