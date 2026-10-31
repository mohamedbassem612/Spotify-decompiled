package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g4k0 implements k4k0 {
    public final lhg1 a;
    public final f4k0 b;
    public final String c;
    public final String d;

    public g4k0(lhg1 lhg1Var, f4k0 f4k0Var, String str, String str2) {
        this.a = lhg1Var;
        this.b = f4k0Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4k0)) {
            return false;
        }
        g4k0 g4k0Var = (g4k0) obj;
        return u890.j(this.a, g4k0Var.a) && this.b.equals(g4k0Var.b) && u890.j(this.c, g4k0Var.c) && u890.j(this.d, g4k0Var.d);
    }

    public final int hashCode() {
        lhg1 lhg1Var = this.a;
        int iHashCode = (this.b.hashCode() + ((lhg1Var == null ? 0 : lhg1Var.hashCode()) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        lhg1 lhg1Var = this.a;
        return "OnTransitionSaved(transition=" + (lhg1Var != null ? lhg1Var.b() : null) + ", destination=" + this.b + ")";
    }
}
