package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j8c extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a8c b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8c(a8c a8cVar, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = a8cVar;
        this.c = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        int i = this.c;
        a8c a8cVar = this.b;
        switch (b) {
            case 0:
                return new j8c(a8cVar, i, lnmVar, (byte) 0);
            default:
                return new j8c(a8cVar, i, lnmVar, (byte) 1);
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
        int i = this.c;
        a8c a8cVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                a8cVar.k(new n7c(i));
                break;
            default:
                hm5.M(obj);
                a8cVar.k(new p7c(i));
                break;
        }
        return rih1Var;
    }
}
