package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lz31 {
    public static final long c;
    public final xrc0 a;
    public final gw70 b;

    static {
        ytw0 ytw0Var = jfv.b;
        c = fdg1.k0(3, ngv.e);
    }

    public lz31(xrc0 xrc0Var, gw70 gw70Var) {
        b3s b3sVar = b3s.c;
        this.a = xrc0Var;
        this.b = gw70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        kz31 kz31Var;
        if (onmVar instanceof kz31) {
            kz31Var = (kz31) onmVar;
            int i = kz31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kz31Var.c = i - Integer.MIN_VALUE;
            } else {
                kz31Var = new kz31(this, onmVar);
            }
        } else {
            kz31Var = new kz31(this, onmVar);
        }
        Object objP = kz31Var.a;
        int i2 = kz31Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            w621 w621Var = new w621(this, str, (lnm) null, (byte) 2);
            kz31Var.c = 1;
            objP = rc2.P(c, w621Var, kz31Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        Integer num = (Integer) objP;
        return new Integer(num != null ? num.intValue() : z4p1.G(n041.d.a));
    }
}
