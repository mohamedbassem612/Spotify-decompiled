package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iw90 extends lw90 {
    public final pw90 a;
    public final gw90 b;
    public final cw90 c;
    public final pp90 d;
    public final yv90 e;

    public iw90(pw90 pw90Var, gw90 gw90Var, cw90 cw90Var, pp90 pp90Var, yv90 yv90Var) {
        this.a = pw90Var;
        this.b = gw90Var;
        this.c = cw90Var;
        this.d = pp90Var;
        this.e = yv90Var;
    }

    @Override // p.lw90
    public final pp90 a() {
        return this.d;
    }

    @Override // p.lw90
    public final cw90 b() {
        return this.c;
    }

    @Override // p.lw90
    public final gw90 c() {
        return this.b;
    }

    @Override // p.lw90
    public final qw90 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw90)) {
            return false;
        }
        iw90 iw90Var = (iw90) obj;
        return this.a.equals(iw90Var.a) && this.b.equals(iw90Var.b) && u890.j(this.c, iw90Var.c) && u890.j(this.d, iw90Var.d) && u890.j(this.e, iw90Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(2131956929) * 31)) * 31;
        cw90 cw90Var = this.c;
        int iHashCode2 = (this.d.hashCode() + xcg1.g((iHashCode + (cw90Var == null ? 0 : cw90Var.hashCode())) * 31, 31, true)) * 31;
        yv90 yv90Var = this.e;
        return iHashCode2 + (yv90Var != null ? yv90Var.hashCode() : 0);
    }
}
