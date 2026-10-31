package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pis0 implements phi1 {
    public final /* synthetic */ byte a = 1;
    public final l6m0 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public pis0(gw70 gw70Var, gff1 gff1Var, iff1 iff1Var, qn qnVar, qn qnVar2, l6m0 l6m0Var, fg60 fg60Var, pis0 pis0Var) {
        this.c = gw70Var;
        this.d = gff1Var;
        this.e = iff1Var;
        this.f = qnVar;
        this.g = qnVar2;
        this.b = l6m0Var;
        this.h = fg60Var;
        this.i = pis0Var;
    }

    public final qhi1 a(dtb1 dtb1Var, i2g1 i2g1Var) {
        switch (this.a) {
            case 0:
                lis0 lis0Var = dtb1Var instanceof lis0 ? (lis0) dtb1Var : null;
                if (lis0Var == null) {
                    return null;
                }
                return lro1.l(b(), lis0Var);
            default:
                wff1 wff1Var = dtb1Var instanceof wff1 ? (wff1) dtb1Var : null;
                if (wff1Var == null) {
                    return null;
                }
                return lro1.l(new pt((gw70) this.c, (gff1) this.d, (iff1) this.e, (qn) this.f, (fg60) this.h, this.b, ((pis0) this.i).b(), (qn) this.g), wff1Var);
        }
    }

    public pt b() {
        return new pt((lzn0) this.c, (js6) this.d, (i4q) this.e, (yhm) this.f, (em6) this.g, (ssf1) this.h, this.b, (zc80) this.i);
    }

    public pis0(lzn0 lzn0Var, js6 js6Var, i4q i4qVar, yhm yhmVar, em6 em6Var, ssf1 ssf1Var, l6m0 l6m0Var, zc80 zc80Var) {
        this.c = lzn0Var;
        this.d = js6Var;
        this.e = i4qVar;
        this.f = yhmVar;
        this.g = em6Var;
        this.h = ssf1Var;
        this.b = l6m0Var;
        this.i = zc80Var;
    }
}
