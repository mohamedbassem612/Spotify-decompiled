package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xyk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yyk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyk(yyk yykVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = yykVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        yyk yykVar = this.b;
        switch (b) {
            case 0:
                return new xyk(yykVar, lnmVar, (byte) 0);
            default:
                return new xyk(yykVar, lnmVar, (byte) 1);
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
        yyk yykVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                yykVar.i.c("");
                break;
            default:
                hm5.M(obj);
                yykVar.j.a();
                break;
        }
        return rih1Var;
    }
}
