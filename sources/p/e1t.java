package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e1t extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g1t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1t(g1t g1tVar, byte b) {
        super(2);
        this.a = b;
        this.b = g1tVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g1t g1tVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g1tVar.h.a(b0kVar2, 0);
                } else {
                    b0kVar2.b0();
                }
                return rih1.a;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (zY) {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = (qns) g1tVar.l.get();
                        x340Var2.s0(objT);
                    }
                    qns qnsVar = (qns) objT;
                    qnsVar.getClass();
                    otw.c(qnsVar, rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }
}
