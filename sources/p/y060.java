package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y060 {
    public final jo70 a;
    public final xkk1 b;
    public final dxc0 c;
    public final qxc0 d;
    public final boolean e;
    public final Boolean f;

    public y060(jo70 jo70Var, xkk1 xkk1Var, dxc0 dxc0Var, qxc0 qxc0Var, boolean z, Boolean bool) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = dxc0Var;
        this.d = qxc0Var;
        this.e = z;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y060)) {
            return false;
        }
        y060 y060Var = (y060) obj;
        return this.a.equals(y060Var.a) && u890.j(this.b, y060Var.b) && u890.j(this.c, y060Var.c) && u890.j(this.d, y060Var.d) && this.e == y060Var.e && u890.j(this.f, y060Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        dxc0 dxc0Var = this.c;
        int iHashCode3 = (iHashCode2 + (dxc0Var == null ? 0 : dxc0Var.hashCode())) * 31;
        qxc0 qxc0Var = this.d;
        int iG = xcg1.g((iHashCode3 + (qxc0Var == null ? 0 : qxc0Var.hashCode())) * 31, 31, this.e);
        Boolean bool = this.f;
        return iG + (bool != null ? bool.hashCode() : 0);
    }
}
