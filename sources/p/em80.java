package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class em80 implements phi1 {
    public final gw70 a;
    public final ytp0 b;
    public final lzn0 c;
    public final fii1 d;
    public final l6m0 e;

    public em80(gw70 gw70Var, ytp0 ytp0Var, lzn0 lzn0Var, fii1 fii1Var, l6m0 l6m0Var) {
        this.a = gw70Var;
        this.b = ytp0Var;
        this.c = lzn0Var;
        this.d = fii1Var;
        this.e = l6m0Var;
    }

    public final qhi1 a(dtb1 dtb1Var, i2g1 i2g1Var) {
        yl80 yl80Var = dtb1Var instanceof yl80 ? (yl80) dtb1Var : null;
        if (yl80Var == null) {
            return null;
        }
        return lro1.l(new yxb0(this.a, this.b, this.c, this.d, this.e), yl80Var);
    }
}
