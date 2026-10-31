package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o7k0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ q7k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7k0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        q7k0 q7k0Var = (q7k0) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                o7k0 o7k0Var = new o7k0(i, lnmVar, (byte) 0);
                o7k0Var.b = q7k0Var;
                o7k0Var.invokeSuspend(rih1Var);
                break;
            default:
                o7k0 o7k0Var2 = new o7k0(i, lnmVar, (byte) 1);
                o7k0Var2.b = q7k0Var;
                o7k0Var2.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q7k0 q7k0Var = q7k0.a;
        q7k0 q7k0Var2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (u890.j(q7k0Var2, q7k0Var)) {
                    n57.e("Unexpected event: OnNoBeatmatchingIndicatorClicked");
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                hm5.M(obj);
                if (u890.j(q7k0Var2, q7k0Var)) {
                    n57.e("Unexpected event: OnNoBeatmatchingIndicatorClicked");
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
