package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class evu {
    public final kby a;
    public final g3d0 b;
    public final fbp1 c;

    public evu(kby kbyVar, g3d0 g3d0Var, fbp1 fbp1Var) {
        this.a = kbyVar;
        this.b = g3d0Var;
        this.c = fbp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evu)) {
            return false;
        }
        evu evuVar = (evu) obj;
        return u890.j(this.a, evuVar.a) && u890.j(this.b, evuVar.b) && u890.j(this.c, evuVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31);
    }
}
