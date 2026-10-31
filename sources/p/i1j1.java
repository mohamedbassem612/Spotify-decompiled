package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i1j1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n1j1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1j1(n1j1 n1j1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = n1j1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        n1j1 n1j1Var = this.b;
        switch (b) {
            case 0:
                return new i1j1(n1j1Var, lnmVar, (byte) 0);
            default:
                return new i1j1(n1j1Var, lnmVar, (byte) 1);
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
        n1j1 n1j1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                n1j1Var.c.e();
                break;
            default:
                hm5.M(obj);
                n1j1Var.c.h(nik1.d0.a);
                break;
        }
        return rih1Var;
    }
}
