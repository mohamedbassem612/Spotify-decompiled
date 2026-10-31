package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nf6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ egm1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xgm1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf6(egm1 egm1Var, int i, xgm1 xgm1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = egm1Var;
        this.c = i;
        this.d = xgm1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new nf6(this.b, this.c, this.d, lnmVar, (byte) 0);
            default:
                return new nf6(this.b, this.c, this.d, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xgm1 xgm1Var = this.d;
        int i = this.c;
        egm1 egm1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Integer num = egm1Var.b;
                if (num == null || num.intValue() != i || !egm1Var.c) {
                    xgm1Var.a(new qgm1(new Integer(i), true));
                }
                break;
            default:
                hm5.M(obj);
                Integer num2 = egm1Var.b;
                if (num2 == null || num2.intValue() != i) {
                    xgm1Var.a(new qgm1(new Integer(i), false));
                }
                break;
        }
        return rih1Var;
    }
}
