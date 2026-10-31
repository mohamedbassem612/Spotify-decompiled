package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ufg extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufg(vfg vfgVar) {
        super(2);
        this.b = vfgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vfg vfgVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fq7.g(vfgVar.getState().a && vfgVar.getState().b > 0, (qim0) null, xa4.q(), xa4.r(), (String) null, apo.r(1710856689, new dwd(vfgVar, (byte) 27), x340Var2), x340Var2, 196608, 18);
                }
                break;
            default:
                ((Number) obj2).intValue();
                vfgVar.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufg(vfg vfgVar, int i) {
        super(2);
        this.b = vfgVar;
    }
}
