package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ukj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vkj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ukj1(vkj1 vkj1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = vkj1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vkj1 vkj1Var = this.b;
        switch (b) {
            case 0:
                return new ukj1(vkj1Var, lnmVar, (byte) 0);
            default:
                return new ukj1(vkj1Var, lnmVar, (byte) 1);
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
        vkj1 vkj1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                vkj1Var.h.c();
                break;
            default:
                hm5.M(obj);
                vkj1Var.h.e();
                break;
        }
        return rih1Var;
    }
}
