package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hdh implements vzq0 {
    public final vzq0 b;
    public final vzq0 c;
    public final vu30 d;

    public hdh(vzq0 vzq0Var, vzq0 vzq0Var2, vu30 vu30Var) {
        this.b = vzq0Var;
        this.c = vzq0Var2;
        this.d = vu30Var;
    }

    @Override // p.vzq0
    public final float a() {
        return e(m4h.Z0);
    }

    @Override // p.vzq0
    public final float b(flb0 flb0Var) {
        return e(new s20(flb0Var, (byte) 4));
    }

    @Override // p.vzq0
    public final float c(flb0 flb0Var) {
        return e(new gdh(flb0Var, (byte) 0));
    }

    @Override // p.vzq0
    public final float d() {
        return e(xj.U0);
    }

    public final float e(iu30 iu30Var) {
        return ((p3v) yoi1.l((Comparable) this.d.invoke(iu30Var.invoke(this.b), iu30Var.invoke(this.c)), new p3v(0.0f))).a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hdh)) {
            return false;
        }
        hdh hdhVar = (hdh) obj;
        return u890.j(this.b, hdhVar.b) && u890.j(this.c, hdhVar.c) && this.d.equals(hdhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode() + this.b.hashCode();
    }
}
