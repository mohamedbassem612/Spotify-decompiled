package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rpk extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ spk b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ tob1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rpk(spk spkVar, tob1 tob1Var, tob1 tob1Var2, byte b) {
        super(2);
        this.a = b;
        this.b = spkVar;
        this.c = tob1Var;
        this.d = tob1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.d;
        tob1 tob1Var2 = this.c;
        spk spkVar = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ((g1i) spkVar.c).d((gpk) tob1Var2.getValue(), (iu30) tob1Var.getValue(), (qim0) null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-499333412, new rpk(spkVar, tob1Var2, tob1Var, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
