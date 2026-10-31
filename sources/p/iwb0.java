package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iwb0 implements phi1 {
    public final /* synthetic */ byte a = 1;
    public final fg60 b;
    public final l6m0 c;
    public final Object d;
    public final Object e;

    public iwb0(gw70 gw70Var, lzn0 lzn0Var, fg60 fg60Var, l6m0 l6m0Var) {
        this.d = gw70Var;
        this.e = lzn0Var;
        this.b = fg60Var;
        this.c = l6m0Var;
    }

    public final qhi1 a(dtb1 dtb1Var, i2g1 i2g1Var) {
        byte b = this.a;
        Object obj = this.e;
        l6m0 l6m0Var = this.c;
        Object obj2 = this.d;
        fg60 fg60Var = this.b;
        switch (b) {
            case 0:
                ewb0 ewb0Var = dtb1Var instanceof ewb0 ? (ewb0) dtb1Var : null;
                if (ewb0Var == null) {
                    return null;
                }
                return lro1.l(new yxb0((gw70) obj2, (lzn0) obj, fg60Var, l6m0Var), ewb0Var);
            default:
                fls0 fls0Var = dtb1Var instanceof fls0 ? (fls0) dtb1Var : null;
                if (fls0Var == null) {
                    return null;
                }
                return lro1.l(new kls0(fg60Var, (sgd0) obj2, l6m0Var, (q8n) obj), fls0Var);
        }
    }

    public iwb0(fg60 fg60Var, sgd0 sgd0Var, l6m0 l6m0Var, q8n q8nVar) {
        this.b = fg60Var;
        this.d = sgd0Var;
        this.c = l6m0Var;
        this.e = q8nVar;
    }
}
