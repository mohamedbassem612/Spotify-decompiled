package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lqd1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p9w0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqd1(p9w0 p9w0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = p9w0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        p9w0 p9w0Var = this.b;
        switch (b) {
            case 0:
                return new lqd1(p9w0Var, lnmVar, (byte) 0);
            case 1:
                return new lqd1(p9w0Var, lnmVar, (byte) 1);
            case 2:
                return new lqd1(p9w0Var, lnmVar, (byte) 2);
            case 3:
                return new lqd1(p9w0Var, lnmVar, (byte) 3);
            case 4:
                return new lqd1(p9w0Var, lnmVar, (byte) 4);
            case 5:
                return new lqd1(p9w0Var, lnmVar, (byte) 5);
            case 6:
                return new lqd1(p9w0Var, lnmVar, (byte) 6);
            default:
                return new lqd1(p9w0Var, lnmVar, (byte) 7);
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
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 4:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 5:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 6:
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
        p9w0 p9w0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                p9w0Var.a();
                break;
            case 1:
                hm5.M(obj);
                p9w0Var.b();
                break;
            case 2:
                hm5.M(obj);
                p9w0Var.b();
                break;
            case 3:
                hm5.M(obj);
                p9w0Var.a();
                break;
            case 4:
                hm5.M(obj);
                p9w0Var.b();
                break;
            case 5:
                hm5.M(obj);
                p9w0Var.b();
                break;
            case 6:
                hm5.M(obj);
                p9w0Var.a();
                break;
            default:
                hm5.M(obj);
                p9w0Var.b();
                break;
        }
        return rih1Var;
    }
}
