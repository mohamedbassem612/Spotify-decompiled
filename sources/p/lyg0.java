package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lyg0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyg0(int i, int i2, hdn0 hdn0Var, hdn0 hdn0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = i;
        this.c = i2;
        this.d = hdn0Var;
        this.e = hdn0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hdn0 hdn0Var = this.e;
        hdn0 hdn0Var2 = this.d;
        switch (b) {
            case 0:
                lyg0 lyg0Var = new lyg0(this.c, hdn0Var2, hdn0Var, lnmVar);
                lyg0Var.b = ((Number) obj).intValue();
                return lyg0Var;
            default:
                return new lyg0(this.b, this.c, hdn0Var2, hdn0Var, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.e;
        int i = this.c;
        err0 err0Var2 = this.d;
        switch (b) {
            case 0:
                int i2 = this.b;
                hm5.M(obj);
                if (((Boolean) err0Var2.getValue()).booleanValue() && !((Boolean) err0Var.getValue()).booleanValue() && i2 != i) {
                    err0Var2.setValue(Boolean.FALSE);
                }
                break;
            default:
                hm5.M(obj);
                int i3 = this.b;
                if (i3 > 0) {
                    ((hdn0) err0Var2).t(i3);
                }
                if (i > 0) {
                    ((hdn0) err0Var).t(i);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyg0(int i, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = i;
        this.d = ven0Var;
        this.e = ven0Var2;
    }
}
