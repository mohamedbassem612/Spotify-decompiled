package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ue11 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ve11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue11(ve11 ve11Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ve11Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ve11 ve11Var = this.c;
        switch (b) {
            case 0:
                ue11 ue11Var = new ue11(ve11Var, lnmVar, (byte) 0);
                ue11Var.b = obj;
                return ue11Var;
            default:
                ue11 ue11Var2 = new ue11(ve11Var, lnmVar, (byte) 1);
                ue11Var2.b = obj;
                return ue11Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = (String) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(str, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(str, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ve11 ve11Var = this.c;
        String str = (String) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ve11Var.b.l(str);
                break;
            default:
                hm5.M(obj);
                ve11Var.c.l(str);
                break;
        }
        return rih1Var;
    }
}
