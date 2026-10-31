package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tqf extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqf(ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                tqf tqfVar = new tqf(ven0Var, lnmVar, (byte) 0);
                tqfVar.b = obj;
                return tqfVar;
            default:
                tqf tqfVar2 = new tqf(ven0Var, lnmVar, (byte) 1);
                tqfVar2.b = obj;
                return tqfVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = (String) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(str, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(str, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        String str = (String) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((iu30) ven0Var.getValue()).invoke(str);
                break;
            default:
                hm5.M(obj);
                ((iu30) ven0Var.getValue()).invoke(new ncv(str));
                break;
        }
        return rih1Var;
    }
}
