package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ye21 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ze21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye21(ze21 ze21Var, byte b) {
        super(2);
        this.a = b;
        this.b = ze21Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                ze21 ze21Var = this.b;
                hrr0 hrr0Var = ze21Var.c;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ze21Var.e(((ue21) hrr0Var.getValue()).c, ((ue21) hrr0Var.getValue()).d, ((ue21) hrr0Var.getValue()).b, null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-571746659, new ye21(this.b, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
