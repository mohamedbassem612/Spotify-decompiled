package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iy20 implements ga80 {
    public final iu30 a;
    public final hw61 b;
    public final p3v c;

    public iy20(iu30 iu30Var, hw61 hw61Var, p3v p3vVar) {
        this.a = iu30Var;
        this.b = hw61Var;
        this.c = p3vVar;
    }

    @Override // p.ga80
    public final x4t a(idn0 idn0Var) {
        return new my20(idn0Var, this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy20)) {
            return false;
        }
        iy20 iy20Var = (iy20) obj;
        return u890.j(this.a, iy20Var.a) && u890.j(this.b, iy20Var.b) && p3v.c(2.0f, 2.0f) && u890.j(this.c, iy20Var.c);
    }

    @Override // p.ga80
    public final int hashCode() {
        int iF = x0d.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, 2.0f);
        p3v p3vVar = this.c;
        return iF + (p3vVar == null ? 0 : Float.hashCode(p3vVar.a));
    }
}
