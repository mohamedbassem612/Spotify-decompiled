package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gg41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hg41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg41(hg41 hg41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = hg41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hg41 hg41Var = this.c;
        switch (b) {
            case 0:
                gg41 gg41Var = new gg41(hg41Var, lnmVar, (byte) 0);
                gg41Var.b = obj;
                return gg41Var;
            default:
                gg41 gg41Var2 = new gg41(hg41Var, lnmVar, (byte) 1);
                gg41Var2.b = obj;
                return gg41Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        hg41 hg41Var = this.c;
        c9n c9nVar = (c9n) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new fg41(hg41Var, null, (byte) 0), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new fg41(hg41Var, null, (byte) 1), 3);
            default:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new fg41(hg41Var, null, (byte) 2), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new fg41(hg41Var, null, (byte) 3), 3);
        }
    }
}
