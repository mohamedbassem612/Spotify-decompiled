package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xhn0 {
    public final c380 a;
    public final shn0 b;

    public xhn0(c380 c380Var, shn0 shn0Var) {
        this.a = c380Var;
        this.b = shn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhn0)) {
            return false;
        }
        xhn0 xhn0Var = (xhn0) obj;
        return this.a.equals(xhn0Var.a) && this.b == xhn0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        shn0 shn0Var = this.b;
        return iHashCode + (shn0Var == null ? 0 : shn0Var.hashCode());
    }
}
