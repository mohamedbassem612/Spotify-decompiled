package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nd3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ od3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd3(od3 od3Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = od3Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new nd3(this.b, lnmVar, (byte) 0);
            case 1:
                return new nd3(this.b, lnmVar, (byte) 1);
            default:
                return new nd3(this.b, lnmVar, (byte) 2);
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
        od3 od3Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                od3Var.a(2131952192);
                break;
            case 1:
                hm5.M(obj);
                od3Var.a.run();
                break;
            default:
                hm5.M(obj);
                od3Var.a(2131952200);
                break;
        }
        return rih1Var;
    }
}
