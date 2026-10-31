package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nek {
    public final j6k a;
    public final lhe0 b;
    public final jo70 c;
    public final xkk1 d;

    public nek(j6k j6kVar, lhe0 lhe0Var, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = j6kVar;
        this.b = lhe0Var;
        this.c = jo70Var;
        this.d = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nek)) {
            return false;
        }
        nek nekVar = (nek) obj;
        return this.a.equals(nekVar.a) && this.b.equals(nekVar.b) && this.c.equals(nekVar.c) && u890.j(this.d, nekVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        xkk1 xkk1Var = this.d;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
