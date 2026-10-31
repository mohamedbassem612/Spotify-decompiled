package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class te8 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rk41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te8(boolean z, rk41 rk41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = rk41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        rk41 rk41Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                return new te8(z, rk41Var, lnmVar, (byte) 0);
            default:
                return new te8(z, rk41Var, lnmVar, (byte) 1);
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
        fgm1 fgm1Var = fgm1.a;
        rk41 rk41Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (z && !rk41Var.a) {
                    ((xgm1) rk41Var.c).a(fgm1Var);
                }
                break;
            default:
                hm5.M(obj);
                if (z && !rk41Var.a) {
                    ((xgm1) rk41Var.c).a(fgm1Var);
                }
                break;
        }
        return rih1Var;
    }
}
