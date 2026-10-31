package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ow2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow2(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ow2(2, lnmVar, (byte) 0);
            case 1:
                return new ow2(2, lnmVar, (byte) 1);
            default:
                return new ow2(2, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((mw2) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                break;
            case 1:
                hm5.M(obj);
                break;
            default:
                hm5.M(obj);
                break;
        }
        return rih1Var;
    }
}
