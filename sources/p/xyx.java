package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xyx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ ebx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyx(p811 p811Var, ebx ebxVar, byte b) {
        super(1);
        this.a = b;
        this.b = p811Var;
        this.c = ebxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ebx ebxVar = this.c;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zdj1 zdj1Var = (zdj1) p811Var.a;
                if (zdj1Var.f != 0) {
                    zdj1 zdj1VarA = zdj1.a(zdj1Var, false, !zBooleanValue, 47);
                    p811Var.a = zdj1VarA;
                    ebxVar.c.f(zdj1VarA);
                }
                break;
            default:
                zdj1 zdj1VarA2 = zdj1.a((zdj1) p811Var.a, ((Boolean) obj).booleanValue(), false, 59);
                p811Var.a = zdj1VarA2;
                ebxVar.c.f(zdj1VarA2);
                break;
        }
        return rih1Var;
    }
}
