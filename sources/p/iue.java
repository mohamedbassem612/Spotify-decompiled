package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iue extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tbr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iue(tbr0 tbr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = tbr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        tbr0 tbr0Var = this.b;
        switch (b) {
            case 0:
                return new iue(tbr0Var, lnmVar, (byte) 0);
            case 1:
                return new iue(tbr0Var, lnmVar, (byte) 1);
            case 2:
                return new iue(tbr0Var, lnmVar, (byte) 2);
            case 3:
                return new iue(tbr0Var, lnmVar, (byte) 3);
            default:
                return new iue(tbr0Var, lnmVar, (byte) 4);
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
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
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
        tbr0 tbr0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                tbr0Var.a(new y231(new mve(ive.a)));
                break;
            case 1:
                hm5.M(obj);
                tbr0Var.a(new y231(new mve(jve.a)));
                break;
            case 2:
                hm5.M(obj);
                tbr0Var.a(new y231(hwe.a));
                break;
            case 3:
                hm5.M(obj);
                tbr0Var.a(new y231(new i8t(true)));
                break;
            default:
                hm5.M(obj);
                tbr0Var.a(l231.a);
                break;
        }
        return rih1Var;
    }
}
