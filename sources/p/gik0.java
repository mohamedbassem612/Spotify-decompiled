package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gik0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gik0(t4h1 t4h1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = t4h1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new gik0(this.b, lnmVar, (byte) 0);
            default:
                return new gik0(this.b, lnmVar, (byte) 1);
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
        t4h1 t4h1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ijf1 ijf1Var = ijf1.a;
                t4h1Var.d(ijf1Var, null);
                t4h1Var.c(ijf1Var, null);
                break;
            default:
                hm5.M(obj);
                ijf1 ijf1Var2 = ijf1.b;
                t4h1Var.d(ijf1Var2, null);
                t4h1Var.c(ijf1Var2, null);
                break;
        }
        return rih1Var;
    }
}
