package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class agh {
    public final k1r a;
    public final xkk1 b;

    public agh(k1r k1rVar, xkk1 xkk1Var) {
        this.a = k1rVar;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agh)) {
            return false;
        }
        agh aghVar = (agh) obj;
        return u890.j(this.a, aghVar.a) && u890.j(this.b, aghVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
