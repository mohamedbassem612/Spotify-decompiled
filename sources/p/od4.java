package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class od4 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ od4(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = new z9((byte) 11);
                        x340Var2.s0(objT);
                    }
                    anm1.b(0, x340Var2, (vu30) ven0Var.getValue(), s161.b(nim0.a, false, (iu30) objT));
                }
                break;
            case 1:
                ven0Var.setValue(new ofg1(guo1.E((ur80) obj, (ur80) obj2)));
                break;
            default:
                ven0Var.setValue(new ofg1(guo1.E((ur80) obj, (ur80) obj2)));
                break;
        }
        return rih1Var;
    }
}
