package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ycf1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ svh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ycf1(svh0 svh0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = svh0Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        svh0 svh0Var = this.b;
        switch (b) {
            case 0:
                return new ycf1(svh0Var, lnmVar, (byte) 0);
            default:
                return new ycf1(svh0Var, lnmVar, (byte) 1);
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
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        svh0 svh0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!svh0Var.b) {
                    svh0Var.b = true;
                    ((o8e1) svh0Var.c).invoke();
                }
                break;
            default:
                hm5.M(obj);
                if (!svh0Var.b) {
                    svh0Var.b = true;
                    ((o8e1) svh0Var.c).invoke();
                }
                break;
        }
        return rih1Var;
    }
}
