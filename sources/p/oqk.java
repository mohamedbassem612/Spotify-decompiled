package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oqk {
    public final j6k a;
    public final lhe0 b;
    public final boolean c;
    public final jo70 d;
    public final xkk1 e;

    public oqk(j6k j6kVar, jo70 jo70Var, lhe0 lhe0Var, xkk1 xkk1Var, boolean z) {
        this.a = j6kVar;
        this.b = lhe0Var;
        this.c = z;
        this.d = jo70Var;
        this.e = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqk)) {
            return false;
        }
        oqk oqkVar = (oqk) obj;
        return this.a.equals(oqkVar.a) && this.b.equals(oqkVar.b) && this.c == oqkVar.c && this.d.equals(oqkVar.d) && u890.j(this.e, oqkVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        xkk1 xkk1Var = this.e;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
