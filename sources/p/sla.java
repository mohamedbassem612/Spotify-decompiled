package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sla extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ula b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sla(ula ulaVar, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = ulaVar;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        ula ulaVar = this.b;
        tob1 tob1Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    vnr0 vnr0Var = (vnr0) ulaVar.a.a.invoke(x340Var2, 0);
                    boolean zG = x340Var2.g(tob1Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new lq2(tob1Var, (byte) 19);
                        x340Var2.s0(objT);
                    }
                    qgo1.f(vnr0Var, i541.C(nim0Var, (iu30) objT), new a0e1(3), 0, false, (iu30) null, x340Var2, 8, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    vnr0 vnr0Var2 = (vnr0) ulaVar.a.c.invoke(x340Var4, 0);
                    boolean zG2 = x340Var4.g(tob1Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new lq2(tob1Var, (byte) 21);
                        x340Var4.s0(objT2);
                    }
                    qgo1.f(vnr0Var2, i541.C(nim0Var, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                }
                break;
        }
        return rih1Var;
    }
}
