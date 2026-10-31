package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yyg1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ azg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yyg1(azg1 azg1Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = azg1Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new yyg1(this.b, lnmVar, (byte) 0);
            default:
                return new yyg1(this.b, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                this.b.a = true;
                break;
            default:
                hm5.M(obj);
                this.b.a = true;
                break;
        }
        return rih1.a;
    }
}
