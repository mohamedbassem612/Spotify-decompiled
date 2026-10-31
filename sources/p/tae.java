package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tae implements slq0 {
    public final /* synthetic */ byte a = 0;
    public final xe01 b;
    public final Object c;

    public tae(o241 o241Var, ymd0 ymd0Var, u9c0 u9c0Var, drp0 drp0Var) {
        this.c = drp0Var;
        this.b = d5p1.t(new x010(t5p1.i(ymd0Var), yoi1.g(((p241) o241Var).a), new mnl(3, (lnm) null, (byte) 1), (byte) 1), u9c0Var, ey71.a, new rlq0(b7x.a));
    }

    @Override // p.slq0
    public final Object a(String str, mlq0 mlq0Var, r6h1 r6h1Var, lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                int iOrdinal = mlq0Var.ordinal();
                if (iOrdinal == 0) {
                    return ((cab) obj).x(str, r6h1Var, (a8d1) lnmVar);
                }
                if (iOrdinal == 1) {
                    return Boolean.TRUE;
                }
                eg.o();
                return null;
            default:
                if (mlq0Var != mlq0.a) {
                    return Boolean.TRUE;
                }
                ((drp0) obj).g(5, str);
                return Boolean.FALSE;
        }
    }

    @Override // p.slq0
    public final zob1 getStatus() {
        byte b = this.a;
        return this.b;
    }

    public tae(cab cabVar, c9n c9nVar, zob1 zob1Var) {
        this.c = cabVar;
        this.b = d5p1.t(new p90(zob1Var, (byte) 3), c9nVar, ey71.a, new rlq0(((qae) zob1Var.getValue()).b));
    }
}
