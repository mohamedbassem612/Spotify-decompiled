package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zi71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aj71 b;
    public final /* synthetic */ q6q0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi71(aj71 aj71Var, q6q0 q6q0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = aj71Var;
        this.c = q6q0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        q6q0 q6q0Var = this.c;
        aj71 aj71Var = this.b;
        switch (b) {
            case 0:
                return new zi71(aj71Var, q6q0Var, lnmVar, (byte) 0);
            default:
                return new zi71(aj71Var, q6q0Var, lnmVar, (byte) 1);
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
        q6q0 q6q0Var = this.c;
        aj71 aj71Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                aj71Var.X.a(q6q0Var.a, q6q0Var.b.a, q6q0Var.c);
                break;
            default:
                hm5.M(obj);
                aj71Var.t.a(q6q0Var.a, new tv80(q6q0Var.b, (y6r0) null), q6q0Var.c);
                break;
        }
        return rih1Var;
    }
}
