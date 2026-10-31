package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n6q0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l6q0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6q0(l6q0 l6q0Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = l6q0Var;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        l6q0 l6q0Var = this.b;
        switch (b) {
            case 0:
                return new n6q0(l6q0Var, ven0Var, lnmVar, (byte) 0);
            default:
                return new n6q0(l6q0Var, ven0Var, lnmVar, (byte) 1);
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
        l6q0 l6q0Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                ven0Var.setValue(l6q0Var.a());
                break;
            default:
                hm5.M(obj);
                m6q0 m6q0Var = (m6q0) ven0Var.getValue();
                ven0Var.setValue(new m6q0(m6q0Var.a, l6q0Var.g));
                break;
        }
        return rih1Var;
    }
}
