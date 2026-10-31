package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class td11 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lz20 b;
    public final /* synthetic */ k6a1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td11(lz20 lz20Var, k6a1 k6a1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = lz20Var;
        this.c = k6a1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        k6a1 k6a1Var = this.c;
        lz20 lz20Var = this.b;
        switch (b) {
            case 0:
                return new td11(lz20Var, k6a1Var, lnmVar, (byte) 0);
            case 1:
                return new td11(lz20Var, k6a1Var, lnmVar, (byte) 1);
            default:
                return new td11(lz20Var, k6a1Var, lnmVar, (byte) 2);
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
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b6t b6tVar = this.c;
        lz20 lz20Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                lz20.b(lz20Var);
                if (b6tVar != null) {
                    b6tVar.b();
                }
                break;
            case 1:
                hm5.M(obj);
                lz20.b(lz20Var);
                if (b6tVar != null) {
                    b6tVar.b();
                }
                break;
            default:
                hm5.M(obj);
                lz20.b(lz20Var);
                if (b6tVar != null) {
                    b6tVar.b();
                }
                break;
        }
        return rih1Var;
    }
}
