package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sel1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sel1(ven0 ven0Var, vu30 vu30Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = ven0Var;
        this.c = vu30Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        vu30 vu30Var = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ven0Var.setValue(cfl1.a((cfl1) ven0Var.getValue(), false, iIntValue, 1));
                Integer numValueOf = Integer.valueOf(iIntValue);
                ijf1 ijf1Var = ijf1.a;
                vu30Var.invoke(ijf1Var, numValueOf);
                iu30Var.invoke(new aok0(ijf1Var, iIntValue, zBooleanValue));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ven0Var.setValue(cfl1.a((cfl1) ven0Var.getValue(), false, iIntValue2, 1));
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                ijf1 ijf1Var2 = ijf1.b;
                vu30Var.invoke(ijf1Var2, numValueOf2);
                iu30Var.invoke(new aok0(ijf1Var2, iIntValue2, zBooleanValue2));
                break;
        }
        return rih1Var;
    }
}
