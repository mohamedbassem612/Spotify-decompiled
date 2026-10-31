package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ym91 implements fv50 {
    public final String a;
    public final tm91 b;
    public final tu41 d;
    public final yd91 c = new yd91(3, new fe81(this, (byte) 19));
    public final o3r e = w3p1.o(new l4r(pwc0.b, 1, fe91.Y, new j4r(new d781(this, (byte) 26)), fe91.Z), fe91.t);
    public final wm91 f = new wm91(this);
    public final int g = 3;

    public ym91(String str, cn91 cn91Var, tm91 tm91Var) {
        this.a = str;
        this.b = tm91Var;
        this.d = new tu41(cn91Var.c, (byte) 29);
    }

    @Override // p.xe91
    public final l381 c() {
        return this.f;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.d;
    }

    @Override // p.fv50
    public final int w() {
        return this.g;
    }
}
