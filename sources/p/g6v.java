package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g6v extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o5v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6v(o5v o5vVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = o5vVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        o5v o5vVar = this.b;
        switch (b) {
            case 0:
                return new g6v(o5vVar, lnmVar, (byte) 0);
            case 1:
                return new g6v(o5vVar, lnmVar, (byte) 1);
            case 2:
                return new g6v(o5vVar, lnmVar, (byte) 2);
            default:
                return new g6v(o5vVar, lnmVar, (byte) 3);
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
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
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
            case 2:
                hm5.M(obj);
                break;
            default:
                hm5.M(obj);
                break;
        }
        return rih1Var;
    }
}
