package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s041 {
    public static final long b;
    public final xrc0 a;

    static {
        ytw0 ytw0Var = jfv.b;
        b = fdg1.k0(500, ngv.d);
    }

    public s041(xrc0 xrc0Var) {
        this.a = xrc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        r041 r041Var;
        if (onmVar instanceof r041) {
            r041Var = (r041) onmVar;
            int i = r041Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r041Var.c = i - Integer.MIN_VALUE;
            } else {
                r041Var = new r041(this, onmVar);
            }
        } else {
            r041Var = new r041(this, onmVar);
        }
        Object objP = r041Var.a;
        int i2 = r041Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            d821 d821Var = new d821(this, str, (lnm) null, (byte) 24);
            r041Var.c = 1;
            objP = rc2.P(b, d821Var, r041Var);
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
        return new Integer(num != null ? num.intValue() : 0);
    }
}
