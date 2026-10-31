package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class igy extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k0t b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ igy(k0t k0tVar, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = k0tVar;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        k0t k0tVar = this.b;
        switch (b) {
            case 0:
                return new igy(k0tVar, ven0Var, lnmVar, (byte) 0);
            default:
                return new igy(k0tVar, ven0Var, lnmVar, (byte) 1);
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
        k0t k0tVar = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    k0tVar.c(zyz.f);
                } else {
                    k0tVar.c(zyz.e);
                }
                break;
            default:
                hm5.M(obj);
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    k0tVar.c(zyz.f);
                } else {
                    k0tVar.c(zyz.e);
                }
                break;
        }
        return rih1Var;
    }
}
