package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nem0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uem0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nem0(uem0 uem0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = uem0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        uem0 uem0Var = this.b;
        switch (b) {
            case 0:
                return new nem0(uem0Var, lnmVar, (byte) 0);
            default:
                return new nem0(uem0Var, lnmVar, (byte) 1);
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
        uem0 uem0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                uem0Var.o.m((Object) null, Boolean.TRUE);
                break;
            default:
                hm5.M(obj);
                uem0Var.n.m((Object) null, Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
