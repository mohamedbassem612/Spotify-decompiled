package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ln61 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y441 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln61(y441 y441Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = y441Var;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        y441 y441Var = this.b;
        switch (b) {
            case 0:
                return new ln61(y441Var, ven0Var, lnmVar, (byte) 0);
            default:
                return new ln61(y441Var, ven0Var, lnmVar, (byte) 1);
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
        ven0 ven0Var = this.c;
        y441 y441Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!u890.j((kn61) ((hrr0) y441Var.d).getValue(), (kn61) ven0Var.getValue())) {
                    ((hrr0) y441Var.d).setValue((kn61) ven0Var.getValue());
                }
                break;
            default:
                hm5.M(obj);
                if (!u890.j((kn61) ((hrr0) y441Var.d).getValue(), (kn61) ven0Var.getValue())) {
                    ven0Var.setValue((kn61) ((hrr0) y441Var.d).getValue());
                }
                break;
        }
        return rih1Var;
    }
}
