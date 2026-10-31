package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hbf1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rk41 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbf1(rk41 rk41Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = rk41Var;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                return new hbf1(rk41Var, ven0Var, lnmVar, (byte) 0);
            case 1:
                return new hbf1(rk41Var, ven0Var, lnmVar, (byte) 1);
            default:
                return new hbf1(rk41Var, ven0Var, lnmVar, (byte) 2);
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
            case 1:
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
        ven0 ven0Var = this.c;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                xgm1 xgm1Var = (xgm1) rk41Var.c;
                Integer num = (Integer) ven0Var.getValue();
                xgm1Var.a(new qgm1(new Integer(num != null ? num.intValue() : 0), false));
                break;
            case 1:
                hm5.M(obj);
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ((ycl1) rk41Var.c).b(ixj1.a);
                }
                break;
            default:
                hm5.M(obj);
                if (!rk41Var.a) {
                    bpb1 bpb1Var = cem1.i;
                    ven0Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return rih1Var;
    }
}
