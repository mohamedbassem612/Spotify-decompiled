package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t0f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0f(iu30 iu30Var, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                tkf tkfVar = (tkf) obj;
                iu30Var.invoke(new h2f(tkfVar.a, ((Number) obj2).intValue()));
                ven0Var.setValue(new ydx0(tkfVar.b, tkfVar.d));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ven0Var.setValue(Boolean.FALSE);
                if (!zBooleanValue) {
                    iu30Var.invoke(new m9y(iIntValue));
                } else {
                    iu30Var.invoke(new l9y(iIntValue));
                }
                break;
            default:
                ((Number) obj2).intValue();
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(new dqm0((String) obj));
                break;
        }
        return rih1Var;
    }
}
