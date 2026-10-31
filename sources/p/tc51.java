package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tc51 extends hd51 {
    public final String b;
    public final tv80 c;
    public final gto1 d;
    public final boolean e;

    public tc51(String str, tv80 tv80Var, gto1 gto1Var, boolean z) {
        this.b = str;
        this.c = tv80Var;
        this.d = gto1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc51)) {
            return false;
        }
        tc51 tc51Var = (tc51) obj;
        return u890.j(this.b, tc51Var.b) && u890.j(this.c, tc51Var.c) && u890.j(this.d, tc51Var.d) && this.e == tc51Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        int iHashCode2 = (iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
        gto1 gto1Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (gto1Var != null ? gto1Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ tc51(String str, tv80 tv80Var, gto1 gto1Var, int i) {
        this(str, tv80Var, (i & 4) != 0 ? null : gto1Var, false);
    }
}
