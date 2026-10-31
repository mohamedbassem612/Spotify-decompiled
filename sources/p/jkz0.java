package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jkz0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rk41 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jkz0(rk41 rk41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = rk41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                return new jkz0(rk41Var, lnmVar, (byte) 0);
            case 1:
                return new jkz0(rk41Var, lnmVar, (byte) 1);
            default:
                return new jkz0(rk41Var, lnmVar, (byte) 2);
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
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((xgm1) rk41Var.c).a(new ogm1(new y0c1("quiz-answer-state-key")));
                break;
            case 1:
                hm5.M(obj);
                ((xgm1) rk41Var.c).a(fgm1.a);
                break;
            default:
                hm5.M(obj);
                if (!rk41Var.a) {
                    ((xgm1) rk41Var.c).a(rgm1.a);
                }
                break;
        }
        return rih1Var;
    }
}
