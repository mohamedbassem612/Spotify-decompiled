package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w990 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hrr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w990(hrr0 hrr0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = hrr0Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        hrr0 hrr0Var = this.b;
        switch (b) {
            case 0:
                return new w990(hrr0Var, lnmVar, (byte) 0);
            case 1:
                return new w990(hrr0Var, lnmVar, (byte) 1);
            default:
                return new w990(hrr0Var, lnmVar, (byte) 2);
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
            case 1:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hrr0 hrr0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                hrr0Var.setValue(Boolean.TRUE);
                break;
            case 1:
                hm5.M(obj);
                hrr0Var.setValue(Boolean.TRUE);
                break;
            default:
                hm5.M(obj);
                hrr0Var.setValue(Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
