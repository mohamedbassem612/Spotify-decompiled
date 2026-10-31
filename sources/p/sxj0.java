package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sxj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ txj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxj0(txj0 txj0Var, byte b) {
        super(2);
        this.a = b;
        this.b = txj0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        txj0 txj0Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (zY) {
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        obj3 = objT;
                        c9n c9nVarM = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(c9nVarM);
                        obj3 = c9nVarM;
                    }
                    obj3 = objT;
                    c9n c9nVar = (c9n) obj3;
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (objT2 == m4cVar) {
                        haj0 haj0Var = new haj0(new dvg0(c9nVar, txj0Var, (byte) 15));
                        x340Var2.s0(haj0Var);
                        obj4 = haj0Var;
                    }
                    otw.c((haj0) obj4, rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(2094994907, new sxj0(txj0Var, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
        }
    }
}
