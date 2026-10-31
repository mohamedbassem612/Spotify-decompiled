package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eob1 {
    public final hwq a;
    public final h7e0 b;
    public final Boolean c;
    public final boolean d;
    public final boolean e;
    public final uw9 f;
    public final wj90 g;

    public eob1(hwq hwqVar, h7e0 h7e0Var, Boolean bool, boolean z, boolean z2, uw9 uw9Var, wj90 wj90Var) {
        this.a = hwqVar;
        this.b = h7e0Var;
        this.c = bool;
        this.d = z;
        this.e = z2;
        this.f = uw9Var;
        this.g = wj90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eob1)) {
            return false;
        }
        eob1 eob1Var = (eob1) obj;
        return this.a.equals(eob1Var.a) && this.b.equals(eob1Var.b) && u890.j(this.c, eob1Var.c) && this.d == eob1Var.d && this.e == eob1Var.e && u890.j(this.f, eob1Var.f) && this.g.equals(eob1Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Boolean bool = this.c;
        int iG = xcg1.g(xcg1.g((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e);
        uw9 uw9Var = this.f;
        return this.g.hashCode() + ((iG + (uw9Var != null ? uw9Var.hashCode() : 0)) * 31);
    }
}
