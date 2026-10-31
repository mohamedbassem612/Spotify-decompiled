package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jw90 extends lw90 {
    public final ow90 a;
    public final gw90 b;
    public final cw90 c;
    public final pp90 d;

    public jw90(ow90 ow90Var, gw90 gw90Var, cw90 cw90Var, pp90 pp90Var) {
        this.a = ow90Var;
        this.b = gw90Var;
        this.c = cw90Var;
        this.d = pp90Var;
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
    public final boolean d() {
        return false;
    }

    @Override // p.lw90
    public final qw90 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw90)) {
            return false;
        }
        jw90 jw90Var = (jw90) obj;
        return this.a.equals(jw90Var.a) && this.b.equals(jw90Var.b) && u890.j(this.c, jw90Var.c) && u890.j(this.d, jw90Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        cw90 cw90Var = this.c;
        return this.d.hashCode() + xcg1.g((iHashCode + (cw90Var == null ? 0 : cw90Var.hashCode())) * 31, 31, false);
    }
}
