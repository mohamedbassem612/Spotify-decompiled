package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ltm extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mtm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ltm(mtm mtmVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = mtmVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mtm mtmVar = this.b;
        switch (b) {
            case 0:
                return new ltm(mtmVar, lnmVar, (byte) 0);
            default:
                return new ltm(mtmVar, lnmVar, (byte) 1);
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
        mtm mtmVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                hma1 hma1VarEdit = mtmVar.l.a.edit();
                hma1VarEdit.a(kio0.b, true);
                hma1VarEdit.g();
                break;
            default:
                hm5.M(obj);
                mtmVar.b.a(ixb.c);
                break;
        }
        return rih1Var;
    }
}
