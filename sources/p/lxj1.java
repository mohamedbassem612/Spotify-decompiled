package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lxj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oxj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxj1(oxj1 oxj1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = oxj1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        oxj1 oxj1Var = this.b;
        switch (b) {
            case 0:
                return new lxj1(oxj1Var, lnmVar, (byte) 0);
            case 1:
                return new lxj1(oxj1Var, lnmVar, (byte) 1);
            default:
                return new lxj1(oxj1Var, lnmVar, (byte) 2);
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
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        p3u0 p3u0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oxj1 oxj1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ejj1 ejj1Var = oxj1Var.a;
                if (ejj1Var.j && (p3u0Var = ejj1Var.d().f) != null) {
                    p3u0Var.J0(0L, false);
                }
                break;
            case 1:
                hm5.M(obj);
                oxj1Var.a.c();
                break;
            default:
                hm5.M(obj);
                oxj1Var.a.e();
                break;
        }
        return rih1Var;
    }
}
