package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b2c0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ur00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2c0(byte b, lnm lnmVar, ur00 ur00Var) {
        super(2, lnmVar);
        this.a = b;
        this.b = ur00Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ur00 ur00Var = this.b;
        switch (b) {
            case 0:
                return new b2c0((byte) 0, lnmVar, ur00Var);
            default:
                return new b2c0((byte) 1, lnmVar, ur00Var);
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
        ur00 ur00Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                xk xkVar = (xk) ur00Var.c;
                xkVar.a();
                xkVar.a.c();
                break;
            default:
                hm5.M(obj);
                k2c0 k2c0Var = (k2c0) ur00Var.e;
                k2c0Var.a().m(k2c0Var.c.e(), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
