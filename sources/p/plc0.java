package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class plc0 extends hm5 {
    public final tka0 n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hm5 f64p;

    public plc0(tka0 tka0Var, Object obj, hm5 hm5Var) {
        this.n = tka0Var;
        this.o = obj;
        this.f64p = hm5Var;
    }

    public final hm5 G(tka0 tka0Var, Object obj) {
        tka0 tka0Var2 = this.n;
        boolean zEquals = tka0Var.equals(tka0Var2);
        hm5 hm5Var = this.f64p;
        if (!zEquals) {
            hm5 hm5VarG = hm5Var.G(tka0Var, (Object) null);
            if (hm5VarG != hm5Var) {
                this = new plc0(tka0Var2, this.o, hm5VarG);
            }
            hm5Var = this;
        }
        return obj != null ? new plc0(tka0Var, obj, hm5Var) : hm5Var;
    }

    public final String toString() {
        return o7h.y0(o7h.T0(z561.k0(z561.c0(new pv40((byte) 26), this))), null, "{", "}", new pv40((byte) 27), 25);
    }

    public final Object v(tka0 tka0Var) {
        return tka0Var.equals(this.n) ? ((wdg) tka0Var).n().cast(this.o) : this.f64p.v(tka0Var);
    }
}
