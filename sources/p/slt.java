package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class slt {
    public final gw81 a;
    public final jo70 b;

    public slt(gw81 gw81Var, jo70 jo70Var) {
        this.a = gw81Var;
        this.b = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slt)) {
            return false;
        }
        slt sltVar = (slt) obj;
        return this.a.equals(sltVar.a) && u890.j(this.b, sltVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        return iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode());
    }
}
