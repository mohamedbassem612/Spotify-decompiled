package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class it3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bt3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it3(bt3 bt3Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = bt3Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        bt3 bt3Var = this.b;
        switch (b) {
            case 0:
                return new it3(bt3Var, lnmVar, (byte) 0);
            default:
                return new it3(bt3Var, lnmVar, (byte) 1);
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
        bt3 bt3Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                bt3Var.b.invoke();
                break;
            default:
                hm5.M(obj);
                bt3Var.c.invoke();
                break;
        }
        return rih1Var;
    }
}
