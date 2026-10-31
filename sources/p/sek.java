package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sek {
    public final j6k a;
    public final lhe0 b;
    public final jo70 c;
    public final xkk1 d;
    public final boolean e;

    public sek(j6k j6kVar, jo70 jo70Var, lhe0 lhe0Var, xkk1 xkk1Var, boolean z) {
        this.a = j6kVar;
        this.b = lhe0Var;
        this.c = jo70Var;
        this.d = xkk1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sek)) {
            return false;
        }
        sek sekVar = (sek) obj;
        return this.a.equals(sekVar.a) && this.b.equals(sekVar.b) && this.c.equals(sekVar.c) && u890.j(this.d, sekVar.d) && this.e == sekVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        xkk1 xkk1Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31);
    }
}
