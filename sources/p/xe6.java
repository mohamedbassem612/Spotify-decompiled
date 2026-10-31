package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xe6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hdn0 c;
    public final /* synthetic */ hdn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe6(int i, hdn0 hdn0Var, hdn0 hdn0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = i;
        this.c = hdn0Var;
        this.d = hdn0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new xe6(this.b, this.c, this.d, lnmVar, (byte) 0);
            default:
                return new xe6(this.b, this.c, this.d, lnmVar, (byte) 1);
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
        err0 err0Var = this.c;
        int i = this.b;
        err0 err0Var2 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (i != err0Var.s()) {
                    err0Var.t(i);
                    err0Var2.t(err0Var2.s() + 1);
                }
                break;
            default:
                hm5.M(obj);
                ceo ceoVar = yh6.a;
                if (i != err0Var.s()) {
                    err0Var.t(i);
                    err0Var2.t(err0Var2.s() + 1);
                }
                break;
        }
        return rih1Var;
    }
}
