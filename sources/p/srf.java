package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class srf implements wrf {
    public final w4i1 a;
    public final uu2 b;

    public srf(w4i1 w4i1Var, uu2 uu2Var) {
        this.a = w4i1Var;
        this.b = uu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srf)) {
            return false;
        }
        srf srfVar = (srf) obj;
        return u890.j(this.a, srfVar.a) && u890.j(this.b, srfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
