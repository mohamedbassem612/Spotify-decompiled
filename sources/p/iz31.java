package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iz31 {
    public final kly0 a;
    public final fj4 b;
    public final ced0 c;
    public final idd1 d = new idd1(new g521(this, (byte) 14));

    public iz31(kly0 kly0Var, fj4 fj4Var, ytw0 ytw0Var, ced0 ced0Var) {
        this.a = kly0Var;
        this.b = fj4Var;
        this.c = ced0Var;
    }

    public final z740 a() {
        if (this.b.a()) {
            return new z740(1, ((lm10) this.c).a, "generate");
        }
        return null;
    }

    public final boolean b() {
        if (!this.b.a()) {
            return false;
        }
        vl10 vl10Var = (vl10) ((u601) this.d.getValue()).getValue();
        tl10 tl10Var = vl10Var instanceof tl10 ? (tl10) vl10Var : null;
        return (tl10Var != null ? tl10Var.b : null) instanceof kd;
    }

    public final f5y0 c() {
        return new f5y0(((u601) this.d.getValue()).a(), this, (byte) 25);
    }
}
