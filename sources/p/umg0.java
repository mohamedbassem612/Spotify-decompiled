package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class umg0 {
    public static final tmg0 Companion = new tmg0();
    public static final znb0[] h = {null, null, null, null, dm5.S(2, lxf0.P0), null, dm5.S(2, lxf0.Q0)};
    public final bpa1 a;
    public final soa1 b;
    public final kb10 c;
    public final eb10 d;
    public final ovt e;
    public final String f;
    public final lz3 g;

    public /* synthetic */ umg0(int i, bpa1 bpa1Var, soa1 soa1Var, kb10 kb10Var, eb10 eb10Var, ovt ovtVar, String str, lz3 lz3Var) {
        if (30 != (i & 30)) {
            o6p1.t(i, 30, smg0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bpa1Var;
        }
        this.b = soa1Var;
        this.c = kb10Var;
        this.d = eb10Var;
        this.e = ovtVar;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = lz3Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umg0)) {
            return false;
        }
        umg0 umg0Var = (umg0) obj;
        return u890.j(this.a, umg0Var.a) && u890.j(this.b, umg0Var.b) && u890.j(this.c, umg0Var.c) && u890.j(this.d, umg0Var.d) && this.e == umg0Var.e && u890.j(this.f, umg0Var.f) && this.g == umg0Var.g;
    }

    public final int hashCode() {
        bpa1 bpa1Var = this.a;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((bpa1Var == null ? 0 : bpa1Var.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        lz3 lz3Var = this.g;
        return iHashCode2 + (lz3Var != null ? lz3Var.hashCode() : 0);
    }
}
