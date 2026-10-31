package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wdp0 {
    public final dt71 a;
    public final lvz0 b;
    public final cnr c;
    public boolean d = false;

    public wdp0(dt71 dt71Var, lvz0 lvz0Var, cnr cnrVar) {
        this.a = dt71Var;
        this.b = lvz0Var;
        this.c = cnrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wdp0) {
            wdp0 wdp0Var = (wdp0) obj;
            if (this.a == wdp0Var.a && this.b.equals(wdp0Var.b) && u890.j(this.c, wdp0Var.c) && this.d == wdp0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 832727566) * 31)) * 31;
        cnr cnrVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (cnrVar == null ? 0 : cnrVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Emitter(name=fingerprint emitter, actionEmitter=" + this.a + ", action=" + this.b + ", configParameters=" + this.c + ", blocked=" + this.d + ")";
    }
}
