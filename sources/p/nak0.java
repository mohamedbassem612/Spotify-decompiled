package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nak0 {
    public final mak0 a;
    public final oak0 b;
    public final oak0 c;

    public nak0(mak0 mak0Var, oak0 oak0Var, oak0 oak0Var2) {
        this.a = mak0Var;
        this.b = oak0Var;
        this.c = oak0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nak0)) {
            return false;
        }
        nak0 nak0Var = (nak0) obj;
        return this.a.equals(nak0Var.a) && u890.j(this.b, nak0Var.b) && u890.j(this.c, nak0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        oak0 oak0Var = this.b;
        int iHashCode2 = (iHashCode + (oak0Var == null ? 0 : oak0Var.hashCode())) * 31;
        oak0 oak0Var2 = this.c;
        return iHashCode2 + (oak0Var2 != null ? oak0Var2.hashCode() : 0);
    }
}
