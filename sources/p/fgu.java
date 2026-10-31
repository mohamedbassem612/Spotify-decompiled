package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fgu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fgu(Runnable runnable, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = runnable;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                return new fgu(runnable, lnmVar, (byte) 0);
            default:
                return new fgu(runnable, lnmVar, (byte) 1);
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
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                runnable.run();
                break;
            default:
                hm5.M(obj);
                runnable.run();
                break;
        }
        return rih1Var;
    }
}
